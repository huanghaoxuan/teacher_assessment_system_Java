package com.example.demo.controller;

import com.example.demo.model.TeacheringworkGuidethegreatcreation;
import com.example.demo.service.TeacheringworkGuidethegreatcreationService;
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
@RequestMapping("/teacheringworkGuidethegreatcreation")
@Api(tags = "指导大创的数据接口")
public class TeacheringworkGuidethegreatcreationController {
    @Autowired
    private TeacheringworkGuidethegreatcreationService teacheringworkGuidethegreatcreationService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询指导大创", notes = "指导大创查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeacheringworkGuidethegreatcreation> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        TeacheringworkGuidethegreatcreation teacheringworkGuidethegreatcreation = new TeacheringworkGuidethegreatcreation();
        teacheringworkGuidethegreatcreation.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            teacheringworkGuidethegreatcreation.setYear(Integer.parseInt(year));
        }
        return teacheringworkGuidethegreatcreationService.selectByClassTeacher(teacheringworkGuidethegreatcreation, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新指导大创", notes = "指导大创更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "项目名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "level", value = "项目级别", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "source", value = "选题来源", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "projectStatus", value = "项目状况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "titleLevel", value = "结题等级", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "studentGrade", value = "学生年级", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "studentNumber", value = "学生人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "effect", value = "项目影响", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "mentorsNumber", value = "指导人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "mentorsLevel", value = "指导等级", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, String level, String source, String projectStatus, String titleLevel, String studentGrade, Integer studentNumber, String effect, Integer mentorsNumber, String mentorsLevel, String note, Integer year, Integer semester) {
        TeacheringworkGuidethegreatcreation teacheringworkGuidethegreatcreation = new TeacheringworkGuidethegreatcreation(id, classTeacher, status, name, level, source, projectStatus, titleLevel, studentGrade, studentNumber, effect, mentorsNumber, mentorsLevel, note, year, semester);

        return teacheringworkGuidethegreatcreationService.updateByPrimaryKey(teacheringworkGuidethegreatcreation);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入指导大创", notes = "指导大创更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "项目名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "level", value = "项目级别", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "source", value = "选题来源", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "projectStatus", value = "项目状况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "titleLevel", value = "结题等级", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "studentGrade", value = "学生年级", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "studentNumber", value = "学生人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "effect", value = "项目影响", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "mentorsNumber", value = "指导人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "mentorsLevel", value = "指导等级", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, String level, String source, String projectStatus, String titleLevel, String studentGrade, Integer studentNumber, String effect, Integer mentorsNumber, String mentorsLevel, String note, Integer year, Integer semester) {
        TeacheringworkGuidethegreatcreation teacheringworkGuidethegreatcreation = new TeacheringworkGuidethegreatcreation(classTeacher, status, name, level, source, projectStatus, titleLevel, studentGrade, studentNumber, effect, mentorsNumber, mentorsLevel, note, year, semester);

        return teacheringworkGuidethegreatcreationService.insert(teacheringworkGuidethegreatcreation);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除指导大创", notes = "删除指导大创更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return teacheringworkGuidethegreatcreationService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部指导大创", notes = "查询全部指导大创更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeacheringworkGuidethegreatcreation> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return teacheringworkGuidethegreatcreationService.selectAll(pageNum, pageSize);
    }
}

