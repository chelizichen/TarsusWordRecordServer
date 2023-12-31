
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
public class GetCacheReq extends TarsusBodyABS{
  public String key;
public List<String> keys;


  // ListConstructor
  public GetCacheReq(List<?> list){
    TarsusStream _tarsusStream = new TarsusStream(list, "GetCacheReq");
        this.key = _tarsusStream.read_string(1);
    this.keys = _tarsusStream.read_list(2,"List<string>");
  
  }

  // NoArgsConstructor
  public GetCacheReq(){

  }
}
  