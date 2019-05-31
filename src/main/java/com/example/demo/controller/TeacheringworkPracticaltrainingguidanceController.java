package com.example.demo.controller;

import com.example.demo.model.TeacheringworkPracticaltrainingguidance;
import com.example.demo.service.TeacheringworkPracticaltrainingguidanceService;
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
@RequestMapping("/teacheringworkPracticaltrainingguidance")
@Api(tags = "实训指导的数据接口")
public class TeacheringworkPracticaltrainingguidanceController {
    @Autowired
    private TeacheringworkPracticaltrainingguidanceService teacheringworkPracticaltrainingguidanceService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询实训指导", notes = "实训指导查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeacheringworkPracticaltrainingguidance> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        TeacheringworkPracticaltrainingguidance teacheringworkPracticaltrainingguidance = new TeacheringworkPracticaltrainingguidance();
        teacheringworkPracticaltrainingguidance.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            teacheringworkPracticaltrainingguidance.setYear(Integer.parseInt(year));
        }
        return teacheringworkPracticaltrainingguidanceService.selectByClassTeacher(teacheringworkPracticaltrainingguidance, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新实训指导", notes = "实训指导更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "实训名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "credits", value = "学分", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "hours", value = "时长", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "studentNumber", value = "学生人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "loopsNumber", value = "循环次数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "trainingType", value = "实训类型", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "results", value = "成果形式", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, BigDecimal credits, BigDecimal hours, Integer studentNumber, Integer loopsNumber, String trainingType, String results, String note, Integer year, String semester) {
        TeacheringworkPracticaltrainingguidance teacheringworkPracticaltrainingguidance = new TeacheringworkPracticaltrainingguidance(id, classTeacher, status, name, credits, hours, studentNumber, loopsNumber, trainingType, results, note, year, semester);

        return teacheringworkPracticaltrainingguidanceService.updateByPrimaryKey(teacheringworkPracticaltrainingguidance);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入实训指导", notes = "实训指导更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "实训名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "credits", value = "学分", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "hours", value = "时长", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "studentNumber", value = "学生人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "loopsNumber", value = "循环次数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "trainingType", value = "实训类型", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "results", value = "成果形式", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, BigDecimal credits, BigDecimal hours, Integer studentNumber, Integer loopsNumber, String trainingType, String results, String note, Integer year, String semester) {
        TeacheringworkPracticaltrainingguidance teacheringworkPracticaltrainingguidance = new TeacheringworkPracticaltrainingguidance(classTeacher, status, name, credits, hours, studentNumber, loopsNumber, trainingType, results, note, year, semester);

        return teacheringworkPracticaltrainingguidanceService.insert(teacheringworkPracticaltrainingguidance);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除实训指导", notes = "删除实训指导更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return teacheringworkPracticaltrainingguidanceService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部实训指导", notes = "查询全部实训指导更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeacheringworkPracticaltrainingguidance> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return teacheringworkPracticaltrainingguidanceService.selectAll(pageNum, pageSize);
    }
}

