package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TeachingconstructionLaboratoryconstruction implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String name;

    private String character;

    private String contribution;

    private BigDecimal hours;

    private Integer peopleNumber;

    private String professional;

    public TeachingconstructionLaboratoryconstruction() {
    }

    public TeachingconstructionLaboratoryconstruction(String classTeacher, String status, String name, String character, String contribution, BigDecimal hours, Integer peopleNumber, String professional, String grade, String controlDeviceName, String reformingDeviceName, String money, String note, Integer year) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.character = character;
        this.contribution = contribution;
        this.hours = hours;
        this.peopleNumber = peopleNumber;
        this.professional = professional;
        this.grade = grade;
        this.controlDeviceName = controlDeviceName;
        this.reformingDeviceName = reformingDeviceName;
        this.money = money;
        this.note = note;
        this.year = year;
    }

    public TeachingconstructionLaboratoryconstruction(Integer id, String classTeacher, String status, String name, String character, String contribution, BigDecimal hours, Integer peopleNumber, String professional, String grade, String controlDeviceName, String reformingDeviceName, String money, String note, Integer year) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.character = character;
        this.contribution = contribution;
        this.hours = hours;
        this.peopleNumber = peopleNumber;
        this.professional = professional;
        this.grade = grade;
        this.controlDeviceName = controlDeviceName;
        this.reformingDeviceName = reformingDeviceName;
        this.money = money;
        this.note = note;
        this.year = year;
    }

    private String grade;

    private String controlDeviceName;

    private String reformingDeviceName;

    private String money;

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

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character == null ? null : character.trim();
    }

    public String getContribution() {
        return contribution;
    }

    public void setContribution(String contribution) {
        this.contribution = contribution == null ? null : contribution.trim();
    }

    public BigDecimal getHours() {
        return hours;
    }

    public void setHours(BigDecimal hours) {
        this.hours = hours;
    }

    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getControlDeviceName() {
        return controlDeviceName;
    }

    public void setControlDeviceName(String controlDeviceName) {
        this.controlDeviceName = controlDeviceName == null ? null : controlDeviceName.trim();
    }

    public String getReformingDeviceName() {
        return reformingDeviceName;
    }

    public void setReformingDeviceName(String reformingDeviceName) {
        this.reformingDeviceName = reformingDeviceName == null ? null : reformingDeviceName.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
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
        sb.append(", character=").append(character);
        sb.append(", contribution=").append(contribution);
        sb.append(", hours=").append(hours);
        sb.append(", peopleNumber=").append(peopleNumber);
        sb.append(", professional=").append(professional);
        sb.append(", grade=").append(grade);
        sb.append(", controlDeviceName=").append(controlDeviceName);
        sb.append(", reformingDeviceName=").append(reformingDeviceName);
        sb.append(", money=").append(money);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}