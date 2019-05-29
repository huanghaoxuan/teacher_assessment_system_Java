package com.example.demo.controller;

import com.example.demo.model.TeachingconstructionComprehensivereform;
import com.example.demo.service.TeachingconstructionComprehensivereformService;
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
@RequestMapping("/teachingconstructionComprehensivereform")
@Api(tags = "专业建设、专业综合改革的数据接口")
public class TeachingconstructionComprehensivereformController {
    @Autowired
    private TeachingconstructionComprehensivereformService teachingconstructionComprehensivereformService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询专业建设、专业综合改革", notes = "专业建设、专业综合改革查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeachingconstructionComprehensivereform> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        TeachingconstructionComprehensivereform teachingconstructionComprehensivereform = new TeachingconstructionComprehensivereform();
        teachingconstructionComprehensivereform.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            teachingconstructionComprehensivereform.setYear(Integer.parseInt(year));
        }
        return teachingconstructionComprehensivereformService.selectByClassTeacher(teachingconstructionComprehensivereform, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新专业建设、专业综合改革", notes = "专业建设、专业综合改革更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "任务角色", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "undertakingTasks", value = "承担任务", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String character, String undertakingTasks, String note, Integer year) {
        TeachingconstructionComprehensivereform teachingconstructionComprehensivereform = new TeachingconstructionComprehensivereform(id, classTeacher, status, character, undertakingTasks, note, year);

        return teachingconstructionComprehensivereformService.updateByPrimaryKey(teachingconstructionComprehensivereform);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入专业建设、专业综合改革", notes = "专业建设、专业综合改革更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "活动名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "任务角色", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "undertakingTasks", value = "承担任务", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String character, String undertakingTasks, String note, Integer year) {
        TeachingconstructionComprehensivereform teachingconstructionComprehensivereform = new TeachingconstructionComprehensivereform(classTeacher, status, character, undertakingTasks, note, year);

        return teachingconstructionComprehensivereformService.insert(teachingconstructionComprehensivereform);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除专业建设、专业综合改革", notes = "删除专业建设、专业综合改革更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return teachingconstructionComprehensivereformService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部专业建设、专业综合改革", notes = "查询全部专业建设、专业综合改革更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeachingconstructionComprehensivereform> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return teachingconstructionComprehensivereformService.selectAll(pageNum, pageSize);
    }
}

