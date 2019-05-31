package com.example.demo.model;

import java.io.Serializable;

public class OthersComprehensiveawardwinning implements Serializable {
    private Integer id;

    private String name;

    private String time;

    private String department;

    private String level;

    private String ranking;

    private Integer peopleNumber;

    private String note;

    private Integer year;

    public OthersComprehensiveawardwinning() {
    }

    public OthersComprehensiveawardwinning(String name, String time, String department, String level, String ranking, Integer peopleNumber, String note, Integer year, String semester, String status, String classTeacher) {
        this.name = name;
        this.time = time;
        this.department = department;
        this.level = level;
        this.ranking = ranking;
        this.peopleNumber = peopleNumber;
        this.note = note;
        this.year = year;
        this.semester = semester;
        this.status = status;
        this.classTeacher = classTeacher;
    }

    public OthersComprehensiveawardwinning(Integer id, String name, String time, String department, String level, String ranking, Integer peopleNumber, String note, Integer year, String semester, String status, String classTeacher) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.department = department;
        this.level = level;
        this.ranking = ranking;
        this.peopleNumber = peopleNumber;
        this.note = note;
        this.year = year;
        this.semester = semester;
        this.status = status;
        this.classTeacher = classTeacher;
    }

    private String semester;

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking == null ? null : ranking.trim();
    }

    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
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
        sb.append(", department=").append(department);
        sb.append(", level=").append(level);
        sb.append(", ranking=").append(ranking);
        sb.append(", peopleNumber=").append(peopleNumber);
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