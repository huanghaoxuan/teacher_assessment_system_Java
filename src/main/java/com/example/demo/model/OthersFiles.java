package com.example.demo.model;

import java.io.Serializable;

public class OthersFiles implements Serializable {
    private Integer id;

    private String name;

    private String time;

    private String rank;

    private Integer peopleNumber;

    private String useScope;

    private String note;

    private Integer year;

    private String semester;

    public OthersFiles() {
    }

    public OthersFiles(String name, String time, String rank, Integer peopleNumber, String useScope, String note, Integer year, String semester, String status, String classTeacher) {
        this.name = name;
        this.time = time;
        this.rank = rank;
        this.peopleNumber = peopleNumber;
        this.useScope = useScope;
        this.note = note;
        this.year = year;
        this.semester = semester;
        this.status = status;
        this.classTeacher = classTeacher;
    }

    public OthersFiles(Integer id, String name, String time, String rank, Integer peopleNumber, String useScope, String note, Integer year, String semester, String status, String classTeacher) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.rank = rank;
        this.peopleNumber = peopleNumber;
        this.useScope = useScope;
        this.note = note;
        this.year = year;
        this.semester = semester;
        this.status = status;
        this.classTeacher = classTeacher;
    }

    private String status;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public String getUseScope() {
        return useScope;
    }

    public void setUseScope(String useScope) {
        this.useScope = useScope == null ? null : useScope.trim();
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
        sb.append(", name=").append(name);
        sb.append(", time=").append(time);
        sb.append(", rank=").append(rank);
        sb.append(", peopleNumber=").append(peopleNumber);
        sb.append(", useScope=").append(useScope);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", semester=").append(semester);
        sb.append(", status=").append(status);
        sb.append(", classTeacher=").append(classTeacher);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}