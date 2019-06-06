package com.example.demo.model;

import java.io.Serializable;

public class PublicaffairsSocialservices implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String name;

    private String tpye;

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

    public PublicaffairsSocialservices() {
    }

    public PublicaffairsSocialservices(String classTeacher, String status, String name, String tpye, String note, Integer year, String semester) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.tpye = tpye;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    public PublicaffairsSocialservices(Integer id, String classTeacher, String status, String name, String tpye, String note, Integer year, String semester) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.tpye = tpye;
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

    public String getTpye() {
        return tpye;
    }

    public void setTpye(String tpye) {
        this.tpye = tpye == null ? null : tpye.trim();
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
        sb.append(", tpye=").append(tpye);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", semester=").append(semester);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}