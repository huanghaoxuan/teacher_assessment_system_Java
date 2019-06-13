package com.example.demo.controller;

import com.example.demo.model.TeacheringworkGuidecontest;
import com.example.demo.model.Userinformation;
import com.example.demo.service.TeacheringworkGuidecontestService;
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
@RequestMapping("/teacheringworkGuidecontest")
@Api(tags = "指导竞赛的数据接口")
public class TeacheringworkGuidecontestController {
    @Autowired
    private TeacheringworkGuidecontestService teacheringworkGuidecontestService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询指导竞赛", notes = "指导竞赛查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeacheringworkGuidecontest> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        TeacheringworkGuidecontest teacheringworkGuidecontest = new TeacheringworkGuidecontest();
        teacheringworkGuidecontest.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            teacheringworkGuidecontest.setYear(Integer.parseInt(year));
        }
        return teacheringworkGuidecontestService.selectByClassTeacher(teacheringworkGuidecontest, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新指导竞赛", notes = "指导竞赛更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "竞赛名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "level", value = "竞赛级别", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "prizePersonsNumber", value = "特等奖人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "firstPersonsNumber", value = "一等奖人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "secondPersonsNumber", value = "二等奖人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "thirdPersonsNumber", value = "三等奖人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "outstandingAwardsNumber", value = "优秀奖人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "guidanceType", value = "指导形式", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "instructorsNumber", value = "指导教师人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, String level, Integer prizePersonsNumber, Integer firstPersonsNumber, Integer secondPersonsNumber, Integer thirdPersonsNumber, Integer outstandingAwardsNumber, String guidanceType, Integer instructorsNumber, String note, Integer year, String semester) {
        TeacheringworkGuidecontest teacheringworkGuidecontest = new TeacheringworkGuidecontest(id, classTeacher, status, name, level, prizePersonsNumber, firstPersonsNumber, secondPersonsNumber, thirdPersonsNumber, outstandingAwardsNumber, guidanceType, instructorsNumber, note, year, semester);
        if (status.equals("通过")) {
            BigDecimal score = teacheringworkGuidecontestService.getScore(level, prizePersonsNumber, firstPersonsNumber, secondPersonsNumber, thirdPersonsNumber, instructorsNumber);
            teacheringworkGuidecontest.setScore(score);
        } else if (status.equals("不通过") || status.equals("未审核")) {
            teacheringworkGuidecontest.setScore(null);
        }
        return teacheringworkGuidecontestService.updateByPrimaryKey(teacheringworkGuidecontest);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入指导竞赛", notes = "指导竞赛更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "竞赛名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "level", value = "竞赛级别", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "prizePersonsNumber", value = "特等奖人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "firstPersonsNumber", value = "一等奖人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "secondPersonsNumber", value = "二等奖人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "thirdPersonsNumber", value = "三等奖人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "outstandingAwardsNumber", value = "优秀奖人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "guidanceType", value = "指导形式", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "instructorsNumber", value = "指导教师人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, String level, Integer prizePersonsNumber, Integer firstPersonsNumber, Integer secondPersonsNumber, Integer thirdPersonsNumber, Integer outstandingAwardsNumber, String guidanceType, Integer instructorsNumber, String note, Integer year, String semester) {
        TeacheringworkGuidecontest teacheringworkGuidecontest = new TeacheringworkGuidecontest(classTeacher, status, name, level, prizePersonsNumber, firstPersonsNumber, secondPersonsNumber, thirdPersonsNumber, outstandingAwardsNumber, guidanceType, instructorsNumber, note, year, semester);

        return teacheringworkGuidecontestService.insert(teacheringworkGuidecontest);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除指导竞赛", notes = "删除指导竞赛更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return teacheringworkGuidecontestService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部指导竞赛", notes = "查询全部指导竞赛更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "工号", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "姓名", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "departmentDept", value = "所在系部", required = false, dataType = "varchar", paramType = "query"),
    })
    public PageInfo<TeacheringworkGuidecontest> selectAll(@ApiIgnore int pageNum, int pageSize, String classTeacher, String name, String departmentDept) {
        Userinformation userinformation = new Userinformation();
        userinformation.setName(name);
        userinformation.setClassTeacher(classTeacher);
        userinformation.setDepartmentDept(departmentDept);
        return teacheringworkGuidecontestService.selectAll(pageNum, pageSize, userinformation);
    }
}

