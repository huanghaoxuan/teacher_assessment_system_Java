package com.example.demo.controller;

import com.example.demo.model.ScientificresearchPublishpaper;
import com.example.demo.service.ScientificresearchPublishpaperService;
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
@RequestMapping("/scientificresearchPublishpaper")
@Api(tags = "发表论文的数据接口")
public class ScientificresearchPublishpaperController {
    @Autowired
    private ScientificresearchPublishpaperService scientificresearchPublishpaperService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询发表论文", notes = "发表论文查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<ScientificresearchPublishpaper> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        ScientificresearchPublishpaper scientificresearchPublishpaper = new ScientificresearchPublishpaper();
        scientificresearchPublishpaper.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            scientificresearchPublishpaper.setYear(Integer.parseInt(year));
        }
        return scientificresearchPublishpaperService.selectByClassTeacher(scientificresearchPublishpaper, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新发表论文", notes = "发表论文更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "论文题目", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "journals", value = "发表期刊", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "publicationDate", value = "发表时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "level", value = "期刊级别", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "collectionInformation", value = "收录情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "任务角色", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "type", value = "论文种类", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher, String status, String name, String journals, String publicationDate, String level, String collectionInformation, String character, String type, String note, Integer year, String semester) {
        ScientificresearchPublishpaper scientificresearchPublishpaper = new ScientificresearchPublishpaper(id, classTeacher, status, name, journals, publicationDate, level, collectionInformation, character, type, note, year, semester);

        return scientificresearchPublishpaperService.updateByPrimaryKey(scientificresearchPublishpaper);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入发表论文", notes = "发表论文更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "论文题目", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "journals", value = "发表期刊", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "publicationDate", value = "发表时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "level", value = "期刊级别", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "collectionInformation", value = "收录情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "character", value = "任务角色", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "type", value = "论文种类", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "semester", value = "学期", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher, String status, String name, String journals, String publicationDate, String level, String collectionInformation, String character, String type, String note, Integer year, String semester) {
        ScientificresearchPublishpaper scientificresearchPublishpaper = new ScientificresearchPublishpaper(classTeacher, status, name, journals, publicationDate, level, collectionInformation, character, type, note, year, semester);

        return scientificresearchPublishpaperService.insert(scientificresearchPublishpaper);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除发表论文", notes = "删除发表论文更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return scientificresearchPublishpaperService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部发表论文", notes = "查询全部发表论文更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<ScientificresearchPublishpaper> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return scientificresearchPublishpaperService.selectAll(pageNum, pageSize);
    }
}

