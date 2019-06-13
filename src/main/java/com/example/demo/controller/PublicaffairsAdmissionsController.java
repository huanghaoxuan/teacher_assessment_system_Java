package com.example.demo.controller;

import com.example.demo.model.PublicaffairsAdmissions;
import com.example.demo.model.Userinformation;
import com.example.demo.service.PublicaffairsAdmissionsService;
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
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/28 23:51
 * @Version 1.0
 */

@RestController
@RequestMapping("/publicaffairsAdmissions")
@Api(tags = "招生的数据接口")
public class PublicaffairsAdmissionsController {
    @Autowired
    private PublicaffairsAdmissionsService publicaffairsAdmissionsService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询招生", notes = "招生查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<PublicaffairsAdmissions> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        PublicaffairsAdmissions publicaffairsAdmissions = new PublicaffairsAdmissions();
        publicaffairsAdmissions.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            publicaffairsAdmissions.setYear(Integer.parseInt(year));
        }
        return publicaffairsAdmissionsService.selectByClassTeacher(publicaffairsAdmissions, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新招生", notes = "招生更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "admissionsHeader", value = "招生点负责人", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "hasAdmission", value = "参与招生", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "performance", value = "招生表现", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "result", value = "招生业绩", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "address", value = "招生地点", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String admissionsHeader, String hasAdmission, String performance, String result, String address, String note, Integer year, String semester, String classTeacher, String status) {
        PublicaffairsAdmissions publicaffairsAdmissions = new PublicaffairsAdmissions(id, admissionsHeader, hasAdmission, performance, result, address, note, year, semester, classTeacher, status);

        return publicaffairsAdmissionsService.updateByPrimaryKey(publicaffairsAdmissions);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入招生", notes = "招生更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "admissionsHeader", value = "招生点负责人", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "hasAdmission", value = "参与招生", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "performance", value = "招生表现", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "result", value = "招生业绩", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "address", value = "招生地点", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String admissionsHeader, String hasAdmission, String performance, String result, String address, String note, Integer year, String semester, String classTeacher, String status) {
        PublicaffairsAdmissions publicaffairsAdmissions = new PublicaffairsAdmissions(admissionsHeader, hasAdmission, performance, result, address, note, year, semester, classTeacher, status);

        return publicaffairsAdmissionsService.insert(publicaffairsAdmissions);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除招生", notes = "删除招生更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return publicaffairsAdmissionsService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部招生", notes = "查询全部招生更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "工号", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "姓名", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "departmentDept", value = "所在系部", required = false, dataType = "varchar", paramType = "query"),
    })
    public PageInfo<PublicaffairsAdmissions> selectAll(@ApiIgnore int pageNum, int pageSize, String classTeacher, String name, String departmentDept) {
        Userinformation userinformation = new Userinformation();
        userinformation.setName(name);
        userinformation.setClassTeacher(classTeacher);
        userinformation.setDepartmentDept(departmentDept);
        return publicaffairsAdmissionsService.selectAll(pageNum, pageSize, userinformation);
    }
}

