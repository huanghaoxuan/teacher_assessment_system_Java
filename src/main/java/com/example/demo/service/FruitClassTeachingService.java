package com.example.demo.service;

import com.example.demo.model.FruitClassTeaching;
import com.github.pagehelper.PageInfo;

public interface FruitClassTeachingService {
    /**
    * @author:  jizhaolun@zto.cn
    * @params:  FruitClassTeaching
    * @return:  PageInfo
    * @date:    2019/5/18 14:22
    */
    PageInfo<FruitClassTeaching> getClassTeaching(FruitClassTeaching teaching, int pageNum, int pageSize);
}
