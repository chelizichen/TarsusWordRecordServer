package org.example.struct;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tarsus.lib.lib_decorator.struct.TaroStruct;
import com.tarsus.lib.main_control.load_server.TarsusBodyABS;
import com.tarsus.lib.main_control.load_server.impl.TarsusStream;
import lombok.Data;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;


@TableName(value = "records")
public class Record {

    @TableId(type = IdType.AUTO)
    public Integer id;

    @TableField
    public String create_time;

    @TableField
    public String is_register;

    @TableField
    public String user_id;

    @TableField(exist = false)
    public String user_name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getIs_register() {
        return is_register;
    }

    public void setIs_register(String is_register) {
        this.is_register = is_register;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    // ListConstructor
    public Record(List<?> list) {
        TarsusStream _tarsusStream = new TarsusStream(list, "Record");
        this.id = _tarsusStream.read_int(1);
        this.create_time = _tarsusStream.read_string(2);
        this.is_register = _tarsusStream.read_string(3);
        this.user_id = _tarsusStream.read_string(4);
        this.user_name = _tarsusStream.read_string(5);

    }

    // NoArgsConstructor
    public Record() {

    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", create_time='" + create_time + '\'' +
                ", is_register='" + is_register + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }

    // toJson
}
  