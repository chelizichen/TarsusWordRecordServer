
package org.example.taro;

import org.example.struct.*;


public interface  ShareInf {
    public getShareListRes getShareList(getListBaseReq req, getShareListRes res);
public baseRes shareToUser(shareToUserReq req, baseRes res);
public baseRes starShare(starShareReq req, baseRes res);
public baseRes saveShare(ShareInfo req, baseRes res);
public baseRes saveShareDetail(ShareDetail req, baseRes res);
public baseRes delShare(queryIdReq req, baseRes res);

  }