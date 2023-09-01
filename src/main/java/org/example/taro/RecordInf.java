
package org.example.taro;

import org.example.struct.*;

public interface  RecordInf {
    public getUserRecordRes getUserRecord(queryIdReq req, getUserRecordRes res);
public baseRes addUserRecord(queryIdReq req, baseRes res);
public baseRes delUserRecord(queryIdReq req, baseRes res);
public baseRes setRecord(setRecordReq req, baseRes res);
public getCurrRecordLenRes getCurrRecordLen(queryIdReq req, getCurrRecordLenRes res);

  }