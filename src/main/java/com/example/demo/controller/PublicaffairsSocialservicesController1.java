package com.example.demo.controller;

import com.example.demo.model.TeachingconstructionLaboratoryconstruction;
import com.example.demo.service.TeachingconstructionLaboratoryconstructionService;
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
@RequestMapping("/teachingconstructionLaboratoryconstruction")
@Api(tags = "实验室建设的数据接口")
public class TeachingconstructionLaboratoryconstructionController1 {
    @Autowired
    private TeachingconstructionLaboratoryconstructionService teachingconstructionLaboratoryconstructionService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询实验室建设", notes = "实验室建设查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeachingconstructionLaboratoryconstruction> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        TeachingconstructionLaboratoryconstruction teachingconstructionLaboratoryconstruction = new TeachingconstructionLaboratoryconstruction();
        teachingconstructionLaboratoryconstruction.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            teachingconstructionLaboratoryconstruction.setYear(Integer.parseInt(year));
        }
        return teachingconstructionLaboratoryconstructionService.selectByClassTeacher(teachingconstructionLaboratoryconstruction, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新实验室建设", notes = "实验室建设更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "开发实验项目名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "任务角色", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "contribution", value = "本人贡献", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "hours", value = "对应学时", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "peopleNumber", value = "收益人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "professional", value = "适用专业", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "grade", value = "适用年级", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "controlDeviceName", value = "自制装置名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "reformingDeviceName", value = "改制装置名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "money", value = "节省经费数", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, String contribution, BigDecimal hours, Integer peopleNumber, String professional, String grade, String controlDeviceName, String reformingDeviceName, String money, String note, Integer year) {
        TeachingconstructionLaboratoryconstruction teachingconstructionLaboratoryconstruction = new TeachingconstructionLaboratoryconstruction(id, classTeacher, status, name, contribution, hours, peopleNumber, professional, grade, controlDeviceName, reformingDeviceName, money, note, year);

        return teachingconstructionLaboratoryconstructionService.updateByPrimaryKey(teachingconstructionLaboratoryconstruction);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入实验室建设", notes = "实验室建设更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "开发实验项目名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "任务角色", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "contribution", value = "本人贡献", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "hours", value = "对应学时", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "peopleNumber", value = "收益人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "professional", value = "适用专业", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "grade", value = "适用年级", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "controlDeviceName", value = "自制装置名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "reformingDeviceName", value = "改制装置名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "money", value = "节省经费数", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, String contribution, BigDecimal hours, Integer peopleNumber, String professional, String grade, String controlDeviceName, String reformingDeviceName, String money, String note, Integer year) {
        TeachingconstructionLaboratoryconstruction teachingconstructionLaboratoryconstruction = new TeachingconstructionLaboratoryconstruction(classTeacher, status, name, contribution, hours, peopleNumber, professional, grade, controlDeviceName, reformingDeviceName, money, note, year);

        return teachingconstructionLaboratoryconstructionService.insert(teachingconstructionLaboratoryconstruction);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除实验室建设", notes = "删除实验室建设更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return teachingconstructionLaboratoryconstructionService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部实验室建设", notes = "查询全部实验室建设更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeachingconstructionLaboratoryconstruction> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return teachingconstructionLaboratoryconstructionService.selectAll(pageNum, pageSize);
    }
}

