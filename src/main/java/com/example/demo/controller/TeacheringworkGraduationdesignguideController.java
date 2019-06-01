package com.example.demo.controller;

import com.example.demo.model.TeacheringworkGraduationdesignguide;
import com.example.demo.service.TeacheringworkGraduationdesignguideService;
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
@RequestMapping("/teacheringworkGraduationdesignguide")
@Api(tags = "毕业设计指导的数据接口")
public class TeacheringworkGraduationdesignguideController {
    @Autowired
    private TeacheringworkGraduationdesignguideService teacheringworkGraduationdesignguideService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询毕业设计指导", notes = "毕业设计指导查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeacheringworkGraduationdesignguide> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        TeacheringworkGraduationdesignguide teacheringworkGraduationdesignguide = new TeacheringworkGraduationdesignguide();
        teacheringworkGraduationdesignguide.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            teacheringworkGraduationdesignguide.setYear(Integer.parseInt(year));
        }
        return teacheringworkGraduationdesignguideService.selectByClassTeacher(teacheringworkGraduationdesignguide, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新毕业设计指导", notes = "毕业设计指导更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "毕业设计名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "指导形式", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "level", value = "获奖级别", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "winnersNumber", value = "获奖人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, String character, String level, Integer winnersNumber, String note, Integer year, String semester) {
        TeacheringworkGraduationdesignguide teacheringworkGraduationdesignguide = new TeacheringworkGraduationdesignguide(id, classTeacher, status, name, character, level, winnersNumber, note, year, semester);
        if (status.equals("通过")) {
            BigDecimal score = teacheringworkGraduationdesignguideService.getScore(level, winnersNumber);
            teacheringworkGraduationdesignguide.setScore(score);
        } else if (status.equals("不通过") || status.equals("未审核")) {
            teacheringworkGraduationdesignguide.setScore(null);
        }
        return teacheringworkGraduationdesignguideService.updateByPrimaryKey(teacheringworkGraduationdesignguide);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入毕业设计指导", notes = "毕业设计指导更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "毕业设计名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "指导形式", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "level", value = "获奖级别", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "winnersNumber", value = "获奖人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, String character, String level, Integer winnersNumber, String note, Integer year, String semester) {
        TeacheringworkGraduationdesignguide teacheringworkGraduationdesignguide = new TeacheringworkGraduationdesignguide(classTeacher, status, name, character, level, winnersNumber, note, year, semester);

        return teacheringworkGraduationdesignguideService.insert(teacheringworkGraduationdesignguide);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除毕业设计指导", notes = "删除毕业设计指导更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return teacheringworkGraduationdesignguideService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部毕业设计指导", notes = "查询全部毕业设计指导更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeacheringworkGraduationdesignguide> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return teacheringworkGraduationdesignguideService.selectAll(pageNum, pageSize);
    }
}

