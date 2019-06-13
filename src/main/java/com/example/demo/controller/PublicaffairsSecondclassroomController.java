package com.example.demo.controller;

import com.example.demo.model.PublicaffairsSecondclassroom;
import com.example.demo.model.Userinformation;
import com.example.demo.service.PublicaffairsSecondclassroomService;
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
@RequestMapping("/publicaffairsSecondclassroom")
@Api(tags = "第二课堂的数据接口")
public class PublicaffairsSecondclassroomController {
    @Autowired
    private PublicaffairsSecondclassroomService publicaffairsSecondclassroomService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询第二课堂", notes = "第二课堂查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<PublicaffairsSecondclassroom> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        PublicaffairsSecondclassroom publicaffairsSecondclassroom = new PublicaffairsSecondclassroom();
        publicaffairsSecondclassroom.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            publicaffairsSecondclassroom.setYear(Integer.parseInt(year));
        }
        return publicaffairsSecondclassroomService.selectByClassTeacher(publicaffairsSecondclassroom, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新第二课堂", notes = "第二课堂更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "活动名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "tpye", value = "指导形式", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "regularGuidance", value = "定期指导", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "occasionalGuidance", value = "不定期指导", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "time", value = "指导时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "result", value = "标志性成果", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, String tpye, String regularGuidance, String occasionalGuidance, String time, String result, String note, Integer year, String semester) {
        PublicaffairsSecondclassroom publicaffairsSecondclassroom = new PublicaffairsSecondclassroom(id, classTeacher, status, name, tpye, regularGuidance, occasionalGuidance, time, result, note, year, semester);

        return publicaffairsSecondclassroomService.updateByPrimaryKey(publicaffairsSecondclassroom);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入第二课堂", notes = "第二课堂更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "活动名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "tpye", value = "指导形式", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "regularGuidance", value = "定期指导", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "occasionalGuidance", value = "不定期指导", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "time", value = "指导时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "result", value = "标志性成果", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, String tpye, String regularGuidance, String occasionalGuidance, String time, String result, String note, Integer year, String semester) {
        PublicaffairsSecondclassroom publicaffairsSecondclassroom = new PublicaffairsSecondclassroom(classTeacher, status, name, tpye, regularGuidance, occasionalGuidance, time, result, note, year, semester);

        return publicaffairsSecondclassroomService.insert(publicaffairsSecondclassroom);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除第二课堂", notes = "删除第二课堂更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return publicaffairsSecondclassroomService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部第二课堂", notes = "查询全部第二课堂更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "工号", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "姓名", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "departmentDept", value = "所在系部", required = false, dataType = "varchar", paramType = "query"),
    })
    public PageInfo<PublicaffairsSecondclassroom> selectAll(@ApiIgnore int pageNum, int pageSize, String classTeacher, String name, String departmentDept) {
        Userinformation userinformation = new Userinformation();
        userinformation.setName(name);
        userinformation.setClassTeacher(classTeacher);
        userinformation.setDepartmentDept(departmentDept);
        return publicaffairsSecondclassroomService.selectAll(pageNum, pageSize, userinformation);
    }
}

