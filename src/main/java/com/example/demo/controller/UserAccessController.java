package com.example.demo.controller;

import com.example.demo.model.UserAccess;
import com.example.demo.service.UserAccessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/userAccess")
@Api(tags = "用户权限，账号密码的数据接口")
public class UserAccessController {

    @Autowired
    private UserAccessService userAccessService;

    @RequestMapping(value = "/selectByNamePassword", method = {RequestMethod.GET})
    @ApiOperation(value = "查询用户权限，账号密码", notes = "用户权限，账号密码查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "access_name", value = "账号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "access_pass", value = "密码", required = false, dataType = "varchar", paramType = "query"),

    })
    public int selectByNamePassword(@ApiIgnore String access_name, String access_pass) {
        UserAccess userAccess = new UserAccess(access_name, access_pass);
        return userAccessService.selectByNamePassword(userAccess);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "注册新账号", notes = "注册新账号接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "access_name", value = "账号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "access_pass", value = "密码", required = false, dataType = "varchar", paramType = "query"),

    })
    public int insert(@ApiIgnore String access_name, String access_pass) {
        UserAccess userAccess = new UserAccess(access_name, access_pass, 1);
        return userAccessService.insert(userAccess);
    }

    @RequestMapping(value = "/updateIdentity", method = {RequestMethod.POST})
    @ApiOperation(value = "更新账号权限", notes = "更新账号权限")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "access_name", value = "账号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "access_identity", value = "权限", required = true, dataType = "int", paramType = "query"),

    })
    public int updateIdentity(@ApiIgnore String access_name, Integer access_identity) {
        UserAccess userAccess = new UserAccess();
        userAccess.setAccess_name(access_name);
        userAccess.setAccess_identity(access_identity);
        return userAccessService.updateIdentity(userAccess);
    }


    @RequestMapping(value = "/updateNamePassword", method = {RequestMethod.POST})
    @ApiOperation(value = "修改密码", notes = "修改密码接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "access_name", value = "账号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "old_access_pass", value = "旧的密码", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "access_pass", value = "密码", required = false, dataType = "varchar", paramType = "query"),

    })
    public int updateNamePassword(@ApiIgnore String access_name, String access_pass, String old_access_pass) {
        UserAccess olduserAccess = new UserAccess(access_name, old_access_pass);
        UserAccess newuserAccess = new UserAccess(access_name, access_pass);
        return userAccessService.updateNamePassword(olduserAccess, newuserAccess);
    }


    @RequestMapping(value = "/forgetNamePassword", method = {RequestMethod.POST})
    @ApiOperation(value = "忘记密码", notes = "忘记密码时更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "access_name", value = "账号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "access_pass", value = "密码", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "验证码", required = true, dataType = "int", paramType = "query"),

    })
    public int forgetNamePassword(@ApiIgnore String access_name, String access_pass, Integer token, HttpServletRequest request) {
        HttpSession session = request.getSession();
        int token_v = (int) session.getAttribute("token"); //正确的验证码
        session.removeAttribute("token");
        //System.out.println(token_v);
        if (token_v == token) {
            UserAccess userAccess = new UserAccess(access_name, access_pass);
            return userAccessService.updateNamePassword(userAccess);
        } else {
            return 0;
        }
    }


}
