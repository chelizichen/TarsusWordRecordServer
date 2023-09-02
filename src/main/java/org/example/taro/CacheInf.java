
package org.example.taro;

import org.example.struct.*;

public interface  CacheInf {
    public SetCacheRes setCache(SetCacheReq req, SetCacheRes res);
    public GetCacheRes GetCache(GetCacheReq req, GetCacheRes res);
    public getWordsByIdsRes getCacheWords(getWordsByIdsReq req, getWordsByIdsRes res);
    public getUsersByIdsRes getCacheUsers(getUsersByIdsReq req, getUsersByIdsRes res);

}