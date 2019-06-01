package com.example.demo.controller;

import com.example.demo.model.ScientificresearchPatentapplication;
import com.example.demo.service.ScientificresearchPatentapplicationService;
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
@RequestMapping("/scientificresearchPatentapplication")
@Api(tags = "申请专利的数据接口")
public class ScientificresearchPatentapplicationController {
    @Autowired
    private ScientificresearchPatentapplicationService scientificresearchPatentapplicationService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询申请专利", notes = "申请专利查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<ScientificresearchPatentapplication> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        ScientificresearchPatentapplication scientificresearchPatentapplication = new ScientificresearchPatentapplication();
        scientificresearchPatentapplication.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            scientificresearchPatentapplication.setYear(Integer.parseInt(year));
        }
        return scientificresearchPatentapplicationService.selectByClassTeacher(scientificresearchPatentapplication, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新申请专利", notes = "申请专利更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "专利名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "tpye", value = "专利类型", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "publicationDate", value = "申请时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "hasProcessing", value = "是否受理", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "hasAuthorized", value = "是否获授权", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "hasPatent", value = "是否获专利", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, String tpye, String publicationDate, String hasProcessing, String hasAuthorized, String hasPatent, String note, Integer year, String semester) {
        ScientificresearchPatentapplication scientificresearchPatentapplication = new ScientificresearchPatentapplication(id, classTeacher, status, name, tpye, publicationDate, hasProcessing, hasAuthorized, hasPatent, note, year, semester);
        if (status.equals("通过")) {
            BigDecimal score = scientificresearchPatentapplicationService.getScore(tpye);
            scientificresearchPatentapplication.setScore(score);
        } else if (status.equals("不通过") || status.equals("未审核")) {
            scientificresearchPatentapplication.setScore(null);
        }
        return scientificresearchPatentapplicationService.updateByPrimaryKey(scientificresearchPatentapplication);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入申请专利", notes = "申请专利更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "专利名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "tpye", value = "专利类型", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "publicationDate", value = "申请时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "hasProcessing", value = "是否受理", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "hasAuthorized", value = "是否获授权", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "hasPatent", value = "是否获专利", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, String tpye, String publicationDate, String hasProcessing, String hasAuthorized, String hasPatent, String note, Integer year, String semester) {
        ScientificresearchPatentapplication scientificresearchPatentapplication = new ScientificresearchPatentapplication(classTeacher, status, name, tpye, publicationDate, hasProcessing, hasAuthorized, hasPatent, note, year, semester);

        return scientificresearchPatentapplicationService.insert(scientificresearchPatentapplication);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除申请专利", notes = "删除申请专利更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return scientificresearchPatentapplicationService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部申请专利", notes = "查询全部申请专利更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<ScientificresearchPatentapplication> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return scientificresearchPatentapplicationService.selectAll(pageNum, pageSize);
    }
}

