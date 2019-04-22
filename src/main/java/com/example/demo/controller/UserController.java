package com.example.demo.controller;

import com.example.demo.model.User;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.UserService;
import springfox.documentation.annotations.ApiIgnore;

import javax.xml.transform.Result;
import java.util.List;

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
    @ApiOperation(value="一个用来测试的方法", notes="test: 返回hello world")
    public String test() {
        return "Hello World";
    }


//    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/getAllUser", method = {RequestMethod.GET})
    @ApiOperation(value="获取所有用户", notes="用户获取接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageName", value = "页数", required = true, dataType = "int", paramType = "query", defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query", defaultValue = "1"),
    })
    public PageInfo<User> getAllUser(@ApiIgnore int pageName, int pageSize) {
        return userService.selectAllUser(pageName, pageSize);
    }

}
