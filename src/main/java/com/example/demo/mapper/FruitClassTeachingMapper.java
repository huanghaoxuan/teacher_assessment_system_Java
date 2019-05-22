package com.example.demo.mapper;

import com.example.demo.model.FruitClassTeaching;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface FruitClassTeachingMapper extends Mapper<FruitClassTeaching> {
    List<FruitClassTeaching> getClassTeaching(FruitClassTeaching fruitClassTeaching);

}
