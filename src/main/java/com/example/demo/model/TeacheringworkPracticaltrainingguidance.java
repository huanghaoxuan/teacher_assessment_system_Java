package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TeacheringworkPracticaltrainingguidance implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String name;

    private BigDecimal credits;

    private BigDecimal hours;

    private Integer studentNumber;

    private Integer loopsNumber;

    public TeacheringworkPracticaltrainingguidance() {
    }

    public TeacheringworkPracticaltrainingguidance(String classTeacher, String status, String name, BigDecimal credits, BigDecimal hours, Integer studentNumber, Integer loopsNumber, String trainingType, String results, String note, Integer year, String semester) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.credits = credits;
        this.hours = hours;
        this.studentNumber = studentNumber;
        this.loopsNumber = loopsNumber;
        this.trainingType = trainingType;
        this.results = results;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    public TeacheringworkPracticaltrainingguidance(Integer id, String classTeacher, String status, String name, BigDecimal credits, BigDecimal hours, Integer studentNumber, Integer loopsNumber, String trainingType, String results, String note, Integer year, String semester) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.credits = credits;
        this.hours = hours;
        this.studentNumber = studentNumber;
        this.loopsNumber = loopsNumber;
        this.trainingType = trainingType;
        this.results = results;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    private String trainingType;

    private String results;

    private String note;

    private Integer year;

    private String semester;

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

    public BigDecimal getCredits() {
        return credits;
    }

    public void setCredits(BigDecimal credits) {
        this.credits = credits;
    }

    public BigDecimal getHours() {
        return hours;
    }

    public void setHours(BigDecimal hours) {
        this.hours = hours;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Integer getLoopsNumber() {
        return loopsNumber;
    }

    public void setLoopsNumber(Integer loopsNumber) {
        this.loopsNumber = loopsNumber;
    }

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType == null ? null : trainingType.trim();
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results == null ? null : results.trim();
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
        sb.append(", credits=").append(credits);
        sb.append(", hours=").append(hours);
        sb.append(", studentNumber=").append(studentNumber);
        sb.append(", loopsNumber=").append(loopsNumber);
        sb.append(", trainingType=").append(trainingType);
        sb.append(", results=").append(results);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", semester=").append(semester);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}