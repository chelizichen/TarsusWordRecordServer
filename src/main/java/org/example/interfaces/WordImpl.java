package org.example.interfaces;

import com.tarsus.lib.lib_decorator.ms.TarsusInterFace;
import com.tarsus.lib.lib_decorator.ms.TarsusReflect;
import org.example.struct.*;
import org.example.taro.WordServerInf;

@TarsusReflect(proxy = "UserServer",interFace = "word")
public class WordImpl implements WordServerInf {
    @Override
    public getWordListRes getWordList(getWordListReq req, getWordListRes res) {
        return null;
    }

    @Override
    public getTranslateListRes getTranslateList(getTranslateListReq req, getTranslateListRes res) {
        return null;
    }

    @Override
    public getTranslateListRes getTranslateListById(queryIdReq req, getTranslateListRes res) {
        return null;
    }

    @Override
    public DelOrSaveRes delWordById(queryIdReq req, DelOrSaveRes res) {
        return null;
    }

    @Override
    public DelOrSaveRes delTranslateByID(queryIdReq req, DelOrSaveRes res) {
        return null;
    }

    @Override
    public DelOrSaveRes saveWord(Word req, DelOrSaveRes res) {
        return null;
    }

    @Override
    public DelOrSaveRes saveTranslate(WordTranslate req, DelOrSaveRes res) {
        return null;
    }
}
