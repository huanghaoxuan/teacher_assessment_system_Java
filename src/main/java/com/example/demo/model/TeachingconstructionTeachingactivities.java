package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TeachingconstructionTeachingactivities implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private BigDecimal absent;

    private BigDecimal lateDeparture;

    private String note;

    private Integer year;

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

    public TeachingconstructionTeachingactivities() {
    }

    public TeachingconstructionTeachingactivities(String classTeacher, String status, BigDecimal absent, BigDecimal lateDeparture, String note, Integer year) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.absent = absent;
        this.lateDeparture = lateDeparture;
        this.note = note;
        this.year = year;
    }

    public TeachingconstructionTeachingactivities(Integer id, String classTeacher, String status, BigDecimal absent, BigDecimal lateDeparture, String note, Integer year) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.absent = absent;
        this.lateDeparture = lateDeparture;
        this.note = note;
        this.year = year;
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

    public BigDecimal getAbsent() {
        return absent;
    }

    public void setAbsent(BigDecimal absent) {
        this.absent = absent;
    }

    public BigDecimal getLateDeparture() {
        return lateDeparture;
    }

    public void setLateDeparture(BigDecimal lateDeparture) {
        this.lateDeparture = lateDeparture;
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
        sb.append(", absent=").append(absent);
        sb.append(", lateDeparture=").append(lateDeparture);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}