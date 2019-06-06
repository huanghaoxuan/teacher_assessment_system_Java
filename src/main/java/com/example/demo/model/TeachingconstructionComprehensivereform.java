package com.example.demo.model;

import java.io.Serializable;

public class TeachingconstructionComprehensivereform implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String character;

    private String undertakingTasks;

    private String note;

    private Integer year;

    private String classTeacherName;//老师姓名

    public String getClassTeacherName() {
        return classTeacherName;
    }

    public void setClassTeacherName(String classTeacherName) {
        this.classTeacherName = classTeacherName;
    }

    private String semester;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public TeachingconstructionComprehensivereform() {
    }

    public TeachingconstructionComprehensivereform(String classTeacher, String status, String character, String undertakingTasks, String note, Integer year, String semester) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.character = character;
        this.undertakingTasks = undertakingTasks;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    public TeachingconstructionComprehensivereform(Integer id, String classTeacher, String status, String character, String undertakingTasks, String note, Integer year, String semester) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.character = character;
        this.undertakingTasks = undertakingTasks;
        this.note = note;
        this.year = year;
        this.semester = semester;
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

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character == null ? null : character.trim();
    }

    public String getUndertakingTasks() {
        return undertakingTasks;
    }

    public void setUndertakingTasks(String undertakingTasks) {
        this.undertakingTasks = undertakingTasks == null ? null : undertakingTasks.trim();
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
        sb.append(", character=").append(character);
        sb.append(", undertakingTasks=").append(undertakingTasks);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", semester=").append(semester);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}