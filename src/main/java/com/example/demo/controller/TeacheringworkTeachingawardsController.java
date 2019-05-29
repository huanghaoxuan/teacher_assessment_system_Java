package com.example.demo.controller;

import com.example.demo.model.TeacheringworkTeachingawards;
import com.example.demo.service.TeacheringworkTeachingawardsService;
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
@RequestMapping("/teacheringworkTeachingawards")
@Api(tags = "教学获奖的数据接口")
public class TeacheringworkTeachingawardsController {
    @Autowired
    private TeacheringworkTeachingawardsService teacheringworkTeachingawardsService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询教学获奖", notes = "教学获奖查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeacheringworkTeachingawards> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        TeacheringworkTeachingawards teacheringworkTeachingawards = new TeacheringworkTeachingawards();
        teacheringworkTeachingawards.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            teacheringworkTeachingawards.setYear(Integer.parseInt(year));
        }
        return teacheringworkTeachingawardsService.selectByClassTeacher(teacheringworkTeachingawards, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新教学获奖", notes = "教学获奖更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "获奖名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "type", value = "获奖类型", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "level", value = "获奖级别", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "grade", value = "获奖等级", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "指导形式", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "participantsNumber", value = "参赛人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, String type, String level, String grade, String character, Integer participantsNumber, String note, Integer year, Integer semester) {
        TeacheringworkTeachingawards teacheringworkTeachingawards = new TeacheringworkTeachingawards(id, classTeacher, status, name, type, level, grade, character, participantsNumber, note, year, semester);

        return teacheringworkTeachingawardsService.updateByPrimaryKey(teacheringworkTeachingawards);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入教学获奖", notes = "教学获奖更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "获奖名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "type", value = "获奖类型", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "level", value = "获奖级别", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "grade", value = "获奖等级", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "指导形式", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "participantsNumber", value = "参赛人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, String type, String level, String grade, String character, Integer participantsNumber, String note, Integer year, Integer semester) {
        TeacheringworkTeachingawards teacheringworkTeachingawards = new TeacheringworkTeachingawards(classTeacher, status, name, type, level, grade, character, participantsNumber, note, year, semester);

        return teacheringworkTeachingawardsService.insert(teacheringworkTeachingawards);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除教学获奖", notes = "删除教学获奖更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return teacheringworkTeachingawardsService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部教学获奖", notes = "查询全部教学获奖更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeacheringworkTeachingawards> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return teacheringworkTeachingawardsService.selectAll(pageNum, pageSize);
    }
}

