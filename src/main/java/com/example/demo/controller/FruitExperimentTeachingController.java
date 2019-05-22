package com.example.demo.controller;

import com.example.demo.model.FruitExperimentTeaching;
import com.example.demo.service.FruitExperimentTeachingService;
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

/**
 * @program: demo
 * @description: 课堂教学控制器
 * @author: zalej
 * @create: 2019-05-18 14:19
 **/
@RestController
@RequestMapping("/fruitExperimentTeaching")
@Api(value = "FruitExperimentController|一个实验实践教学控制器")
public class FruitExperimentTeachingController {
    @Autowired
    private FruitExperimentTeachingService fruitExperimentTeachingService;

    @RequestMapping(value = "/findExperimentTeaching", method = {RequestMethod.POST})
    @ApiOperation(value = "查询实验实践教学数据", notes = "实验实践教学查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "teacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<FruitExperimentTeaching> findClassTeaching(@ApiIgnore String teacher, String year, String semester, int pageNum, int pageSize) {
        FruitExperimentTeaching fruitExperimentTeaching = new FruitExperimentTeaching();
        fruitExperimentTeaching.setTeacher(teacher);
        if (year != null && !year.equals("")) {
            fruitExperimentTeaching.setYear(Integer.parseInt(year));
        }
        if (semester != null && !semester.equals("")) {
            fruitExperimentTeaching.setSemester(Integer.parseInt(semester));
        }
        return fruitExperimentTeachingService.getExperimentTeaching(fruitExperimentTeaching, pageNum, pageSize);
    }

}
