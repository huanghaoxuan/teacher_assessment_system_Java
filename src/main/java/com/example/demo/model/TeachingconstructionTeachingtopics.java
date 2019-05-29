package com.example.demo.model;

import java.io.Serializable;

public class TeachingconstructionTeachingtopics implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String name;

    private String source;

    private String character;

    private String type;

    private String condition;

    private String startTime;

    private String endTime;

    private String result;

    private String note;

    private Integer year;

    private static final long serialVersionUID = 1L;

    public TeachingconstructionTeachingtopics() {
    }

    public TeachingconstructionTeachingtopics(String classTeacher, String status, String name, String source, String character, String type, String condition, String startTime, String endTime, String result, String note, Integer year) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.source = source;
        this.character = character;
        this.type = type;
        this.condition = condition;
        this.startTime = startTime;
        this.endTime = endTime;
        this.result = result;
        this.note = note;
        this.year = year;
    }

    public TeachingconstructionTeachingtopics(Integer id, String classTeacher, String status, String name, String source, String character, String type, String condition, String startTime, String endTime, String result, String note, Integer year) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.source = source;
        this.character = character;
        this.type = type;
        this.condition = condition;
        this.startTime = startTime;
        this.endTime = endTime;
        this.result = result;
        this.note = note;
        this.year = year;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition == null ? null : condition.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
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
        sb.append(", type=").append(type);
        sb.append(", condition=").append(condition);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", result=").append(result);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}