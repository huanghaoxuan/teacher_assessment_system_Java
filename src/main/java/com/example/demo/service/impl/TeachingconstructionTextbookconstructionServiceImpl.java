package com.example.demo.service.impl;

import com.example.demo.mapper.TeachingconstructionTextbookconstructionMapper;
import com.example.demo.model.TeachingconstructionTextbookconstruction;
import com.example.demo.model.Userinformation;
import com.example.demo.service.TeachingconstructionTextbookconstructionService;
import com.example.demo.service.UserinformationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/5/29 9:42
 * @Version 1.0
 */

@Service
public class TeachingconstructionTextbookconstructionServiceImpl implements TeachingconstructionTextbookconstructionService {

    @Autowired
    private TeachingconstructionTextbookconstructionMapper teachingconstructionTextbookconstructionMapper;

    @Autowired
    private UserinformationService userinformationService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return teachingconstructionTextbookconstructionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeachingconstructionTextbookconstruction record) {
        return teachingconstructionTextbookconstructionMapper.insert(record);
    }

    @Override
    public PageInfo<TeachingconstructionTextbookconstruction> selectAll(int pageNum, int pageSize, Userinformation record) {
        PageHelper.startPage(pageNum, pageSize);
        List<TeachingconstructionTextbookconstruction> teachings;
        List<String> classTeachers = userinformationService.selectSomeByAny(record);
        //如果查询信息表下没有记录，返回空
        if (classTeachers.size() == 0) {
            return new PageInfo<>();
        }
        teachings = teachingconstructionTextbookconstructionMapper.selectAllByClassTeacher(classTeachers);

        //加入当前记录老师姓名
        for (int index = 0; index < teachings.size(); index++) {
            TeachingconstructionTextbookconstruction teachingconstructionTextbookconstruction = teachings.get(index);
            Userinformation userinformation = new Userinformation();
            userinformation.setClassTeacher(teachingconstructionTextbookconstruction.getClassTeacher());
            teachingconstructionTextbookconstruction.setClassTeacherName(userinformationService.selectByClassTeacher(userinformation).getName());
        }
        PageInfo<TeachingconstructionTextbookconstruction> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public PageInfo<TeachingconstructionTextbookconstruction> selectByClassTeacher(TeachingconstructionTextbookconstruction teaching, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, "id desc");
        List<TeachingconstructionTextbookconstruction> teachings = teachingconstructionTextbookconstructionMapper.selectByClassTeacher(teaching);
        PageInfo<TeachingconstructionTextbookconstruction> result = new PageInfo<>(teachings);
        return result;
    }

    @Override
    public int updateByPrimaryKey(TeachingconstructionTextbookconstruction record) {
        return teachingconstructionTextbookconstructionMapper.updateByPrimaryKey(record);
    }

    @Override
    public BigDecimal getScore(String yesorno, BigDecimal textbooksNumber) {
        BigDecimal bigDecimal = this.sqrt(textbooksNumber.add(BigDecimal.valueOf(1)), 3);
        return bigDecimal.multiply(BigDecimal.valueOf(100));
    }


    private BigDecimal sqrt(BigDecimal value, int scale) {
        BigDecimal num2 = BigDecimal.valueOf(2);
        int precision = 100;
        MathContext mc = new MathContext(precision, RoundingMode.HALF_UP);
        BigDecimal deviation = value;
        int cnt = 0;
        while (cnt < precision) {
            deviation = (deviation.add(value.divide(deviation, mc))).divide(num2, mc);
            cnt++;
        }
        deviation = deviation.setScale(scale, BigDecimal.ROUND_HALF_UP);
        return deviation;
    }
}
