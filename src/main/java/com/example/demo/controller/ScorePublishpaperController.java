package com.example.demo.controller;

import com.example.demo.model.ScorePublishpaper;
import com.example.demo.service.ScorePublishpaperService;
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
@RequestMapping("/scorePublishpaperController")
@Api(tags = "【得分】发表论文的数据接口")
public class ScorePublishpaperController {

    @Autowired
    private ScorePublishpaperService scorePublishpaperService;

    @RequestMapping(value = "/selectByPrimaryKey", method = {RequestMethod.GET})
    @ApiOperation(value = "查询发表论文", notes = "发表论文查询接口")
    public ScorePublishpaper selectByPrimaryKey() {
        return scorePublishpaperService.selectByPrimaryKey(1);
    }


    @RequestMapping(value = "/updateByPrimaryKey", method = {RequestMethod.POST})
    @ApiOperation(value = "更新发表论文", notes = "更新学生比赛（毕业设计）获奖查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "EI", value = "EI", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "SCI", value = "SCI", required = true, dataType = "decimal", paramType = "query"),
            @ApiImplicitParam(name = "others", value = "others", required = true, dataType = "decimal", paramType = "query"),

    })
    public int updateByPrimaryKey(@ApiIgnore BigDecimal EI, BigDecimal SCI, BigDecimal others) {

        ScorePublishpaper scorePublishpaper = new ScorePublishpaper(1, EI, SCI, others);
        return scorePublishpaperService.updateByPrimaryKey(scorePublishpaper);
    }
}
