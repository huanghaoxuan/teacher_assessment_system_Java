package com.example.demo.controller;

import com.example.demo.model.PublicaffairsSocialservices;
import com.example.demo.service.PublicaffairsSocialservicesService;
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
@RequestMapping("/publicaffairsSocialservices")
@Api(tags = "社会服务的数据接口")
public class PublicaffairsSocialservicesController {
    @Autowired
    private PublicaffairsSocialservicesService publicaffairsSocialservicesService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询社会服务", notes = "社会服务查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<PublicaffairsSocialservices> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        PublicaffairsSocialservices publicaffairsSocialservices = new PublicaffairsSocialservices();
        publicaffairsSocialservices.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            publicaffairsSocialservices.setYear(Integer.parseInt(year));
        }
        return publicaffairsSocialservicesService.selectByClassTeacher(publicaffairsSocialservices, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新社会服务", notes = "社会服务更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "活动名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "tpye", value = "参与形式", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, String tpye, String note, Integer year, String semester) {
        PublicaffairsSocialservices publicaffairsSocialservices = new PublicaffairsSocialservices(id, classTeacher, status, name, tpye, note, year, semester);

        return publicaffairsSocialservicesService.updateByPrimaryKey(publicaffairsSocialservices);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入社会服务", notes = "社会服务更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "活动名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "tpye", value = "参与形式", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, String tpye, String note, Integer year, String semester) {
        PublicaffairsSocialservices publicaffairsSocialservices = new PublicaffairsSocialservices(classTeacher, status, name, tpye, note, year, semester);

        return publicaffairsSocialservicesService.insert(publicaffairsSocialservices);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除社会服务", notes = "删除社会服务更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return publicaffairsSocialservicesService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部社会服务", notes = "查询全部社会服务更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "departmentDept", value = "学院", required = false, dataType = "varchar", paramType = "query")
    })
    public PageInfo<PublicaffairsSocialservices> selectAll(@ApiIgnore int pageNum, int pageSize, String departmentDept) {

        return publicaffairsSocialservicesService.selectAll(pageNum, pageSize, departmentDept);
    }
}

