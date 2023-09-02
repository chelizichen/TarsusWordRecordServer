package org.example.interfaces;

import com.tarsus.lib.lib_decorator.ms.TarsusReflect;
import com.tarsus.lib.main_control.load_server.impl.TarsusBaseReflect;
import org.example.struct.*;
import org.example.taro.CacheInf;

@TarsusReflect(proxy = "UserServer", interFace = "cache")
public class CacheImpl extends TarsusBaseReflect implements CacheInf {

    @Override
    public SetCacheRes setCache(SetCacheReq req, SetCacheRes res) {
        return null;
    }

    @Override
    public GetCacheRes GetCache(GetCacheReq req, GetCacheRes res) {
        return null;
    }

    @Override
    public getWordsByIdsRes getCacheWords(getWordsByIdsReq req, getWordsByIdsRes res) {
        return null;
    }

    @Override
    public getUsersByIdsRes getCacheUsers(getUsersByIdsReq req, getUsersByIdsRes res) {
        return null;
    }
}
