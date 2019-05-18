package com.example.demo.controller;

import com.example.demo.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.UserService;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @program: demo
 * @description: 用户控制器demo
 * @author: zalej
 * @create: 2019-04-17 10:06
 **/
@RestController
@RequestMapping("/user")
@Api(value = "UserController|一个用户控制器")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    @ApiOperation(value="一个没有任何卵用的方法", notes="test: 返回hello world")
    public String test() {
        return "Hello World";
    }

    @RequestMapping(value = "/accessTeacher", method = {RequestMethod.POST})
    @ApiOperation(value = "检查教师用户权限", notes = "教师用户数据获取接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "pass", value = "密码", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "identity", value = "身份", required = true, dataType = "varchar", paramType = "query")
    })
    public boolean accessTeacher(@ApiIgnore String name, String pass, String identity){
        User teacher = new User();
        teacher.setAccessName(name);
        teacher.setAccessPass(pass);
        teacher.setAccessIdentity(identity);
        if (userService.getTeacher(teacher, 1, 1).getSize() == 1){
            return true;
        }
        return false;
    }
}
