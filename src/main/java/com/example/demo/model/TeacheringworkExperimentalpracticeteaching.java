package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TeacheringworkExperimentalpracticeteaching implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String name;

    private String character;

    private BigDecimal allTime;

    private String classTeacherName;//老师姓名

    public String getClassTeacherName() {
        return classTeacherName;
    }

    public void setClassTeacherName(String classTeacherName) {
        this.classTeacherName = classTeacherName;
    }

    private BigDecimal weekTime;

    private Integer studentNumber;

    private Integer parallelClassesNumber;

    public TeacheringworkExperimentalpracticeteaching() {
    }

    public TeacheringworkExperimentalpracticeteaching(String classTeacher, String status, String name, String character, BigDecimal allTime, BigDecimal weekTime, Integer studentNumber, Integer parallelClassesNumber, Integer groupingPerClassNumber, Integer instructorsNumber, String experimentType, Integer reportsNumber, Integer correctionsNumber, Integer note, Integer year, String semester) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.character = character;
        this.allTime = allTime;
        this.weekTime = weekTime;
        this.studentNumber = studentNumber;
        this.parallelClassesNumber = parallelClassesNumber;
        this.groupingPerClassNumber = groupingPerClassNumber;
        this.instructorsNumber = instructorsNumber;
        this.experimentType = experimentType;
        this.reportsNumber = reportsNumber;
        this.correctionsNumber = correctionsNumber;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    public TeacheringworkExperimentalpracticeteaching(Integer id, String classTeacher, String status, String name, String character, BigDecimal allTime, BigDecimal weekTime, Integer studentNumber, Integer parallelClassesNumber, Integer groupingPerClassNumber, Integer instructorsNumber, String experimentType, Integer reportsNumber, Integer correctionsNumber, Integer note, Integer year, String semester) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.character = character;
        this.allTime = allTime;
        this.weekTime = weekTime;
        this.studentNumber = studentNumber;
        this.parallelClassesNumber = parallelClassesNumber;
        this.groupingPerClassNumber = groupingPerClassNumber;
        this.instructorsNumber = instructorsNumber;
        this.experimentType = experimentType;
        this.reportsNumber = reportsNumber;
        this.correctionsNumber = correctionsNumber;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    private Integer groupingPerClassNumber;

    private Integer instructorsNumber;

    private String experimentType;

    private Integer reportsNumber;

    private Integer correctionsNumber;

    private Integer note;

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

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character == null ? null : character.trim();
    }

    public BigDecimal getAllTime() {
        return allTime;
    }

    public void setAllTime(BigDecimal allTime) {
        this.allTime = allTime;
    }

    public BigDecimal getWeekTime() {
        return weekTime;
    }

    public void setWeekTime(BigDecimal weekTime) {
        this.weekTime = weekTime;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Integer getParallelClassesNumber() {
        return parallelClassesNumber;
    }

    public void setParallelClassesNumber(Integer parallelClassesNumber) {
        this.parallelClassesNumber = parallelClassesNumber;
    }

    public Integer getGroupingPerClassNumber() {
        return groupingPerClassNumber;
    }

    public void setGroupingPerClassNumber(Integer groupingPerClassNumber) {
        this.groupingPerClassNumber = groupingPerClassNumber;
    }

    public Integer getInstructorsNumber() {
        return instructorsNumber;
    }

    public void setInstructorsNumber(Integer instructorsNumber) {
        this.instructorsNumber = instructorsNumber;
    }

    public String getExperimentType() {
        return experimentType;
    }

    public void setExperimentType(String experimentType) {
        this.experimentType = experimentType == null ? null : experimentType.trim();
    }

    public Integer getReportsNumber() {
        return reportsNumber;
    }

    public void setReportsNumber(Integer reportsNumber) {
        this.reportsNumber = reportsNumber;
    }

    public Integer getCorrectionsNumber() {
        return correctionsNumber;
    }

    public void setCorrectionsNumber(Integer correctionsNumber) {
        this.correctionsNumber = correctionsNumber;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
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
        sb.append(", character=").append(character);
        sb.append(", allTime=").append(allTime);
        sb.append(", weekTime=").append(weekTime);
        sb.append(", studentNumber=").append(studentNumber);
        sb.append(", parallelClassesNumber=").append(parallelClassesNumber);
        sb.append(", groupingPerClassNumber=").append(groupingPerClassNumber);
        sb.append(", instructorsNumber=").append(instructorsNumber);
        sb.append(", experimentType=").append(experimentType);
        sb.append(", reportsNumber=").append(reportsNumber);
        sb.append(", correctionsNumber=").append(correctionsNumber);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", semester=").append(semester);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}