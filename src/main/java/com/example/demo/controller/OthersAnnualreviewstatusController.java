package com.example.demo.controller;

import com.example.demo.model.OthersAnnualreviewstatus;
import com.example.demo.service.OthersAnnualreviewstatusService;
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

@RestController
@RequestMapping("/othersAnnualreviewstatus")
@Api(tags = "年度考核情况的数据接口")
public class OthersAnnualreviewstatusController {

    @Autowired
    private OthersAnnualreviewstatusService othersAnnualreviewstatusService;
    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询年度考核情况", notes = "年度考核情况查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<OthersAnnualreviewstatus> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        OthersAnnualreviewstatus othersAnnualreviewstatus = new OthersAnnualreviewstatus();
        othersAnnualreviewstatus.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            othersAnnualreviewstatus.setYear(Integer.parseInt(year));
        }
        return othersAnnualreviewstatusService.selectByClassTeacher(othersAnnualreviewstatus, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新年度考核情况", notes = "年度考核情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "assessmentStatus", value = "考核情况", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, String classTeacher,String assessmentStatus,String note,Integer year,String status) {
        OthersAnnualreviewstatus othersAnnualreviewstatus = new OthersAnnualreviewstatus(id,assessmentStatus,note,year,status,classTeacher);

        return othersAnnualreviewstatusService.updateByPrimaryKey(othersAnnualreviewstatus);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入年度考核情况", notes = "插入考核情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "assessmentStatus", value = "考核情况", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore String classTeacher,String assessmentStatus,String note,Integer year,String status) {
        OthersAnnualreviewstatus othersAnnualreviewstatus = new OthersAnnualreviewstatus(assessmentStatus,note,year,status,classTeacher);

        return othersAnnualreviewstatusService.insert(othersAnnualreviewstatus);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除年度考核情况", notes = "删除考核情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return othersAnnualreviewstatusService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部年度考核情况", notes = "查询全部考核情况更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<OthersAnnualreviewstatus> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return othersAnnualreviewstatusService.selectAll(pageNum, pageSize);
    }


}
