package com.example.demo.controller;

import com.example.demo.model.TeacheringworkClassroomteaching;
import com.example.demo.service.TeacheringworkClassroomteachingService;
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
@RequestMapping("/teacheringworkClassroomteaching")
@Api(tags = "课堂教学的数据接口")
public class TeacheringworkClassroomteachingController {
    @Autowired
    private TeacheringworkClassroomteachingService teacheringworkClassroomteachingService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询课堂教学", notes = "课堂教学查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeacheringworkClassroomteaching> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        TeacheringworkClassroomteaching teacheringworkClassroomteaching = new TeacheringworkClassroomteaching();
        teacheringworkClassroomteaching.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            teacheringworkClassroomteaching.setYear(Integer.parseInt(year));
        }
        return teacheringworkClassroomteachingService.selectByClassTeacher(teacheringworkClassroomteaching, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新课堂教学", notes = "课堂教学更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "课程名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "课程性质", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "type", value = "授课形式", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "yesorno", value = "是否", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "credits", value = "学分", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "hours", value = "学时", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "classesNumber", value = "授课班个数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "parallelClassesNumber", value = "平行班个数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "homeworkNumber", value = "作业次数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "correctingNumber", value = "批改次数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "answeringNumber", value = "答疑次数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, String character, String type, String yesorno, BigDecimal credits, BigDecimal hours, Integer classesNumber, Integer parallelClassesNumber, Integer homeworkNumber, Integer correctingNumber, Integer answeringNumber, String note, Integer year, String semester) {
        TeacheringworkClassroomteaching teacheringworkClassroomteaching = new TeacheringworkClassroomteaching(id, classTeacher, status, name, character, type, yesorno, credits, hours, classesNumber, parallelClassesNumber, homeworkNumber, correctingNumber, answeringNumber, note, year, semester);

        return teacheringworkClassroomteachingService.updateByPrimaryKey(teacheringworkClassroomteaching);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入课堂教学", notes = "课堂教学更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "课程名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "课程性质", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "type", value = "授课形式", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "yesorno", value = "是否", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "credits", value = "学分", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "hours", value = "学时", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "classesNumber", value = "授课班个数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "parallelClassesNumber", value = "平行班个数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "homeworkNumber", value = "作业次数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "correctingNumber", value = "批改次数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "answeringNumber", value = "答疑次数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, String character, String type, String yesorno, BigDecimal credits, BigDecimal hours, Integer classesNumber, Integer parallelClassesNumber, Integer homeworkNumber, Integer correctingNumber, Integer answeringNumber, String note, Integer year, String semester) {
        TeacheringworkClassroomteaching teacheringworkClassroomteaching = new TeacheringworkClassroomteaching(classTeacher, status, name, character, type, yesorno, credits, hours, classesNumber, parallelClassesNumber, homeworkNumber, correctingNumber, answeringNumber, note, year, semester);

        return teacheringworkClassroomteachingService.insert(teacheringworkClassroomteaching);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除课堂教学", notes = "删除课堂教学更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return teacheringworkClassroomteachingService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部课堂教学", notes = "查询全部课堂教学更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "departmentDept", value = "学院", required = false, dataType = "varchar", paramType = "query")
    })
    public PageInfo<TeacheringworkClassroomteaching> selectAll(@ApiIgnore int pageNum, int pageSize, String departmentDept) {

        return teacheringworkClassroomteachingService.selectAll(pageNum, pageSize, departmentDept);
    }
}

