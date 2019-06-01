package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TeacheringworkGuidethegreatcreation implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String name;

    private String level;

    private String source;

    private String projectStatus;

    private String titleLevel;

    private String studentGrade;

    private Integer studentNumber;

    private BigDecimal score;

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }


    public TeacheringworkGuidethegreatcreation() {
    }

    public TeacheringworkGuidethegreatcreation(String classTeacher, String status, String name, String level, String source, String projectStatus, String titleLevel, String studentGrade, Integer studentNumber, String effect, Integer mentorsNumber, String mentorsLevel, String note, Integer year, String semester) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.level = level;
        this.source = source;
        this.projectStatus = projectStatus;
        this.titleLevel = titleLevel;
        this.studentGrade = studentGrade;
        this.studentNumber = studentNumber;
        this.effect = effect;
        this.mentorsNumber = mentorsNumber;
        this.mentorsLevel = mentorsLevel;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    public TeacheringworkGuidethegreatcreation(Integer id, String classTeacher, String status, String name, String level, String source, String projectStatus, String titleLevel, String studentGrade, Integer studentNumber, String effect, Integer mentorsNumber, String mentorsLevel, String note, Integer year, String semester) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.level = level;
        this.source = source;
        this.projectStatus = projectStatus;
        this.titleLevel = titleLevel;
        this.studentGrade = studentGrade;
        this.studentNumber = studentNumber;
        this.effect = effect;
        this.mentorsNumber = mentorsNumber;
        this.mentorsLevel = mentorsLevel;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    private String effect;

    private Integer mentorsNumber;

    private String mentorsLevel;

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus == null ? null : projectStatus.trim();
    }

    public String getTitleLevel() {
        return titleLevel;
    }

    public void setTitleLevel(String titleLevel) {
        this.titleLevel = titleLevel == null ? null : titleLevel.trim();
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade == null ? null : studentGrade.trim();
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect == null ? null : effect.trim();
    }

    public Integer getMentorsNumber() {
        return mentorsNumber;
    }

    public void setMentorsNumber(Integer mentorsNumber) {
        this.mentorsNumber = mentorsNumber;
    }

    public String getMentorsLevel() {
        return mentorsLevel;
    }

    public void setMentorsLevel(String mentorsLevel) {
        this.mentorsLevel = mentorsLevel == null ? null : mentorsLevel.trim();
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
        sb.append(", source=").append(source);
        sb.append(", projectStatus=").append(projectStatus);
        sb.append(", titleLevel=").append(titleLevel);
        sb.append(", studentGrade=").append(studentGrade);
        sb.append(", studentNumber=").append(studentNumber);
        sb.append(", effect=").append(effect);
        sb.append(", mentorsNumber=").append(mentorsNumber);
        sb.append(", mentorsLevel=").append(mentorsLevel);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", semester=").append(semester);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}