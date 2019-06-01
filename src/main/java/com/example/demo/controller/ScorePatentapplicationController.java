package com.example.demo.controller;

import com.example.demo.model.ScorePatentapplication;
import com.example.demo.service.ScorePatentapplicationService;
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
@RequestMapping("/scorePatentapplication")
@Api(tags = "【得分】专利和发明的数据接口")
public class ScorePatentapplicationController {

    @Autowired
    private ScorePatentapplicationService scorePatentapplicationService;

    @RequestMapping(value = "/selectByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "查询专利和发明", notes = "专利和发明查询接口")
    public ScorePatentapplication selectByPrimaryKey() {
        return scorePatentapplicationService.selectByPrimaryKey(1);
    }


    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新专利和发明", notes = "更新学生比赛（毕业设计）获奖查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "invention", value = "发明专利授权", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "countryAccept", value = "国家已受理发明专利", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "practical", value = "实用新型专利授权", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "exteriorDesign", value = "外观设计专利授权", required = true, dataType = "decimal", paramType = "query"),

    })
    public int updateByPrimaryKey(@ApiIgnore BigDecimal invention, BigDecimal countryAccept, BigDecimal practical, BigDecimal exteriorDesign) {

        ScorePatentapplication scorePatentapplication = new ScorePatentapplication(1, invention, countryAccept, practical, exteriorDesign);
        return scorePatentapplicationService.updateByPrimaryKey(scorePatentapplication);
    }
}
