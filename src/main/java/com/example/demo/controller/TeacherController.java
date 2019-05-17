package com.example.demo.controller;

import com.example.demo.model.Teacher;
import com.example.demo.model.User;
import com.example.demo.service.TeacherService;
import com.example.demo.service.UserService;
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
 * @description: 用户控制器demo
 * @author: zalej
 * @create: 2019-04-17 10:06
 **/
@RestController
@RequestMapping("/teacher")
@Api(value = "TeacherController|一个教师用户权限控制器")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    @ApiOperation(value="一个用来测试的方法", notes="test: 返回hello world")
    public String test() {
        return "Hello World";
    }

    @RequestMapping(value = "/getTeachers", method = {RequestMethod.GET})
    @ApiOperation(value="获取教师用户权限", notes="用户权限获取接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageName", value = "页数", required = true, dataType = "int", paramType = "query", defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query", defaultValue = "1"),
    })
    public PageInfo<Teacher> getAllUser(@ApiIgnore int pageName, int pageSize) {
        return teacherService.selectTeachers(pageName, pageSize);
    }
}
