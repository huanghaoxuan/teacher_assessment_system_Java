package com.example.demo.model;

import java.io.Serializable;

public class TeachingconstructionTextbookconstruction implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String name;

    private String press;

    private String publicationTime;

    private String textbooksNumber;

    private String character;

    private String yesorno;

    private String note;

    private Integer year;

    private static final long serialVersionUID = 1L;

    public TeachingconstructionTextbookconstruction() {
    }

    public TeachingconstructionTextbookconstruction(String classTeacher, String status, String name, String press, String publicationTime, String textbooksNumber, String character, String yesorno, String note, Integer year) {
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
    }

    public TeachingconstructionTextbookconstruction(Integer id, String classTeacher, String status, String name, String press, String publicationTime, String textbooksNumber, String character, String yesorno, String note, Integer year) {
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

    public String getTextbooksNumber() {
        return textbooksNumber;
    }

    public void setTextbooksNumber(String textbooksNumber) {
        this.textbooksNumber = textbooksNumber == null ? null : textbooksNumber.trim();
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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}