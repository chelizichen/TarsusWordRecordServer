package org.example.struct;

import com.alibaba.fastjson.JSONObject;
import com.tarsus.lib.lib_decorator.struct.TaroStruct;
import com.tarsus.lib.main_control.load_server.TarsusBodyABS;
import com.tarsus.lib.main_control.load_server.impl.TarsusStream;

import java.util.List;


@TaroStruct
public class getShareListRes extends TarsusBodyABS {
    public Integer code;
    public String message;
    public List<ShareInfo> list;
    public Integer total;


    // ListConstructor
    public getShareListRes(List<?> list) {
        TarsusStream _tarsusStream = new TarsusStream(list, "getShareListRes");
        this.code = _tarsusStream.read_int(1);
        this.message = _tarsusStream.read_string(2);
        this.list = _tarsusStream.read_struct(3, "List<ShareInfo>");
        this.total = _tarsusStream.read_int(4);

    }

    // NoArgsConstructor
    public getShareListRes() {

    }

    // toJson
    @Override
    public String json() {
        Object o = JSONObject.toJSON(this);
        return o.toString();
    }
}
  