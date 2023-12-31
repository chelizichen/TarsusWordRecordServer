package org.example.interfaces;

import com.tarsus.lib.lib_decorator.ms.TarsusInterFace;
import com.tarsus.lib.lib_decorator.ms.TarsusMethod;
import com.tarsus.lib.lib_decorator.ms.TarsusReflect;
import org.example.taro.ShareInf;
import org.example.struct.*;

@TarsusReflect(proxy = "WordNodeServer",interFace = "share")
public class ShareImpl implements ShareInf {
    @Override
    @TarsusMethod
    public getShareListRes getShareList(getListBaseReq req, getShareListRes res) {
        return null;
    }

    @Override
    public baseRes shareToUser(shareToUserReq req, baseRes res) {
        return null;
    }

    @Override
    public baseRes starShare(starShareReq req, baseRes res) {
        return null;
    }

    @Override
    public baseRes saveShare(ShareInfo req, baseRes res) {
        return null;
    }

    @Override
    public baseRes saveShareDetail(ShareDetail req, baseRes res) {
        return null;
    }

    @Override
    public baseRes delShare(queryIdReq req, baseRes res) {
        return null;
    }
}
