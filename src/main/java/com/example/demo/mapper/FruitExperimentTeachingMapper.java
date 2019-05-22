package com.example.demo.mapper;

import com.example.demo.model.FruitExperimentTeaching;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface FruitExperimentTeachingMapper extends Mapper<FruitExperimentTeaching> {
    List<FruitExperimentTeaching> getExperimentTeaching(FruitExperimentTeaching fruitExperimentTeaching);

}