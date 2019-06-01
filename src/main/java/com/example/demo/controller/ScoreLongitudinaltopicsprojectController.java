package com.example.demo.controller;

import com.example.demo.model.ScoreLongitudinaltopicsproject;
import com.example.demo.service.ScoreLongitudinaltopicsprojectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.math.BigDecimal;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/6/1 16:34
 * @Version 1.0
 */

@RestController
@RequestMapping("/scoreLongitudinaltopicsproject")
@Api(tags = "【得分】纵向课题项目的数据接口")
public class ScoreLongitudinaltopicsprojectController {

    @Autowired
    private ScoreLongitudinaltopicsprojectService scoreLongitudinaltopicsprojectService;

    @RequestMapping(value = "/selectByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "查询纵向课题项目", notes = "纵向课题项目查询接口")
    public ScoreLongitudinaltopicsproject selectByPrimaryKey() {
        return scoreLongitudinaltopicsprojectService.selectByPrimaryKey(1);
    }


    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新纵向课题项目", notes = "更新学生比赛（毕业设计）获奖查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "countryKeyFunding", value = "国家级重点资助", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "countryGeneralFunding", value = "国家级一般资助", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "countryProject", value = "国家级立项", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "provincialKeyFunding", value = "省部级（大区）重点资助", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "provincialGeneralFunding", value = "省部级一般资助", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "provincialProject", value = "省部级（大区）立项", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "cityKeyFunding", value = "市局级重点资助", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "cityGeneralFunding", value = "市局级一般资助", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "cityProject", value = "市局级立项", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "schoolKeyFunding", value = "院级重点资助", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "schoolGeneralFunding", value = "院级一般资助", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "schoolProject", value = "院级立项", required = true, dataType = "decimal", paramType = "query"),

    })
    public int updateByPrimaryKey(@ApiIgnore BigDecimal countryFirstDigit, BigDecimal countrySecondDigit, BigDecimal countryThirdDigit, BigDecimal provincialFirstDigit, BigDecimal provincialSecondDigit, BigDecimal provincialThirdDigit, BigDecimal cityFirstDigit, BigDecimal citySecondDigit, BigDecimal cityThirdDigit, BigDecimal schoolFirstDigit, BigDecimal schoolSecondDigit, BigDecimal schoolThirdDigit) {

        ScoreLongitudinaltopicsproject scoreLongitudinaltopicsproject = new ScoreLongitudinaltopicsproject(1, countryFirstDigit, countrySecondDigit, countryThirdDigit, provincialFirstDigit, provincialSecondDigit, provincialThirdDigit, cityFirstDigit, citySecondDigit, cityThirdDigit, schoolFirstDigit, schoolSecondDigit, schoolThirdDigit);
        return scoreLongitudinaltopicsprojectService.updateByPrimaryKey(scoreLongitudinaltopicsproject);
    }
}
