package com.example.demo.controller;

import com.example.demo.model.PublicaffairsCounselor;
import com.example.demo.service.PublicaffairsCounselorService;
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
@RequestMapping("/publicaffairsCounselor")
@Api(tags = "辅导员的数据接口")
public class PublicaffairsCounselorController {
    @Autowired
    private PublicaffairsCounselorService publicaffairsCounselorService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询辅导员", notes = "辅导员查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<PublicaffairsCounselor> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        PublicaffairsCounselor publicaffairsCounselor = new PublicaffairsCounselor();
        publicaffairsCounselor.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            publicaffairsCounselor.setYear(Integer.parseInt(year));
        }
        return publicaffairsCounselorService.selectByClassTeacher(publicaffairsCounselor, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新辅导员", notes = "辅导员更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "schoolLevel", value = "所带班级评为校级先进", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "provinceLevel", value = "所带班级评为省级先进", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "caucusLaval", value = "所带班级/党团组织", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "startTime", value = "开始时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "endTime", value = "结束时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String schoolLevel, String provinceLevel, String caucusLaval, String startTime, String endTime, String note, Integer year, String semester) {
        PublicaffairsCounselor publicaffairsCounselor = new PublicaffairsCounselor(id, classTeacher, status, schoolLevel, provinceLevel, caucusLaval, startTime, endTime, note, year, semester);

        return publicaffairsCounselorService.updateByPrimaryKey(publicaffairsCounselor);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入辅导员", notes = "辅导员更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "schoolLevel", value = "所带班级评为校级先进", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "provinceLevel", value = "所带班级评为省级先进", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "caucusLaval", value = "所带班级/党团组织", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "startTime", value = "开始时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "endTime", value = "结束时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String schoolLevel, String provinceLevel, String caucusLaval, String startTime, String endTime, String note, Integer year, String semester) {
        PublicaffairsCounselor publicaffairsCounselor = new PublicaffairsCounselor(classTeacher, status, schoolLevel, provinceLevel, caucusLaval, startTime, endTime, note, year, semester);

        return publicaffairsCounselorService.insert(publicaffairsCounselor);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除辅导员", notes = "删除辅导员更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return publicaffairsCounselorService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部辅导员", notes = "查询全部辅导员更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<PublicaffairsCounselor> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return publicaffairsCounselorService.selectAll(pageNum, pageSize);
    }
}

