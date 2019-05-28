package com.example.demo.service;

import com.example.demo.model.FruitClassTeaching;
import com.github.pagehelper.PageInfo;

public interface FruitClassTeachingService {
    /**
     * 查询课堂教学
    * @author:  jizhaolun@zto.cn
    * @params:  FruitClassTeaching
    * @return:  PageInfo
    * @date:    2019/5/18 14:22
    */
    PageInfo<FruitClassTeaching> getClassTeaching(FruitClassTeaching teaching, int pageNum, int pageSize);

    /**
     *更新课堂教学
    * @author:  jizhaolun@zto.cn
    * @params:
    * @return:
    * @date:    2019/5/24 14:42
    */
    int updateClassTeaching(FruitClassTeaching teaching);

    /**
     * 插入课堂教学
    * @author:  jizhaolun@zto.cn
    * @params:
    * @return:
    * @date:    2019/5/24 15:28
    */
    int insertClassTeaching(FruitClassTeaching teaching);
}
