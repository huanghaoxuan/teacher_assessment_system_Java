package com.example.demo.controller;

import com.example.demo.model.ScoreContestaward;
import com.example.demo.service.ScoreContestawardService;
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
@RequestMapping("/scoreContestaward")
@Api(tags = "【得分】竞赛奖的数据接口")
public class ScoreContestawardController {

    @Autowired
    private ScoreContestawardService scoreContestawardService;

    @RequestMapping(value = "/selectByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "查询竞赛奖", notes = "竞赛奖查询接口")
    public ScoreContestaward selectByPrimaryKey() {
        return scoreContestawardService.selectByPrimaryKey(1);
    }


    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新竞赛奖", notes = "更新学生比赛（毕业设计）获奖查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "countryFirstDigit", value = "国家级一等（特等）奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "countrySecondDigit", value = "国家级二等奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "countryThirdDigit", value = "国家级三等奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "provincialFirstDigit", value = "省部级（大区）一等（特等）奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "provincialSecondDigit", value = "省部级（大区）二等奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "provincialThirdDigit", value = "省部级（大区）三等奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "cityFirstDigit", value = "市局级一等（特等）奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "citySecondDigit", value = "市局级二等奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "cityThirdDigit", value = "市局级三等奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "schoolFirstDigit", value = "院级一等（特等）奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "schoolSecondDigit", value = "院级二等奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "schoolThirdDigit", value = "院级三等奖", required = true, dataType = "decimal", paramType = "query"),

    })
    public int updateByPrimaryKey(@ApiIgnore BigDecimal countryFirstDigit, BigDecimal countrySecondDigit, BigDecimal countryThirdDigit, BigDecimal provincialFirstDigit, BigDecimal provincialSecondDigit, BigDecimal provincialThirdDigit, BigDecimal cityFirstDigit, BigDecimal citySecondDigit, BigDecimal cityThirdDigit, BigDecimal schoolFirstDigit, BigDecimal schoolSecondDigit, BigDecimal schoolThirdDigit) {

        ScoreContestaward scoreContestaward = new ScoreContestaward(1, countryFirstDigit, countrySecondDigit, countryThirdDigit, provincialFirstDigit, provincialSecondDigit, provincialThirdDigit, cityFirstDigit, citySecondDigit, cityThirdDigit, schoolFirstDigit, schoolSecondDigit, schoolThirdDigit);
        return scoreContestawardService.updateByPrimaryKey(scoreContestaward);
    }
}
