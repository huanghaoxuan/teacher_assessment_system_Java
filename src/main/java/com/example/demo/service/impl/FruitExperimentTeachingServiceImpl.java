package com.example.demo.service.impl;

import com.example.demo.mapper.FruitClassTeachingMapper;
import com.example.demo.mapper.FruitExperimentTeachingMapper;
import com.example.demo.model.FruitClassTeaching;
import com.example.demo.model.FruitExperimentTeaching;
import com.example.demo.service.FruitClassTeachingService;
import com.example.demo.service.FruitExperimentTeachingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo
 * @description: 课堂教学接口实现
 * @author: zalej
 * @create: 2019-05-18 14:32
 **/
@Service(value = "fruitExperimentTeachingService")
public class FruitExperimentTeachingServiceImpl implements FruitExperimentTeachingService{
    @Autowired
    private FruitExperimentTeachingMapper fruitExperimentTeachingMapper;

    @Override
    public PageInfo<FruitExperimentTeaching> getExperimentTeaching(FruitExperimentTeaching teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<FruitExperimentTeaching> teachings = fruitExperimentTeachingMapper.getExperimentTeaching(teaching);
        PageInfo<FruitExperimentTeaching> result = new PageInfo<>(teachings);
        return result;
    }
}
