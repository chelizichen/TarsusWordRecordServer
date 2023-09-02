
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
public class getUsersByIdsReq extends TarsusBodyABS{
  public List<Integer> ids;


  // ListConstructor
  public getUsersByIdsReq(List<?> list){
    TarsusStream _tarsusStream = new TarsusStream(list, "getUsersByIdsReq");
        this.ids = _tarsusStream.read_list(1,"List<int>");
  
  }

  // NoArgsConstructor
  public getUsersByIdsReq(){

  }
}
  