package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TeachingconstructionTextbookconstruction implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String name;

    private String press;

    private String publicationTime;

    private BigDecimal textbooksNumber;

    private String classTeacherName;//老师姓名

    public String getClassTeacherName() {
        return classTeacherName;
    }

    public void setClassTeacherName(String classTeacherName) {
        this.classTeacherName = classTeacherName;
    }

    private String character;

    private String yesorno;

    private String note;

    private Integer year;

    private String semester;

    private BigDecimal score;

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
    public TeachingconstructionTextbookconstruction() {
    }

    public TeachingconstructionTextbookconstruction(String classTeacher, String status, String name, String press, String publicationTime, BigDecimal textbooksNumber, String character, String yesorno, String note, Integer year, String semester) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.press = press;
        this.publicationTime = publicationTime;
        this.textbooksNumber = textbooksNumber;
        this.character = character;
        this.yesorno = yesorno;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    public TeachingconstructionTextbookconstruction(Integer id, String classTeacher, String status, String name, String press, String publicationTime, BigDecimal textbooksNumber, String character, String yesorno, String note, Integer year, String semester) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.press = press;
        this.publicationTime = publicationTime;
        this.textbooksNumber = textbooksNumber;
        this.character = character;
        this.yesorno = yesorno;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

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

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press == null ? null : press.trim();
    }

    public String getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(String publicationTime) {
        this.publicationTime = publicationTime == null ? null : publicationTime.trim();
    }

    public BigDecimal getTextbooksNumber() {
        return textbooksNumber;
    }

    public void setTextbooksNumber(BigDecimal textbooksNumber) {
        this.textbooksNumber = textbooksNumber;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character == null ? null : character.trim();
    }

    public String getYesorno() {
        return yesorno;
    }

    public void setYesorno(String yesorno) {
        this.yesorno = yesorno == null ? null : yesorno.trim();
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
        sb.append(", press=").append(press);
        sb.append(", publicationTime=").append(publicationTime);
        sb.append(", textbooksNumber=").append(textbooksNumber);
        sb.append(", character=").append(character);
        sb.append(", yesorno=").append(yesorno);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", semester=").append(semester);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}