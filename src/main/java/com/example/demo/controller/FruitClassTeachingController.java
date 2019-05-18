package com.example.demo.controller;

import com.example.demo.model.FruitClassTeaching;
import com.example.demo.service.FruitClassTeachingService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @program: demo
 * @description: 课堂教学控制器
 * @author: zalej
 * @create: 2019-05-18 14:19
 **/
@RestController
@RequestMapping("/fruitClassTeaching")
@Api(value = "UserController|一个用户控制器")
public class FruitClassTeachingController {
    @Autowired
    private FruitClassTeachingService  fruitClassTeachingService;

    @RequestMapping(value = "/findClassTeaching", method = {RequestMethod.POST})
    @ApiOperation(value = "查询课堂教学数据", notes = "课堂教学查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<FruitClassTeaching> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize){
        FruitClassTeaching fruitClassTeaching = new FruitClassTeaching();
        fruitClassTeaching.setClassTeacher(classTeacher);
        fruitClassTeaching.setClassYear(year);
        return fruitClassTeachingService.getClassTeaching(fruitClassTeaching, pageNum, pageSize);
    }
}
