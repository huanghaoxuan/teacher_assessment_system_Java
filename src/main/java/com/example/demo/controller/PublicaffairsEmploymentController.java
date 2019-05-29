package com.example.demo.controller;

import com.example.demo.model.PublicaffairsEmployment;
import com.example.demo.service.PublicaffairsEmploymentService;
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
@RequestMapping("/publicaffairsEmployment")
@Api(tags = "就业的数据接口")
public class PublicaffairsEmploymentController {
    @Autowired
    private PublicaffairsEmploymentService publicaffairsEmploymentService;

    @RequestMapping(value = "/selectByClassTeacher", method = {RequestMethod.GET})
    @ApiOperation(value = "查询就业", notes = "就业查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<PublicaffairsEmployment> findClassTeaching(@ApiIgnore String classTeacher, String year, int pageNum, int pageSize) {
        PublicaffairsEmployment publicaffairsEmployment = new PublicaffairsEmployment();
        publicaffairsEmployment.setClassTeacher(classTeacher);
        if (year != null && !year.equals("")) {
            publicaffairsEmployment.setYear(Integer.parseInt(year));
        }
        return publicaffairsEmploymentService.selectByClassTeacher(publicaffairsEmployment, pageNum, pageSize);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新就业", notes = "就业更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "directEmploymentNumber", value = "直接推荐就业", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "helpConnectEmploymentNumber", value = "帮助联系就业", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "participationInEmploymentGuidanceNumber", value = "参与就业指导", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "mentoringExaminationCoursesNumber", value = "辅导考研课程", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "helpAdmitEntranceNumber", value = "帮助考研录取", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "guideEntrepreneurshipNumber", value = "指导学生成功创业", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer updateByPrimaryKey(@ApiIgnore Integer id, Integer directEmploymentNumber, Integer helpConnectEmploymentNumber, Integer participationInEmploymentGuidanceNumber, Integer mentoringExaminationCoursesNumber, Integer helpAdmitEntranceNumber, Integer guideEntrepreneurshipNumber, String note, Integer year, String classTeacher, String status) {
        PublicaffairsEmployment publicaffairsEmployment = new PublicaffairsEmployment(id, directEmploymentNumber, helpConnectEmploymentNumber, participationInEmploymentGuidanceNumber, mentoringExaminationCoursesNumber, helpAdmitEntranceNumber, guideEntrepreneurshipNumber, note, year, classTeacher, status);

        return publicaffairsEmploymentService.updateByPrimaryKey(publicaffairsEmployment);
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.POST})
    @ApiOperation(value = "插入就业", notes = "就业更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "directEmploymentNumber", value = "直接推荐就业", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "helpConnectEmploymentNumber", value = "帮助联系就业", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "participationInEmploymentGuidanceNumber", value = "参与就业指导", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "mentoringExaminationCoursesNumber", value = "辅导考研课程", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "helpAdmitEntranceNumber", value = "帮助考研录取", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "guideEntrepreneurshipNumber", value = "指导学生成功创业", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "note", value = "备注", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "year", value = "学年", required = false, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "审核情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "教师用户工号", required = true, dataType = "varchar", paramType = "query")

    })
    public Integer insert(@ApiIgnore Integer directEmploymentNumber, Integer helpConnectEmploymentNumber, Integer participationInEmploymentGuidanceNumber, Integer mentoringExaminationCoursesNumber, Integer helpAdmitEntranceNumber, Integer guideEntrepreneurshipNumber, String note, Integer year, String classTeacher, String status) {
        PublicaffairsEmployment publicaffairsEmployment = new PublicaffairsEmployment(directEmploymentNumber, helpConnectEmploymentNumber, participationInEmploymentGuidanceNumber, mentoringExaminationCoursesNumber, helpAdmitEntranceNumber, guideEntrepreneurshipNumber, note, year, classTeacher, status);

        return publicaffairsEmploymentService.insert(publicaffairsEmployment);
    }

    @RequestMapping(value = "/deleteByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "删除就业", notes = "删除就业更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "varchar", paramType = "query"),

    })
    public Integer deleteByPrimaryKey(@ApiIgnore Integer id) {

        return publicaffairsEmploymentService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "/selectAll", method = {RequestMethod.GET})
    @ApiOperation(value = "查询全部就业", notes = "查询全部就业更新接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query")
    })
    public PageInfo<PublicaffairsEmployment> selectAll(@ApiIgnore int pageNum, int pageSize) {

        return publicaffairsEmploymentService.selectAll(pageNum, pageSize);
    }
}

