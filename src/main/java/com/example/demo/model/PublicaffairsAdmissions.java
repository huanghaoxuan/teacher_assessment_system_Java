package com.example.demo.model;

import java.io.Serializable;

public class PublicaffairsAdmissions implements Serializable {
    private Integer id;

    private String admissionsHeader;

    private String performance;

    private String result;

    private String address;

    private String note;

    private Integer year;

    private String classTeacher;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdmissionsHeader() {
        return admissionsHeader;
    }

    public PublicaffairsAdmissions() {
    }

    public PublicaffairsAdmissions(String admissionsHeader, String performance, String result, String address, String note, Integer year, String classTeacher) {
        this.admissionsHeader = admissionsHeader;
        this.performance = performance;
        this.result = result;
        this.address = address;
        this.note = note;
        this.year = year;
        this.classTeacher = classTeacher;
    }

    public PublicaffairsAdmissions(Integer id, String admissionsHeader, String performance, String result, String address, String note, Integer year, String classTeacher) {
        this.id = id;
        this.admissionsHeader = admissionsHeader;
        this.performance = performance;
        this.result = result;
        this.address = address;
        this.note = note;
        this.year = year;
        this.classTeacher = classTeacher;
    }

    public void setAdmissionsHeader(String admissionsHeader) {
        this.admissionsHeader = admissionsHeader == null ? null : admissionsHeader.trim();
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance == null ? null : performance.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
        sb.append(", admissionsHeader=").append(admissionsHeader);
        sb.append(", performance=").append(performance);
        sb.append(", result=").append(result);
        sb.append(", address=").append(address);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", classTeacher=").append(classTeacher);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}