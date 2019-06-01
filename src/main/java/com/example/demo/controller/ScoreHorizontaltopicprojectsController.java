package com.example.demo.controller;

import com.example.demo.model.ScoreHorizontaltopicprojects;
import com.example.demo.service.ScoreHorizontaltopicprojectsService;
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
@RequestMapping("/scoreHorizontaltopicprojects")
@Api(tags = "【得分】横向研究课题项目的数据接口")
public class ScoreHorizontaltopicprojectsController {

    @Autowired
    private ScoreHorizontaltopicprojectsService scoreHorizontaltopicprojectsService;

    @RequestMapping(value = "/selectByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "查询横向研究课题项目", notes = "横向研究课题项目查询接口")
    public ScoreHorizontaltopicprojects selectByPrimaryKey() {
        return scoreHorizontaltopicprojectsService.selectByPrimaryKey(1);
    }


    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新横向研究课题项目", notes = "更新学生比赛（毕业设计）获奖查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "oneMillion", value = "国家级一等（特等）奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "oneToThreeMillion", value = "国家级二等奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "threeToFiveMillion", value = "国家级三等奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "fiveToTenMillion", value = "省部级（大区）一等（特等）奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "tenToTwentyMillion", value = "省部级（大区）二等奖", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "twentyToThirtyMillion", value = "省部级（大区）三等奖", required = true, dataType = "decimal", paramType = "query"),

    })
    public int updateByPrimaryKey(@ApiIgnore BigDecimal oneMillion, BigDecimal oneToThreeMillion, BigDecimal threeToFiveMillion, BigDecimal fiveToTenMillion, BigDecimal tenToTwentyMillion, BigDecimal twentyToThirtyMillion) {

        ScoreHorizontaltopicprojects scoreHorizontaltopicprojects = new ScoreHorizontaltopicprojects(1, oneMillion, oneToThreeMillion, threeToFiveMillion, fiveToTenMillion, tenToTwentyMillion, twentyToThirtyMillion);
        return scoreHorizontaltopicprojectsService.updateByPrimaryKey(scoreHorizontaltopicprojects);
    }
}
