package com.example.demo.model;

import java.io.Serializable;

public class OthersAnnualreviewstatus implements Serializable {
    private Integer id;

    private String assessmentStatus;

    private String note;

    private Integer year;

    private String status;

    private String classTeacher;

    private static final long serialVersionUID = 1L;

    public OthersAnnualreviewstatus() {
    }

    public OthersAnnualreviewstatus(Integer id, String assessmentStatus, String note, Integer year, String status, String classTeacher) {
        this.id = id;
        this.assessmentStatus = assessmentStatus;
        this.note = note;
        this.year = year;
        this.status = status;
        this.classTeacher = classTeacher;
    }

    public OthersAnnualreviewstatus(String assessmentStatus, String note, Integer year, String status, String classTeacher) {
        this.assessmentStatus = assessmentStatus;
        this.note = note;
        this.year = year;
        this.status = status;
        this.classTeacher = classTeacher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssessmentStatus() {
        return assessmentStatus;
    }

    public void setAssessmentStatus(String assessmentStatus) {
        this.assessmentStatus = assessmentStatus == null ? null : assessmentStatus.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        sb.append(", assessmentStatus=").append(assessmentStatus);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", status=").append(status);
        sb.append(", classTeacher=").append(classTeacher);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}