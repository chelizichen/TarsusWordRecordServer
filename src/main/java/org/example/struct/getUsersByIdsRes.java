
package org.example.struct;
import com.tarsus.lib.lib_decorator.struct.TaroStruct;
import com.tarsus.lib.main_control.load_server.TarsusBodyABS;
import com.tarsus.lib.main_control.load_server.impl.TarsusStream;
import com.alibaba.fastjson.JSON;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.alibaba.fastjson.JSONObject;



@TaroStruct
public class getUsersByIdsRes extends TarsusBodyABS{
  public List<UserCache> list;


  // ListConstructor
  public getUsersByIdsRes(List<?> list){
    TarsusStream _tarsusStream = new TarsusStream(list, "getUsersByIdsRes");
        this.list = _tarsusStream.read_struct(1,"List<UserCache>");
  
  }

  // NoArgsConstructor
  public getUsersByIdsRes(){

  }
}
  