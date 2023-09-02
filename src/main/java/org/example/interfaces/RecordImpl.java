package org.example.interfaces;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tarsus.lib.lib_decorator.ms.TarsusInterFace;
import com.tarsus.lib.lib_decorator.ms.TarsusMethod;
import com.tarsus.lib.main_control.load_server.impl.Tarsus;
import org.apache.ibatis.session.SqlSession;
import org.example.components.DataComponents;
import org.example.mapper.RecordMapper;
import org.example.struct.*;
import org.example.taro.RecordInf;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@TarsusInterFace("record")
public class RecordImpl implements RecordInf {

    UserImpl userServer = new UserImpl();
    CacheImpl cache = new CacheImpl();
    DataComponents dataComponents;

    public RecordImpl() throws IOException {
        dataComponents = new DataComponents();
    }

    @Override
    @TarsusMethod
    public getUserRecordRes getUserRecord(queryIdReq req, getUserRecordRes res) {
        SqlSession session = dataComponents.getSession();
        RecordMapper mapper = session.getMapper(RecordMapper.class);
        QueryWrapper<Record> objectQueryWrapper = new QueryWrapper<>();
        objectQueryWrapper.eq("user_id", req.id);
        List<Record> records = mapper.selectList(objectQueryWrapper);
        List<Integer> userIds = records.stream().map(record ->  Integer.valueOf(record.user_id)).collect(Collectors.toList());

        getUsersByIdsReq idsReq = new getUsersByIdsReq();
        idsReq.ids = userIds;
        Map<String, String> userIdToNameMap = new HashMap<>();
        cache.ProxySendRequest("getCacheUsers",idsReq,new getUsersByIdsRes(),data->{
            data.list.stream().forEach(userCache -> {
                userIdToNameMap.put(userCache.user_id, userCache.user_name);
            });

            // 更新 records 列表中的 user_name 字段
            records.forEach(record -> {
                String userName = userIdToNameMap.getOrDefault(record.user_id, "Unknown");
                record.user_name = userName;
            });
            res.user_id = 1;
            res.data = records;
            res.message = "ok";
            res.total = records.size();
            Tarsus.asyncObserver.emit(req.__eid__, res);
            return null;
        });
        return null;
    }

    @Override
    @TarsusMethod
    public baseRes addUserRecord(queryIdReq req, baseRes res) {
        return null;
    }

    @Override
    @TarsusMethod
    public baseRes delUserRecord(queryIdReq req, baseRes res) {
        queryIdReq idsReq = new queryIdReq();
        idsReq.id = req.id;
        getUserByIdRes queryUsersNameRes = new getUserByIdRes();
        res.code = 0;
        res.message = "1";
        userServer.ProxySendRequest("getUserById", idsReq, queryUsersNameRes, data -> {
            System.out.println("再执行异步方法");
            System.out.println(data.data);
            System.out.println(data.code);
            System.out.println(data.message);
            res.code = data.code;
            res.message = data.message;
            Tarsus.asyncObserver.emit(req.__eid__, res);
            return null;
        });
        System.out.println("先执行同步方法");
        return null;
    }

    @Override
    @TarsusMethod
    public baseRes setRecord(setRecordReq req, baseRes res) {
        return null;
    }

    @Override
    @TarsusMethod
    public getCurrRecordLenRes getCurrRecordLen(queryIdReq req, getCurrRecordLenRes res) {
        return null;
    }
}
