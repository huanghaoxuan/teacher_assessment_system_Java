package com.example.demo.controller;

import com.example.demo.model.TeachingconstructionTextbookconstruction;
import com.example.demo.service.TeachingconstructionTextbookconstructionService;
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
@RequestMapping("/teachingconstructionTextbookconstruction")
@Api(tags = "教材建设的数据接口")
public class TeachingconstructionTextbookconstructionController {
    @Autowired
    private TeachingconstructionTextbookconstructionService teachingconstructionTextbookconstructionService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询教材建设", notes = "教材建设查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeachingconstructionTextbookconstruction> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        TeachingconstructionTextbookconstruction teachingconstructionTextbookconstruction = new TeachingconstructionTextbookconstruction();
        teachingconstructionTextbookconstruction.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            teachingconstructionTextbookconstruction.setYear(Integer.parseInt(year));
        }
        return teachingconstructionTextbookconstructionService.selectByClassTeacher(teachingconstructionTextbookconstruction, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新教材建设", notes = "教材建设更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "教材名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "press", value = "出版社", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "publicationTime", value = "出版时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "textbooksNumber", value = "教材字数", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "本人贡献", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "yesorno", value = "是否", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, String press, String publicationTime, String textbooksNumber, String character, String yesorno, String note, Integer year, String semester) {
        TeachingconstructionTextbookconstruction teachingconstructionTextbookconstruction = new TeachingconstructionTextbookconstruction(id, classTeacher, status, name, press, publicationTime, textbooksNumber, character, yesorno, note, year, semester);

        return teachingconstructionTextbookconstructionService.updateByPrimaryKey(teachingconstructionTextbookconstruction);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入教材建设", notes = "教材建设更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "教材名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "press", value = "出版社", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "publicationTime", value = "出版时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "textbooksNumber", value = "教材字数", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "本人贡献", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "yesorno", value = "是否", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, String press, String publicationTime, String textbooksNumber, String character, String yesorno, String note, Integer year, String semester) {
        TeachingconstructionTextbookconstruction teachingconstructionTextbookconstruction = new TeachingconstructionTextbookconstruction(classTeacher, status, name, press, publicationTime, textbooksNumber, character, yesorno, note, year, semester);

        return teachingconstructionTextbookconstructionService.insert(teachingconstructionTextbookconstruction);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除教材建设", notes = "删除教材建设更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return teachingconstructionTextbookconstructionService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部教材建设", notes = "查询全部教材建设更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<TeachingconstructionTextbookconstruction> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return teachingconstructionTextbookconstructionService.selectAll(pageNum, pageSize);
    }
}

