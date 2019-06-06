package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TeacheringworkGuidecontest implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String name;

    private String level;

    private String classTeacherName;//老师姓名

    public String getClassTeacherName() {
        return classTeacherName;
    }

    public void setClassTeacherName(String classTeacherName) {
        this.classTeacherName = classTeacherName;
    }

    private Integer prizePersonsNumber;

    private Integer firstPersonsNumber;

    private Integer secondPersonsNumber;

    private Integer thirdPersonsNumber;

    private BigDecimal score;

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public TeacheringworkGuidecontest() {
    }

    public TeacheringworkGuidecontest(String classTeacher, String status, String name, String level, Integer prizePersonsNumber, Integer firstPersonsNumber, Integer secondPersonsNumber, Integer thirdPersonsNumber, Integer outstandingAwardsNumber, String guidanceType, Integer instructorsNumber, String note, Integer year, String semester) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.level = level;
        this.prizePersonsNumber = prizePersonsNumber;
        this.firstPersonsNumber = firstPersonsNumber;
        this.secondPersonsNumber = secondPersonsNumber;
        this.thirdPersonsNumber = thirdPersonsNumber;
        this.outstandingAwardsNumber = outstandingAwardsNumber;
        this.guidanceType = guidanceType;
        this.instructorsNumber = instructorsNumber;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    public TeacheringworkGuidecontest(Integer id, String classTeacher, String status, String name, String level, Integer prizePersonsNumber, Integer firstPersonsNumber, Integer secondPersonsNumber, Integer thirdPersonsNumber, Integer outstandingAwardsNumber, String guidanceType, Integer instructorsNumber, String note, Integer year, String semester) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.level = level;
        this.prizePersonsNumber = prizePersonsNumber;
        this.firstPersonsNumber = firstPersonsNumber;
        this.secondPersonsNumber = secondPersonsNumber;
        this.thirdPersonsNumber = thirdPersonsNumber;
        this.outstandingAwardsNumber = outstandingAwardsNumber;
        this.guidanceType = guidanceType;
        this.instructorsNumber = instructorsNumber;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    private Integer outstandingAwardsNumber;

    private String guidanceType;

    private Integer instructorsNumber;

    private String note;

    private Integer year;

    private String semester;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher == null ? null : classTeacher.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Integer getPrizePersonsNumber() {
        return prizePersonsNumber;
    }

    public void setPrizePersonsNumber(Integer prizePersonsNumber) {
        this.prizePersonsNumber = prizePersonsNumber;
    }

    public Integer getFirstPersonsNumber() {
        return firstPersonsNumber;
    }

    public void setFirstPersonsNumber(Integer firstPersonsNumber) {
        this.firstPersonsNumber = firstPersonsNumber;
    }

    public Integer getSecondPersonsNumber() {
        return secondPersonsNumber;
    }

    public void setSecondPersonsNumber(Integer secondPersonsNumber) {
        this.secondPersonsNumber = secondPersonsNumber;
    }

    public Integer getThirdPersonsNumber() {
        return thirdPersonsNumber;
    }

    public void setThirdPersonsNumber(Integer thirdPersonsNumber) {
        this.thirdPersonsNumber = thirdPersonsNumber;
    }

    public Integer getOutstandingAwardsNumber() {
        return outstandingAwardsNumber;
    }

    public void setOutstandingAwardsNumber(Integer outstandingAwardsNumber) {
        this.outstandingAwardsNumber = outstandingAwardsNumber;
    }

    public String getGuidanceType() {
        return guidanceType;
    }

    public void setGuidanceType(String guidanceType) {
        this.guidanceType = guidanceType == null ? null : guidanceType.trim();
    }

    public Integer getInstructorsNumber() {
        return instructorsNumber;
    }

    public void setInstructorsNumber(Integer instructorsNumber) {
        this.instructorsNumber = instructorsNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester == null ? null : semester.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", classTeacher=").append(classTeacher);
        sb.append(", status=").append(status);
        sb.append(", name=").append(name);
        sb.append(", level=").append(level);
        sb.append(", prizePersonsNumber=").append(prizePersonsNumber);
        sb.append(", firstPersonsNumber=").append(firstPersonsNumber);
        sb.append(", secondPersonsNumber=").append(secondPersonsNumber);
        sb.append(", thirdPersonsNumber=").append(thirdPersonsNumber);
        sb.append(", outstandingAwardsNumber=").append(outstandingAwardsNumber);
        sb.append(", guidanceType=").append(guidanceType);
        sb.append(", instructorsNumber=").append(instructorsNumber);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", semester=").append(semester);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}