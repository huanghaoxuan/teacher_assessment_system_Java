package com.example.demo.controller;

import com.example.demo.model.OthersComprehensiveawardwinning;
import com.example.demo.service.OthersComprehensiveawardwinningService;
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
 * @Date: 2019/5/28 22:38
 * @Version 1.0
 */

@RestController
@RequestMapping("/othersComprehensiveawardwinning")
@Api(tags = "综合获奖的数据接口")
public class othersComprehensiveawardwinningController {
    @Autowired
    private OthersComprehensiveawardwinningService othersComprehensiveawardwinningService;
    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询综合获奖情况", notes = "综合获奖情况查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<OthersComprehensiveawardwinning> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        OthersComprehensiveawardwinning othersComprehensiveawardwinning = new OthersComprehensiveawardwinning();
        othersComprehensiveawardwinning.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            othersComprehensiveawardwinning.setYear(Integer.parseInt(year));
        }
        return othersComprehensiveawardwinningService.selectByClassTeacher(othersComprehensiveawardwinning, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新综合获奖情况", notes = "综合获奖情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "荣誉称号、表彰奖励名称", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "time", value = "时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "department", value = "授奖部门", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "level", value = "获奖级别", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "ranking", value = "排名", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "peopleNumber", value = "总人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String name, String time, String department, String level, String ranking, Integer peopleNumber, String note, Integer year, String status, String classTeacher) {
        OthersComprehensiveawardwinning othersComprehensiveawardwinning = new OthersComprehensiveawardwinning( id,  name,  time,  department,  level,  ranking,  peopleNumber,  note,  year,  status,  classTeacher);

        return othersComprehensiveawardwinningService.updateByPrimaryKey(othersComprehensiveawardwinning);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入综合获奖情况", notes = "插入考核情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "荣誉称号、表彰奖励名称", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "time", value = "时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "department", value = "授奖部门", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "level", value = "获奖级别", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "ranking", value = "排名", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "peopleNumber", value = "总人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore  String name, String time, String department, String level, String ranking, Integer peopleNumber, String note, Integer year, String status, String classTeacher) {
        OthersComprehensiveawardwinning othersComprehensiveawardwinning = new OthersComprehensiveawardwinning(name, time, department, level, ranking, peopleNumber, note, year, status, classTeacher);

        return othersComprehensiveawardwinningService.insert(othersComprehensiveawardwinning);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除综合获奖情况", notes = "删除考核情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return othersComprehensiveawardwinningService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部综合获奖情况", notes = "查询全部考核情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<OthersComprehensiveawardwinning> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return othersComprehensiveawardwinningService.selectAll(pageNum, pageSize);
    }
}
