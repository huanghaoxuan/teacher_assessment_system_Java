package com.example.demo.model;

import java.io.Serializable;

public class PublicaffairsCounselor implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String schoolLevel;

    private String provinceLevel;

    private String caucusLaval;

    private String startTime;

    private String endTime;

    private String note;

    private Integer year;

    private static final long serialVersionUID = 1L;

    public PublicaffairsCounselor() {
    }

    public PublicaffairsCounselor(String classTeacher, String status, String schoolLevel, String provinceLevel, String caucusLaval, String startTime, String endTime, String note, Integer year) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.schoolLevel = schoolLevel;
        this.provinceLevel = provinceLevel;
        this.caucusLaval = caucusLaval;
        this.startTime = startTime;
        this.endTime = endTime;
        this.note = note;
        this.year = year;
    }

    public PublicaffairsCounselor(Integer id, String classTeacher, String status, String schoolLevel, String provinceLevel, String caucusLaval, String startTime, String endTime, String note, Integer year) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.schoolLevel = schoolLevel;
        this.provinceLevel = provinceLevel;
        this.caucusLaval = caucusLaval;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public String getSchoolLevel() {
        return schoolLevel;
    }

    public void setSchoolLevel(String schoolLevel) {
        this.schoolLevel = schoolLevel == null ? null : schoolLevel.trim();
    }

    public String getProvinceLevel() {
        return provinceLevel;
    }

    public void setProvinceLevel(String provinceLevel) {
        this.provinceLevel = provinceLevel == null ? null : provinceLevel.trim();
    }

    public String getCaucusLaval() {
        return caucusLaval;
    }

    public void setCaucusLaval(String caucusLaval) {
        this.caucusLaval = caucusLaval == null ? null : caucusLaval.trim();
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
        sb.append(", schoolLevel=").append(schoolLevel);
        sb.append(", provinceLevel=").append(provinceLevel);
        sb.append(", caucusLaval=").append(caucusLaval);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}