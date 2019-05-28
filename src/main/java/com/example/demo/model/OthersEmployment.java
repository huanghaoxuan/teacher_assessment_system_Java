package com.example.demo.model;

import java.io.Serializable;

public class OthersEmployment implements Serializable {
    private Integer id;

    private String name;

    private Integer employment;

    private Integer graduating;

    private Integer disciplinaryRate;

    private String note;

    private Integer year;

    private String classTeacher;

    private static final long serialVersionUID = 1L;

    public OthersEmployment() {
    }

    public OthersEmployment(String name, Integer employment, Integer graduating, Integer disciplinaryRate, String note, Integer year, String classTeacher) {
        this.name = name;
        this.employment = employment;
        this.graduating = graduating;
        this.disciplinaryRate = disciplinaryRate;
        this.note = note;
        this.year = year;
        this.classTeacher = classTeacher;
    }

    public OthersEmployment(Integer id, String name, Integer employment, Integer graduating, Integer disciplinaryRate, String note, Integer year, String classTeacher) {
        this.id = id;
        this.name = name;
        this.employment = employment;
        this.graduating = graduating;
        this.disciplinaryRate = disciplinaryRate;
        this.note = note;
        this.year = year;
        this.classTeacher = classTeacher;
    }

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
        sb.append(", classTeacher=").append(classTeacher);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}