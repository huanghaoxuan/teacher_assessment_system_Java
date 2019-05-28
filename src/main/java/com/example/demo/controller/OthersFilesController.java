package com.example.demo.controller;

import com.example.demo.model.OthersFiles;
import com.example.demo.service.OthersFilesService;
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
@RequestMapping("/othersFiles")
@Api(tags = "任职以来起草、制定的重要文件、报告的数据接口")
public class OthersFilesController {
    @Autowired
    private OthersFilesService othersFilesService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询任职以来起草、制定的重要文件、报告情况", notes = "任职以来起草、制定的重要文件、报告情况查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<OthersFiles> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        OthersFiles othersFiles = new OthersFiles();
        othersFiles.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            othersFiles.setYear(Integer.parseInt(year));
        }
        return othersFilesService.selectByClassTeacher(othersFiles, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新任职以来起草、制定的重要文件、报告情况", notes = "任职以来起草、制定的重要文件、报告情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "文件、报告题目", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "time", value = "时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "rank", value = "本人排名", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "peopleNumber", value = "总人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "useScope", value = "使用范围及产生效益", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String name, String time, String rank, Integer peopleNumber, String useScope, String note, Integer year, String status, String classTeacher) {
        OthersFiles othersFiles = new OthersFiles(id, name, time, rank, peopleNumber, useScope, note, year, status, classTeacher);

        return othersFilesService.updateByPrimaryKey(othersFiles);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入任职以来起草、制定的重要文件、报告情况", notes = "任职以来起草、制定的重要文件、报告情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "文件、报告题目", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "time", value = "时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "rank", value = "本人排名", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "peopleNumber", value = "总人数", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "useScope", value = "使用范围及产生效益", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")
    })
    public Integer insert(@ApiIgnore String name, String time, String rank, Integer peopleNumber, String useScope, String note, Integer year, String status, String classTeacher) {
        OthersFiles othersFiles = new OthersFiles(name, time, rank, peopleNumber, useScope, note, year, status, classTeacher);

        return othersFilesService.insert(othersFiles);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除任职以来起草、制定的重要文件、报告情况", notes = "删除任职以来起草、制定的重要文件、报告情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return othersFilesService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部任职以来起草、制定的重要文件、报告情况", notes = "查询全部任职以来起草、制定的重要文件、报告情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<OthersFiles> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return othersFilesService.selectAll(pageNum, pageSize);
    }
}

