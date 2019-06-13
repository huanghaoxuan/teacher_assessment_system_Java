package com.example.demo.controller;

import com.example.demo.model.TeachingconstructionTeachingtopics;
import com.example.demo.model.Userinformation;
import com.example.demo.service.TeachingconstructionTeachingtopicsService;
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
@RequestMapping("/teachingconstructionTeachingtopics")
@Api(tags = "承担教研教改课题的数据接口")
public class TeachingconstructionTeachingtopicsController {
    @Autowired
    private TeachingconstructionTeachingtopicsService teachingconstructionTeachingtopicsService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询承担教研教改课题", notes = "承担教研教改课题查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeachingconstructionTeachingtopics> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        TeachingconstructionTeachingtopics teachingconstructionTeachingtopics = new TeachingconstructionTeachingtopics();
        teachingconstructionTeachingtopics.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            teachingconstructionTeachingtopics.setYear(Integer.parseInt(year));
        }
        return teachingconstructionTeachingtopicsService.selectByClassTeacher(teachingconstructionTeachingtopics, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新承担教研教改课题", notes = "承担教研教改课题更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "活动名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "source", value = "课题来源", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "任务角色", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "type", value = "课题性质", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "condition", value = "项目状况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "startTime", value = "立项时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "endTime", value = "结题时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "result", value = "项目质量", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, String source, String character, String type, String condition, String startTime, String endTime, String result, String note, Integer year, String semester) {
        TeachingconstructionTeachingtopics teachingconstructionTeachingtopics = new TeachingconstructionTeachingtopics(id, classTeacher, status, name, source, character, type, condition, startTime, endTime, result, note, year, semester);

        return teachingconstructionTeachingtopicsService.updateByPrimaryKey(teachingconstructionTeachingtopics);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入承担教研教改课题", notes = "承担教研教改课题更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "活动名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "source", value = "课题来源", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "任务角色", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "type", value = "课题性质", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "condition", value = "项目状况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "startTime", value = "立项时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "endTime", value = "结题时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "result", value = "项目质量", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, String source, String character, String type, String condition, String startTime, String endTime, String result, String note, Integer year, String semester) {
        TeachingconstructionTeachingtopics teachingconstructionTeachingtopics = new TeachingconstructionTeachingtopics(classTeacher, status, name, source, character, type, condition, startTime, endTime, result, note, year, semester);

        return teachingconstructionTeachingtopicsService.insert(teachingconstructionTeachingtopics);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除承担教研教改课题", notes = "删除承担教研教改课题更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return teachingconstructionTeachingtopicsService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部承担教研教改课题", notes = "查询全部承担教研教改课题更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "工号", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "姓名", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "departmentDept", value = "所在系部", required = false, dataType = "varchar", paramType = "query"),
    })
    public PageInfo<TeachingconstructionTeachingtopics> selectAll(@ApiIgnore int pageNum, int pageSize, String classTeacher, String name, String departmentDept) {
        Userinformation userinformation = new Userinformation();
        userinformation.setName(name);
        userinformation.setClassTeacher(classTeacher);
        userinformation.setDepartmentDept(departmentDept);
        return teachingconstructionTeachingtopicsService.selectAll(pageNum, pageSize, userinformation);
    }
}

