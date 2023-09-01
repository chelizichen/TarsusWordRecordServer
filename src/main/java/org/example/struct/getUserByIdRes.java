package org.example.struct;

import com.alibaba.fastjson.JSONObject;
import com.tarsus.lib.lib_decorator.struct.TaroStruct;
import com.tarsus.lib.main_control.load_server.TarsusBodyABS;
import com.tarsus.lib.main_control.load_server.impl.TarsusStream;

import java.util.List;


@TaroStruct
public class getUserByIdRes extends TarsusBodyABS {
    public Integer code;
    public String message;
    public User data;


    // ListConstructor
    public getUserByIdRes(List<?> list) {
        TarsusStream _tarsusStream = new TarsusStream(list, "getUserByIdRes");
        this.code = _tarsusStream.read_int(1);
        this.message = _tarsusStream.read_string(2);
        this.data = _tarsusStream.read_struct(3, "User");

    }

    // NoArgsConstructor
    public getUserByIdRes() {

    }

    // toJson
    @Override
    public String json() {
        Object o = JSONObject.toJSON(this);
        return o.toString();
    }
}
  