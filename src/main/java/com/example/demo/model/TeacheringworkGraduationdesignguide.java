package com.example.demo.model;

import java.io.Serializable;

public class TeacheringworkGraduationdesignguide implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String name;

    private String character;

    private String level;

    private Integer winnersNumber;

    private String note;

    private Integer year;

    private String semester;

    public TeacheringworkGraduationdesignguide() {
    }

    public TeacheringworkGraduationdesignguide(String classTeacher, String status, String name, String character, String level, Integer winnersNumber, String note, Integer year, String semester) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.character = character;
        this.level = level;
        this.winnersNumber = winnersNumber;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    public TeacheringworkGraduationdesignguide(Integer id, String classTeacher, String status, String name, String character, String level, Integer winnersNumber, String note, Integer year, String semester) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.character = character;
        this.level = level;
        this.winnersNumber = winnersNumber;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Integer getWinnersNumber() {
        return winnersNumber;
    }

    public void setWinnersNumber(Integer winnersNumber) {
        this.winnersNumber = winnersNumber;
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
        sb.append(", character=").append(character);
        sb.append(", level=").append(level);
        sb.append(", winnersNumber=").append(winnersNumber);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", semester=").append(semester);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}