package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkTeachingawardsMapper;
import com.example.demo.model.TeacheringworkTeachingawards;
import com.example.demo.service.ScoreContestawardService;
import com.example.demo.service.ScoreGovernmentachievementawardService;
import com.example.demo.service.ScoreNotgovernmentachievementawardService;
import com.example.demo.service.TeacheringworkTeachingawardsService;
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
public class TeacheringworkTeachingawardsServiceImpl implements TeacheringworkTeachingawardsService {

    @Autowired
    private TeacheringworkTeachingawardsMapper teacheringworkTeachingawardsMapper;

    @Autowired
    private ScoreContestawardService scoreContestawardService;

    @Autowired
    private ScoreGovernmentachievementawardService scoreGovernmentachievementawardService;

    @Autowired
    private ScoreNotgovernmentachievementawardService scoreNotgovernmentachievementawardService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teacheringworkTeachingawardsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacheringworkTeachingawards record) {
        return teacheringworkTeachingawardsMapper.insert(record);
    }

    @Override
    public PageInfo<TeacheringworkTeachingawards> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkTeachingawards> teachings = teacheringworkTeachingawardsMapper.selectAll();
        PageInfo<TeacheringworkTeachingawards> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeacheringworkTeachingawards> selectByClassTeacher(TeacheringworkTeachingawards teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeacheringworkTeachingawards> teachings = teacheringworkTeachingawardsMapper.selectByClassTeacher(teaching);
        PageInfo<TeacheringworkTeachingawards> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeacheringworkTeachingawards record) {
        return teacheringworkTeachingawardsMapper.updateByPrimaryKey(record);
    }

    @Override
    public BigDecimal getScore(String type, String level, String grade, Integer participantsNumber) {
        BigDecimal bparticipantsNumber = BigDecimal.valueOf(participantsNumber);
        if (type.equals("竞赛奖")) {
            if (level.equals("国家级")) {
                if (grade.equals("特等奖") || grade.equals("一等奖")) {
                    return scoreContestawardService.selectByPrimaryKey(1).getCountryFirstDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("二等奖")) {
                    return scoreContestawardService.selectByPrimaryKey(1).getCountrySecondDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("三等奖")) {
                    return scoreContestawardService.selectByPrimaryKey(1).getCountryThirdDigit().divide(bparticipantsNumber, 3);
                }
            } else if (level.equals("省部级") || level.equals("大区级")) {
                if (grade.equals("特等奖") || grade.equals("一等奖")) {
                    return scoreContestawardService.selectByPrimaryKey(1).getProvincialFirstDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("二等奖")) {
                    return scoreContestawardService.selectByPrimaryKey(1).getProvincialSecondDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("三等奖")) {
                    return scoreContestawardService.selectByPrimaryKey(1).getProvincialThirdDigit().divide(bparticipantsNumber, 3);
                }
            } else if (level.equals("市局级")) {
                if (grade.equals("特等奖") || grade.equals("一等奖")) {
                    return scoreContestawardService.selectByPrimaryKey(1).getCityFirstDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("二等奖")) {
                    return scoreContestawardService.selectByPrimaryKey(1).getCitySecondDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("三等奖")) {
                    return scoreContestawardService.selectByPrimaryKey(1).getCityThirdDigit().divide(bparticipantsNumber, 3);
                }
            } else if (level.equals("院级")) {
                if (grade.equals("特等奖") || grade.equals("一等奖")) {
                    return scoreContestawardService.selectByPrimaryKey(1).getSchoolFirstDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("二等奖")) {
                    return scoreContestawardService.selectByPrimaryKey(1).getSchoolSecondDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("三等奖")) {
                    return scoreContestawardService.selectByPrimaryKey(1).getSchoolThirdDigit().divide(bparticipantsNumber, 3);
                }
            }
        } else if (type.equals("政府成果奖")) {
            if (level.equals("国家级")) {
                if (grade.equals("特等奖") || grade.equals("一等奖")) {
                    return scoreGovernmentachievementawardService.selectByPrimaryKey(1).getCountryFirstDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("二等奖")) {
                    return scoreGovernmentachievementawardService.selectByPrimaryKey(1).getCountrySecondDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("三等奖")) {
                    return scoreGovernmentachievementawardService.selectByPrimaryKey(1).getCountryThirdDigit().divide(bparticipantsNumber, 3);
                }
            } else if (level.equals("省部级") || level.equals("大区级")) {
                if (grade.equals("特等奖") || grade.equals("一等奖")) {
                    return scoreGovernmentachievementawardService.selectByPrimaryKey(1).getProvincialFirstDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("二等奖")) {
                    return scoreGovernmentachievementawardService.selectByPrimaryKey(1).getProvincialSecondDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("三等奖")) {
                    return scoreGovernmentachievementawardService.selectByPrimaryKey(1).getProvincialThirdDigit().divide(bparticipantsNumber, 3);
                }
            } else if (level.equals("市局级")) {
                if (grade.equals("特等奖") || grade.equals("一等奖")) {
                    return scoreGovernmentachievementawardService.selectByPrimaryKey(1).getCityFirstDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("二等奖")) {
                    return scoreGovernmentachievementawardService.selectByPrimaryKey(1).getCitySecondDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("三等奖")) {
                    return scoreGovernmentachievementawardService.selectByPrimaryKey(1).getCityThirdDigit().divide(bparticipantsNumber, 3);
                }
            } else if (level.equals("院级")) {
                if (grade.equals("特等奖") || grade.equals("一等奖")) {
                    return scoreGovernmentachievementawardService.selectByPrimaryKey(1).getSchoolFirstDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("二等奖")) {
                    return scoreGovernmentachievementawardService.selectByPrimaryKey(1).getSchoolSecondDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("三等奖")) {
                    return scoreGovernmentachievementawardService.selectByPrimaryKey(1).getSchoolThirdDigit().divide(bparticipantsNumber, 3);
                }
            }
        } else if (type.equals("非政府成果奖")) {
            if (level.equals("国家级")) {
                if (grade.equals("特等奖") || grade.equals("一等奖")) {
                    return scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getCountryFirstDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("二等奖")) {
                    return scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getCountrySecondDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("三等奖")) {
                    return scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getCountryThirdDigit().divide(bparticipantsNumber, 3);
                }
            } else if (level.equals("省部级") || level.equals("大区级")) {
                if (grade.equals("特等奖") || grade.equals("一等奖")) {
                    return scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getProvincialFirstDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("二等奖")) {
                    return scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getProvincialSecondDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("三等奖")) {
                    return scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getProvincialThirdDigit().divide(bparticipantsNumber, 3);
                }
            } else if (level.equals("市局级")) {
                if (grade.equals("特等奖") || grade.equals("一等奖")) {
                    return scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getCityFirstDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("二等奖")) {
                    return scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getCitySecondDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("三等奖")) {
                    return scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getCityThirdDigit().divide(bparticipantsNumber, 3);
                }
            } else if (level.equals("院级")) {
                if (grade.equals("特等奖") || grade.equals("一等奖")) {
                    return scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getSchoolFirstDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("二等奖")) {
                    return scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getSchoolSecondDigit().divide(bparticipantsNumber, 3);
                } else if (grade.equals("三等奖")) {
                    return scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getSchoolThirdDigit().divide(bparticipantsNumber, 3);
                }
            }
        }
        return BigDecimal.valueOf(0);
    }
}
