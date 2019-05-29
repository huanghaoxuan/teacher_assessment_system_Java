package com.example.demo.model;

import java.io.Serializable;

public class ScientificresearchPatentapplication implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String name;

    private String tpye;

    private String publicationDate;

    private String hasProcessing;

    public ScientificresearchPatentapplication() {
    }

    public ScientificresearchPatentapplication(String classTeacher, String status, String name, String tpye, String publicationDate, String hasProcessing, String hasAuthorized, String hasPatent, String note, Integer year) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.tpye = tpye;
        this.publicationDate = publicationDate;
        this.hasProcessing = hasProcessing;
        this.hasAuthorized = hasAuthorized;
        this.hasPatent = hasPatent;
        this.note = note;
        this.year = year;
    }

    public ScientificresearchPatentapplication(Integer id, String classTeacher, String status, String name, String tpye, String publicationDate, String hasProcessing, String hasAuthorized, String hasPatent, String note, Integer year) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.tpye = tpye;
        this.publicationDate = publicationDate;
        this.hasProcessing = hasProcessing;
        this.hasAuthorized = hasAuthorized;
        this.hasPatent = hasPatent;
        this.note = note;
        this.year = year;
    }

    private String hasAuthorized;

    private String hasPatent;

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

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate == null ? null : publicationDate.trim();
    }

    public String getHasProcessing() {
        return hasProcessing;
    }

    public void setHasProcessing(String hasProcessing) {
        this.hasProcessing = hasProcessing == null ? null : hasProcessing.trim();
    }

    public String getHasAuthorized() {
        return hasAuthorized;
    }

    public void setHasAuthorized(String hasAuthorized) {
        this.hasAuthorized = hasAuthorized == null ? null : hasAuthorized.trim();
    }

    public String getHasPatent() {
        return hasPatent;
    }

    public void setHasPatent(String hasPatent) {
        this.hasPatent = hasPatent == null ? null : hasPatent.trim();
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
        sb.append(", tpye=").append(tpye);
        sb.append(", publicationDate=").append(publicationDate);
        sb.append(", hasProcessing=").append(hasProcessing);
        sb.append(", hasAuthorized=").append(hasAuthorized);
        sb.append(", hasPatent=").append(hasPatent);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}