package com.example.demo.service.impl;

import com.example.demo.mapper.TeacheringworkTeachingawardsMapper;
import com.example.demo.model.TeacheringworkTeachingawards;
import com.example.demo.model.Userinformation;
import com.example.demo.service.*;
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
    private UserinformationService userinformationService;

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
    public PageInfo<TeacheringworkTeachingawards> selectAll(int pageNum, int pageSize, String departmentDept) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeacheringworkTeachingawards> teachings;
        if (departmentDept != null && !departmentDept.equals("")) {
            List<String> classTeachers = userinformationService.selectBydepartmentDept(departmentDept);
            //如果查询学院下没有记录，返回空
            if (classTeachers.size() == 0) {
                return new PageInfo<>();
            }
            teachings = teacheringworkTeachingawardsMapper.selectAllByClassTeacher(classTeachers);
        } else {
            teachings = teacheringworkTeachingawardsMapper.selectAll();
        }
        for (int index = 0; index < teachings.size(); index++) {
            TeacheringworkTeachingawards teacheringworkTeachingawards = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(teacheringworkTeachingawards.getClassTeacher());
            teacheringworkTeachingawards.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
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
//            else if (level.equals("院级")) {
//                if (grade.equals("特等奖") || grade.equals("一等奖")) {
//                    BigDecimal bigDecimal = scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getSchoolFirstDigit().divide(bparticipantsNumber, 3);
//                    return (bigDecimal.compareTo(BigDecimal.valueOf(10)) == -1)? bigDecimal:BigDecimal.valueOf(10);
//                } else if (grade.equals("二等奖")) {
//                    BigDecimal bigDecimal = scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getSchoolSecondDigit().divide(bparticipantsNumber, 3);
//                    return (bigDecimal.compareTo(BigDecimal.valueOf(8)) == -1)? bigDecimal:BigDecimal.valueOf(8);
//                } else if (grade.equals("三等奖")) {
//                    BigDecimal bigDecimal = scoreNotgovernmentachievementawardService.selectByPrimaryKey(1).getSchoolThirdDigit().divide(bparticipantsNumber, 3);
//                    return (bigDecimal.compareTo(BigDecimal.valueOf(6)) == -1)? bigDecimal:BigDecimal.valueOf(6);
//                }
//            }
        }
        return BigDecimal.valueOf(0);
    }
}
