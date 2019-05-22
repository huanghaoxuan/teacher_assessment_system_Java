package com.example.demo.service;

import com.example.demo.model.FruitClassTeaching;
import com.example.demo.model.FruitExperimentTeaching;
import com.github.pagehelper.PageInfo;

public interface FruitExperimentTeachingService {
    /**
    * @author:  jizhaolun@zto.cn
    * @params:  FruitClassTeaching
    * @return:  PageInfo
    * @date:    2019/5/18 14:22
    */
    PageInfo<FruitExperimentTeaching> getExperimentTeaching(FruitExperimentTeaching teaching, int pageNum, int pageSize);
}
