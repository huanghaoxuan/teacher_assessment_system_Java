package com.example.demo.service.impl;

import com.example.demo.mapper.ScientificresearchPublishpaperMapper;
import com.example.demo.model.ScientificresearchPublishpaper;
import com.example.demo.model.Userinformation;
import com.example.demo.service.ScientificresearchPublishpaperService;
import com.example.demo.service.ScorePublishpaperService;
import com.example.demo.service.UserinformationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/29 9:42
 * @Version 1.0
 */

@Service
public class ScientificresearchPublishpaperServiceImpl implements ScientificresearchPublishpaperService {

    @Autowired
    private ScientificresearchPublishpaperMapper pcientificresearchPublishpaperMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Autowired
    private ScorePublishpaperService scorePublishpaperService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return pcientificresearchPublishpaperMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ScientificresearchPublishpaper record) {
        return pcientificresearchPublishpaperMapper.insert(record);
    }

    @Override
    public PageInfo<ScientificresearchPublishpaper> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ScientificresearchPublishpaper> teachings = pcientificresearchPublishpaperMapper.selectAll();
        for (int index = 0; index < teachings.size(); index++) {
            ScientificresearchPublishpaper scientificresearchPublishpaper = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(scientificresearchPublishpaper.getClassTeacher());
            scientificresearchPublishpaper.setClassTeacherName(userinformationService.selectUserinformation(userinformation).getName());
        }
        PageInfo<ScientificresearchPublishpaper> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<ScientificresearchPublishpaper> selectByClassTeacher(ScientificresearchPublishpaper teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<ScientificresearchPublishpaper> teachings = pcientificresearchPublishpaperMapper.selectByClassTeacher(teaching);
        PageInfo<ScientificresearchPublishpaper> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(ScientificresearchPublishpaper record) {
        return pcientificresearchPublishpaperMapper.updateByPrimaryKey(record);
    }

    @Override
    public BigDecimal getScore(String collectionInformation, String character) {
        if (collectionInformation.equals("SCI")) {
            if (character.equals("独立发表")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getSCI();
            } else if (character.equals("第一作者")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getSCI().multiply(BigDecimal.valueOf(0.6));
            } else if (character.equals("第二作者")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getSCI().multiply(BigDecimal.valueOf(0.3));
            } else if (character.equals("第三作者")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getSCI().multiply(BigDecimal.valueOf(0.1));
            } else if (character.equals("通讯作者")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getSCI().multiply(BigDecimal.valueOf(0.5));
            }
        } else if (collectionInformation.equals("EI")) {
            if (character.equals("独立发表")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getEI();
            } else if (character.equals("第一作者")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getEI().multiply(BigDecimal.valueOf(0.6));
            } else if (character.equals("第二作者")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getEI().multiply(BigDecimal.valueOf(0.3));
            } else if (character.equals("第三作者")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getEI().multiply(BigDecimal.valueOf(0.1));
            } else if (character.equals("通讯作者")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getEI().multiply(BigDecimal.valueOf(0.5));
            }
        } else if (collectionInformation.equals("其他")) {
            if (character.equals("独立发表")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getOthers();
            } else if (character.equals("第一作者")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getOthers().multiply(BigDecimal.valueOf(0.6));
            } else if (character.equals("第二作者")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getOthers().multiply(BigDecimal.valueOf(0.3));
            } else if (character.equals("第三作者")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getOthers().multiply(BigDecimal.valueOf(0.1));
            } else if (character.equals("通讯作者")) {
                return scorePublishpaperService.selectByPrimaryKey(1).getOthers().multiply(BigDecimal.valueOf(0.5));
            }
        }
        return BigDecimal.valueOf(0);
    }
}
