package com.example.demo.controller;

import com.example.demo.model.OthersEmployment;
import com.example.demo.service.OthersEmploymentService;
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
@RequestMapping("/othersEmployment")
@Api(tags = "任职以来所带已毕业班级就业率考研率违纪率情况的数据接口")
public class OthersEmploymentController {
    @Autowired
    private OthersEmploymentService othersEmploymentService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询任职以来所带已毕业班级就业率考研率违纪率情况", notes = "任职以来所带已毕业班级就业率考研率违纪率情况查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<OthersEmployment> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        OthersEmployment othersEmployment = new OthersEmployment();
        othersEmployment.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            othersEmployment.setYear(Integer.parseInt(year));
        }
        return othersEmploymentService.selectByClassTeacher(othersEmployment, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新任职以来所带已毕业班级就业率考研率违纪率情况", notes = "任职以来所带已毕业班级就业率考研率违纪率情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "班级名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "employment", value = "就业率", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "graduating", value = "考研率", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "disciplinaryRate", value = "违纪率", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String name, Integer employment, Integer graduating, Integer disciplinaryRate, String note, Integer year, String classTeacher) {
        OthersEmployment othersEmployment = new OthersEmployment(id, name, employment, graduating, disciplinaryRate, note, year, classTeacher);

        return othersEmploymentService.updateByPrimaryKey(othersEmployment);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入任职以来所带已毕业班级就业率考研率违纪率情况", notes = "任职以来所带已毕业班级就业率考研率违纪率情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "班级名称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "employment", value = "就业率", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "graduating", value = "考研率", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "disciplinaryRate", value = "违纪率", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")
    })
    public Integer insert(@ApiIgnore String name, Integer employment, Integer graduating, Integer disciplinaryRate, String note, Integer year, String classTeacher) {
        OthersEmployment othersEmployment = new OthersEmployment(name, employment, graduating, disciplinaryRate, note, year, classTeacher);

        return othersEmploymentService.insert(othersEmployment);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除任职以来所带已毕业班级就业率考研率违纪率情况", notes = "删除任职以来所带已毕业班级就业率考研率违纪率情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return othersEmploymentService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部任职以来所带已毕业班级就业率考研率违纪率情况", notes = "查询全部任职以来所带已毕业班级就业率考研率违纪率情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<OthersEmployment> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return othersEmploymentService.selectAll(pageNum, pageSize);
    }
}

