package com.example.demo.controller;

import com.example.demo.model.TeachingconstructionTeachingactivities;
import com.example.demo.service.TeachingconstructionTeachingactivitiesService;
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

import java.math.BigDecimal;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/28 23:51
 * @Version 1.0
 */

@RestController
@RequestMapping("/teachingconstructionTeachingactivities")
@Api(tags = "日常教研活动内容的数据接口")
public class TeachingconstructionTeachingactivitiesController {
    @Autowired
    private TeachingconstructionTeachingactivitiesService teachingconstructionTeachingactivitiesService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询日常教研活动内容", notes = "日常教研活动内容查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeachingconstructionTeachingactivities> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        TeachingconstructionTeachingactivities teachingconstructionTeachingactivities = new TeachingconstructionTeachingactivities();
        teachingconstructionTeachingactivities.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            teachingconstructionTeachingactivities.setYear(Integer.parseInt(year));
        }
        return teachingconstructionTeachingactivitiesService.selectByClassTeacher(teachingconstructionTeachingactivities, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新日常教研活动内容", notes = "日常教研活动内容更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "absent", value = "缺席扣分", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "lateDeparture", value = "迟到早退扣分", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, BigDecimal absent, BigDecimal lateDeparture, String note, Integer year, String semester) {
        TeachingconstructionTeachingactivities teachingconstructionTeachingactivities = new TeachingconstructionTeachingactivities(id, classTeacher, status, absent, lateDeparture, note, year, semester);

        return teachingconstructionTeachingactivitiesService.updateByPrimaryKey(teachingconstructionTeachingactivities);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入日常教研活动内容", notes = "日常教研活动内容更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "absent", value = "缺席扣分", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "lateDeparture", value = "迟到早退扣分", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, BigDecimal absent, BigDecimal lateDeparture, String note, Integer year, String semester) {
        TeachingconstructionTeachingactivities teachingconstructionTeachingactivities = new TeachingconstructionTeachingactivities(classTeacher, status, absent, lateDeparture, note, year, semester);

        return teachingconstructionTeachingactivitiesService.insert(teachingconstructionTeachingactivities);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除日常教研活动内容", notes = "删除日常教研活动内容更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return teachingconstructionTeachingactivitiesService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部日常教研活动内容", notes = "查询全部日常教研活动内容更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeachingconstructionTeachingactivities> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return teachingconstructionTeachingactivitiesService.selectAll(pageNum, pageSize);
    }
}

