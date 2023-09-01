package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.example.struct.Record;

import java.util.List;

public interface RecordMapper extends BaseMapper<Record> {
    @Select("select * from records  where id = 1")
    List<Record> getById1();
}
