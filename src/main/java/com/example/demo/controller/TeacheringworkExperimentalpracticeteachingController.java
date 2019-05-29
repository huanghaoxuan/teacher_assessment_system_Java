package com.example.demo.controller;

import com.example.demo.model.TeacheringworkExperimentalpracticeteaching;
import com.example.demo.service.TeacheringworkExperimentalpracticeteachingService;
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
@RequestMapping("/teacheringworkExperimentalpracticeteaching")
@Api(tags = "实验实践教学的数据接口")
public class TeacheringworkExperimentalpracticeteachingController {
    @Autowired
    private TeacheringworkExperimentalpracticeteachingService teacheringworkExperimentalpracticeteachingService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询实验实践教学", notes = "实验实践教学查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeacheringworkExperimentalpracticeteaching> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        TeacheringworkExperimentalpracticeteaching teacheringworkExperimentalpracticeteaching = new TeacheringworkExperimentalpracticeteaching();
        teacheringworkExperimentalpracticeteaching.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            teacheringworkExperimentalpracticeteaching.setYear(Integer.parseInt(year));
        }
        return teacheringworkExperimentalpracticeteachingService.selectByClassTeacher(teacheringworkExperimentalpracticeteaching, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新实验实践教学", notes = "实验实践教学更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "实验课程名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "角色", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "allTime", value = "总时数", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "weekTime", value = "周学时", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "studentNumber", value = "学生人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "parallelClassesNumber", value = "平行班个数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "groupingPerClassNumber", value = "每班分组次数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "instructorsNumber", value = "指导教师人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "experimentType", value = "实验类型", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "reportsNumber", value = "交试验报告次数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "correctionsNumber", value = "批改次数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, String character, BigDecimal allTime, BigDecimal weekTime, Integer studentNumber, Integer parallelClassesNumber, Integer groupingPerClassNumber, Integer instructorsNumber, String experimentType, Integer reportsNumber, Integer correctionsNumber, Integer note, Integer year, Integer semester) {
        TeacheringworkExperimentalpracticeteaching teacheringworkExperimentalpracticeteaching = new TeacheringworkExperimentalpracticeteaching(classTeacher, status, name, character, allTime, weekTime, studentNumber, parallelClassesNumber, groupingPerClassNumber, instructorsNumber, experimentType, reportsNumber, correctionsNumber, note, year, semester);

        return teacheringworkExperimentalpracticeteachingService.updateByPrimaryKey(teacheringworkExperimentalpracticeteaching);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入实验实践教学", notes = "实验实践教学更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "实验课程名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "角色", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "allTime", value = "总时数", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "weekTime", value = "周学时", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "studentNumber", value = "学生人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "parallelClassesNumber", value = "平行班个数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "groupingPerClassNumber", value = "每班分组次数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "instructorsNumber", value = "指导教师人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "experimentType", value = "实验类型", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "reportsNumber", value = "交试验报告次数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "correctionsNumber", value = "批改次数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, String character, BigDecimal allTime, BigDecimal weekTime, Integer studentNumber, Integer parallelClassesNumber, Integer groupingPerClassNumber, Integer instructorsNumber, String experimentType, Integer reportsNumber, Integer correctionsNumber, Integer note, Integer year, Integer semester) {
        TeacheringworkExperimentalpracticeteaching teacheringworkExperimentalpracticeteaching = new TeacheringworkExperimentalpracticeteaching(classTeacher, status, name, character, allTime, weekTime, studentNumber, parallelClassesNumber, groupingPerClassNumber, instructorsNumber, experimentType, reportsNumber, correctionsNumber, note, year, semester);

        return teacheringworkExperimentalpracticeteachingService.insert(teacheringworkExperimentalpracticeteaching);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除实验实践教学", notes = "删除实验实践教学更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return teacheringworkExperimentalpracticeteachingService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部实验实践教学", notes = "查询全部实验实践教学更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeacheringworkExperimentalpracticeteaching> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return teacheringworkExperimentalpracticeteachingService.selectAll(pageNum, pageSize);
    }
}

