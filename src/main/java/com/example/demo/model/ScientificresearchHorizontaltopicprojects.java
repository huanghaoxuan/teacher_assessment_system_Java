package com.example.demo.model;

import java.io.Serializable;

public class ScientificresearchHorizontaltopicprojects implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String name;

    private String source;

    private String character;

    private String money;

    private String startTime;

    private String estimatedClosingTime;

    private String result;

    public ScientificresearchHorizontaltopicprojects() {
    }

    public ScientificresearchHorizontaltopicprojects(String classTeacher, String status, String name, String source, String character, String money, String startTime, String estimatedClosingTime, String result, String note, Integer year, String semester) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.source = source;
        this.character = character;
        this.money = money;
        this.startTime = startTime;
        this.estimatedClosingTime = estimatedClosingTime;
        this.result = result;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    public ScientificresearchHorizontaltopicprojects(Integer id, String classTeacher, String status, String name, String source, String character, String money, String startTime, String estimatedClosingTime, String result, String note, Integer year, String semester) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.source = source;
        this.character = character;
        this.money = money;
        this.startTime = startTime;
        this.estimatedClosingTime = estimatedClosingTime;
        this.result = result;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character == null ? null : character.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEstimatedClosingTime() {
        return estimatedClosingTime;
    }

    public void setEstimatedClosingTime(String estimatedClosingTime) {
        this.estimatedClosingTime = estimatedClosingTime == null ? null : estimatedClosingTime.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
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
        sb.append(", source=").append(source);
        sb.append(", character=").append(character);
        sb.append(", money=").append(money);
        sb.append(", startTime=").append(startTime);
        sb.append(", estimatedClosingTime=").append(estimatedClosingTime);
        sb.append(", result=").append(result);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", semester=").append(semester);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}