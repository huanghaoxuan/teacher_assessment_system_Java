package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TeacheringworkClassroomteaching implements Serializable {
    private Integer id;

    private String classTeacher;

    private String status;

    private String name;

    private String character;

    private String type;

    private String yesorno;

    private BigDecimal credits;

    public TeacheringworkClassroomteaching() {
    }

    public TeacheringworkClassroomteaching(String classTeacher, String status, String name, String character, String type, String yesorno, BigDecimal credits, BigDecimal hours, Integer classesNumber, Integer parallelClassesNumber, Integer homeworkNumber, Integer correctingNumber, Integer answeringNumber, String note, Integer year, Integer semester) {
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.character = character;
        this.type = type;
        this.yesorno = yesorno;
        this.credits = credits;
        this.hours = hours;
        this.classesNumber = classesNumber;
        this.parallelClassesNumber = parallelClassesNumber;
        this.homeworkNumber = homeworkNumber;
        this.correctingNumber = correctingNumber;
        this.answeringNumber = answeringNumber;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    public TeacheringworkClassroomteaching(Integer id, String classTeacher, String status, String name, String character, String type, String yesorno, BigDecimal credits, BigDecimal hours, Integer classesNumber, Integer parallelClassesNumber, Integer homeworkNumber, Integer correctingNumber, Integer answeringNumber, String note, Integer year, Integer semester) {
        this.id = id;
        this.classTeacher = classTeacher;
        this.status = status;
        this.name = name;
        this.character = character;
        this.type = type;
        this.yesorno = yesorno;
        this.credits = credits;
        this.hours = hours;
        this.classesNumber = classesNumber;
        this.parallelClassesNumber = parallelClassesNumber;
        this.homeworkNumber = homeworkNumber;
        this.correctingNumber = correctingNumber;
        this.answeringNumber = answeringNumber;
        this.note = note;
        this.year = year;
        this.semester = semester;
    }

    private BigDecimal hours;

    private Integer classesNumber;

    private Integer parallelClassesNumber;

    private Integer homeworkNumber;

    private Integer correctingNumber;

    private Integer answeringNumber;

    private String note;

    private Integer year;

    private Integer semester;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getYesorno() {
        return yesorno;
    }

    public void setYesorno(String yesorno) {
        this.yesorno = yesorno == null ? null : yesorno.trim();
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

    public Integer getClassesNumber() {
        return classesNumber;
    }

    public void setClassesNumber(Integer classesNumber) {
        this.classesNumber = classesNumber;
    }

    public Integer getParallelClassesNumber() {
        return parallelClassesNumber;
    }

    public void setParallelClassesNumber(Integer parallelClassesNumber) {
        this.parallelClassesNumber = parallelClassesNumber;
    }

    public Integer getHomeworkNumber() {
        return homeworkNumber;
    }

    public void setHomeworkNumber(Integer homeworkNumber) {
        this.homeworkNumber = homeworkNumber;
    }

    public Integer getCorrectingNumber() {
        return correctingNumber;
    }

    public void setCorrectingNumber(Integer correctingNumber) {
        this.correctingNumber = correctingNumber;
    }

    public Integer getAnsweringNumber() {
        return answeringNumber;
    }

    public void setAnsweringNumber(Integer answeringNumber) {
        this.answeringNumber = answeringNumber;
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

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
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
        sb.append(", type=").append(type);
        sb.append(", yesorno=").append(yesorno);
        sb.append(", credits=").append(credits);
        sb.append(", hours=").append(hours);
        sb.append(", classesNumber=").append(classesNumber);
        sb.append(", parallelClassesNumber=").append(parallelClassesNumber);
        sb.append(", homeworkNumber=").append(homeworkNumber);
        sb.append(", correctingNumber=").append(correctingNumber);
        sb.append(", answeringNumber=").append(answeringNumber);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", semester=").append(semester);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}