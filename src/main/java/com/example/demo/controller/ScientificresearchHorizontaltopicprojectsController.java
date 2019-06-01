package com.example.demo.controller;

import com.example.demo.model.ScientificresearchHorizontaltopicprojects;
import com.example.demo.service.ScientificresearchHorizontaltopicprojectsService;
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
@RequestMapping("/scientificresearchHorizontaltopicprojects")
@Api(tags = "横向课题项目的数据接口")
public class ScientificresearchHorizontaltopicprojectsController {
    @Autowired
    private ScientificresearchHorizontaltopicprojectsService scientificresearchHorizontaltopicprojectsService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询横向课题项目", notes = "横向课题项目查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<ScientificresearchHorizontaltopicprojects> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        ScientificresearchHorizontaltopicprojects scientificresearchHorizontaltopicprojects = new ScientificresearchHorizontaltopicprojects();
        scientificresearchHorizontaltopicprojects.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            scientificresearchHorizontaltopicprojects.setYear(Integer.parseInt(year));
        }
        return scientificresearchHorizontaltopicprojectsService.selectByClassTeacher(scientificresearchHorizontaltopicprojects, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新横向课题项目", notes = "横向课题项目更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "项目名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "source", value = "项目来源", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "任务角色", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "money", value = "项目经费", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "startTime", value = "立项时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "estimatedClosingTime", value = "预计结题时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "result", value = "结题结论", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, String source, String character, BigDecimal money, String startTime, String estimatedClosingTime, String result, String note, Integer year, String semester) {
        ScientificresearchHorizontaltopicprojects scientificresearchHorizontaltopicprojects = new ScientificresearchHorizontaltopicprojects(id, classTeacher, status, name, source, character, money, startTime, estimatedClosingTime, result, note, year, semester);
        if (status.equals("通过")) {
            BigDecimal score = scientificresearchHorizontaltopicprojectsService.getScore(money);
            scientificresearchHorizontaltopicprojects.setScore(score);
        } else if (status.equals("不通过") || status.equals("未审核")) {
            scientificresearchHorizontaltopicprojects.setScore(null);
        }
        return scientificresearchHorizontaltopicprojectsService.updateByPrimaryKey(scientificresearchHorizontaltopicprojects);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入横向课题项目", notes = "横向课题项目更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "项目名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "source", value = "项目来源", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "任务角色", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "money", value = "项目经费", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "startTime", value = "立项时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "estimatedClosingTime", value = "预计结题时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "result", value = "结题结论", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, String source, String character, BigDecimal money, String startTime, String estimatedClosingTime, String result, String note, Integer year, String semester) {
        ScientificresearchHorizontaltopicprojects scientificresearchHorizontaltopicprojects = new ScientificresearchHorizontaltopicprojects(classTeacher, status, name, source, character, money, startTime, estimatedClosingTime, result, note, year, semester);

        return scientificresearchHorizontaltopicprojectsService.insert(scientificresearchHorizontaltopicprojects);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除横向课题项目", notes = "删除横向课题项目更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return scientificresearchHorizontaltopicprojectsService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部横向课题项目", notes = "查询全部横向课题项目更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<ScientificresearchHorizontaltopicprojects> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return scientificresearchHorizontaltopicprojectsService.selectAll(pageNum, pageSize);
    }
}

