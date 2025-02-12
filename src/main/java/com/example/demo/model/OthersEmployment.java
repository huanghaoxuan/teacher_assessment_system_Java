package com.example.demo.model;

import java.io.Serializable;

public class OthersEmployment implements Serializable {
    private Integer id;

    private String name;

    private Integer employment;

    private Integer graduating;

    private Integer disciplinaryRate;

    private String classTeacherName;//老师姓名

    public String getClassTeacherName() {
        return classTeacherName;
    }

    public void setClassTeacherName(String classTeacherName) {
        this.classTeacherName = classTeacherName;
    }

    private String note;

    private Integer year;

    private String semester;

    public OthersEmployment() {
    }

    public OthersEmployment(String name, Integer employment, Integer graduating, Integer disciplinaryRate, String note, Integer year, String semester, String status, String classTeacher) {
        this.name = name;
        this.employment = employment;
        this.graduating = graduating;
        this.disciplinaryRate = disciplinaryRate;
        this.note = note;
        this.year = year;
        this.semester = semester;
        this.status = status;
        this.classTeacher = classTeacher;
    }

    public OthersEmployment(Integer id, String name, Integer employment, Integer graduating, Integer disciplinaryRate, String note, Integer year, String semester, String status, String classTeacher) {
        this.id = id;
        this.name = name;
        this.employment = employment;
        this.graduating = graduating;
        this.disciplinaryRate = disciplinaryRate;
        this.note = note;
        this.year = year;
        this.semester = semester;
        this.status = status;
        this.classTeacher = classTeacher;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String classTeacher;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getEmployment() {
        return employment;
    }

    public void setEmployment(Integer employment) {
        this.employment = employment;
    }

    public Integer getGraduating() {
        return graduating;
    }

    public void setGraduating(Integer graduating) {
        this.graduating = graduating;
    }

    public Integer getDisciplinaryRate() {
        return disciplinaryRate;
    }

    public void setDisciplinaryRate(Integer disciplinaryRate) {
        this.disciplinaryRate = disciplinaryRate;
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

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher == null ? null : classTeacher.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", employment=").append(employment);
        sb.append(", graduating=").append(graduating);
        sb.append(", disciplinaryRate=").append(disciplinaryRate);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", semester=").append(semester);
        sb.append(", classTeacher=").append(classTeacher);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}