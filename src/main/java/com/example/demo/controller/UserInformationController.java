package com.example.demo.controller;

import com.example.demo.model.Userinformation;
import com.example.demo.service.UserinformationService;
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

@RestController
@RequestMapping("/userinformation")
@Api(tags = "用户个人资料的数据接口")
public class UserInformationController {

    @Autowired
    private UserinformationService userinformationService;

    @RequestMapping(value = "/selectUserinformation", method = {RequestMethod.GET})
    @ApiOperation(value = "查询个人资料", notes = "通过工号 用户个人资料查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "工号", required = true, dataType = "varchar", paramType = "query"),

    })
    public Userinformation selectUserinformation(@ApiIgnore String classTeacher) {
        Userinformation userinformation = new Userinformation();
        userinformation.setClassTeacher(classTeacher);
        return userinformationService.selectByClassTeacher(userinformation);
    }

    @RequestMapping(value = "/selectUserinformation/findUser", method = {RequestMethod.GET})
    @ApiOperation(value = "查询个人资料", notes = "通过各种查询条件用户个人资料查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "工号", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "姓名", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "departmentDept", value = "所在系部", required = false, dataType = "varchar", paramType = "query"),

    })
    public PageInfo<Userinformation> selectUserinformationByName(@ApiIgnore int pageNum, int pageSize, String classTeacher, String name, String departmentDept) {
        Userinformation userinformation = new Userinformation();
        userinformation.setName(name);
        userinformation.setClassTeacher(classTeacher);
        userinformation.setDepartmentDept(departmentDept);
        return userinformationService.selectByUserinformation(pageNum, pageSize, userinformation);
    }

    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新个人资料", notes = "更新个人资料")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键序列", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "姓名", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "sex", value = "性别", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "birthday", value = "出生年月", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "academicQualifications", value = "学历", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "academicDegrees", value = "学位", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "duties", value = "职务", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "politicalLandscape", value = "政治面貌", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "classTeacher", value = "工号", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "departmentDept", value = "所在系部", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "enterSchoolTime", value = "进校时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "universityYear", value = "高校工龄", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "undergraduateGraduationSchool", value = "本科毕业学校", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "academicQualificationsSchool", value = "获得最高学历的院校或机构", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "academicDegreesSchool", value = "获得最高学位的院校或机构", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "idcard", value = "身份证号码", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "willDiscipline", value = "申报学科", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "willProfessionalTitles", value = "拟报职称", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "studyProfessional", value = "所学专业", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "jobYear", value = "工作时间", required = false, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "teacherQualificationCertificate", value = "教师资格证", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "preJobTraining", value = "岗前培训", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "putonghuaExam", value = "普通话考试", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "academicQualificationsTime", value = "最高学历取得时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "academicDegreesTime", value = "最高学位取得时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "professionalTechnologyDuties", value = "现专业技术职务", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "professionalTechnologyDutiesTime", value = "现专业技术职务取得时间", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "professionalStudyDirection", value = "现从事专业研究方向", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "professionalStudyDirectionYear", value = "现从事专业研究方向年限", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "continuingEducationSituation", value = "继续教育情况", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "engineeringPracticeExperience", value = "工程实践经历", required = false, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "guidanceStudentPracticeNumber", value = "指导学生实践轮数", required = false, dataType = "int", paramType = "query"),

    })
    public int updateByPrimaryKey(@ApiIgnore Integer id, String name, String sex, String birthday, String academicQualifications, String academicDegrees, String duties, String politicalLandscape, String classTeacher, String departmentDept, String enterSchoolTime, String universityYear, String undergraduateGraduationSchool, String academicQualificationsSchool, String academicDegreesSchool, String idcard, String willDiscipline, String willProfessionalTitles, String studyProfessional, BigDecimal jobYear, String teacherQualificationCertificate, String preJobTraining, String putonghuaExam, String academicQualificationsTime, String academicDegreesTime, String professionalTechnologyDuties, String professionalTechnologyDutiesTime, String professionalStudyDirection, String professionalStudyDirectionYear, String continuingEducationSituation, String engineeringPracticeExperience, Integer guidanceStudentPracticeNumber) {
        Userinformation userinformation = new Userinformation(id, name, sex, birthday, academicQualifications, academicDegrees, duties, politicalLandscape, classTeacher, departmentDept, enterSchoolTime, universityYear, undergraduateGraduationSchool, academicQualificationsSchool, academicDegreesSchool, idcard, willDiscipline, willProfessionalTitles, studyProfessional, jobYear, teacherQualificationCertificate, preJobTraining, putonghuaExam, academicQualificationsTime, academicDegreesTime, professionalTechnologyDuties, professionalTechnologyDutiesTime, professionalStudyDirection, professionalStudyDirectionYear, continuingEducationSituation, engineeringPracticeExperience, guidanceStudentPracticeNumber);
        return userinformationService.updateByPrimaryKey(userinformation);
    }

    @RequestMapping(value = "/updateEmail", method = {RequestMethod.POST})
    @ApiOperation(value = "更新邮箱", notes = "更新邮箱接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "email", value = "邮箱", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "验证码", required = true, dataType = "int", paramType = "query"),

    })
    public int updateEmail(@ApiIgnore String classTeacher, String email, int token, HttpServletRequest request) {
        HttpSession session = request.getSession();
        int token_v = (int) session.getAttribute("token"); //正确的验证码
        session.removeAttribute("token");
        //System.out.println(token_v);
        if (token_v == token) {
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(classTeacher);
            userinformation.setEmail(email);
            return userinformationService.updateEmail(userinformation);
        } else {
            return 0;
        }

    }

    @RequestMapping(value = "/updatename", method = {RequestMethod.POST})
    @ApiOperation(value = "更新姓名", notes = "更新姓名接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "名字", required = true, dataType = "varchar", paramType = "query"),

    })
    public int updatename(@ApiIgnore String classTeacher, String name) {
        Userinformation userinformation = new Userinformation();
        userinformation.setClassTeacher(classTeacher);
        userinformation.setName(name);
        return userinformationService.updatename(userinformation);
    }

    @RequestMapping(value = "/updatedepartmentDept", method = {RequestMethod.POST})
    @ApiOperation(value = "更新所属学院", notes = "更新所属学院接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "classTeacher", value = "工号", required = true, dataType = "varchar", paramType = "query"),
            @ApiImplicitParam(name = "departmentDept", value = "所属学院", required = true, dataType = "varchar", paramType = "query"),

    })
    public int updatedepartmentDept(@ApiIgnore String classTeacher, String departmentDept) {
        Userinformation userinformation = new Userinformation();
        userinformation.setClassTeacher(classTeacher);
        userinformation.setDepartmentDept(departmentDept);
        return userinformationService.updatedepartmentDept(userinformation);
    }

    @RequestMapping(value = "/getToken", method = {RequestMethod.POST})
    @ApiOperation(value = "获取邮箱验证码", notes = "新设置邮箱时获取邮箱验证码接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "email", value = "邮箱", required = true, dataType = "varchar", paramType = "query"),

    })
    public int getToken(@ApiIgnore String email, HttpServletRequest request) {

        int token = userinformationService.getToken(email);
        HttpSession session = request.getSession();
        session.setAttribute("token", token);
        return 1;
    }

    @RequestMapping(value = "/getToken/forget", method = {RequestMethod.POST})
    @ApiOperation(value = "获取邮箱验证码", notes = "忘记密码时时获取邮箱验证码接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "access_name", value = "工号", required = true, dataType = "varchar", paramType = "query"),

    })
    public int getTokenForget(@ApiIgnore String access_name, HttpServletRequest request) {

        int token = userinformationService.getTokenForget(access_name);
        HttpSession session = request.getSession();
        session.setAttribute("token", token);
        return 1;
    }

}
