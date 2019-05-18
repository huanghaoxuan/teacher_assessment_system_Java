package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "fruit_class_teaching")
public class FruitClassTeaching implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "class_name")
    private String name;

    @Column(name = "class_character")
    private String character;

    @Column(name = "class_type")
    private String type;

    @Column(name = "class_yesorno")
    private String yesorno;

    @Column(name = "class_credits")
    private BigDecimal credits;

    @Column(name = "class_hours")
    private BigDecimal hours;

    @Column(name = "class_number")
    private Byte classesNumber;

    @Column(name = "class_parallel")
    private Integer parallelClassesNumber;

    @Column(name = "class_homework_number")
    private Integer homeworkNumber;

    @Column(name = "class_correcting_number")
    private Integer correctingNumber;

    @Column(name = "class_answering_number")
    private Integer answeringNumber;

    @Column(name = "class_note")
    private String note;

    @Column(name = "class_year")
    private int year;

    @Column(name = "class_status")
    private String status;

    @Column(name = "class_teacher")
    private String classTeacher;

    @Column(name = "class_semester")
    private int semester;

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
        this.name = name;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYesorno() {
        return yesorno;
    }

    public void setYesorno(String yesorno) {
        this.yesorno = yesorno;
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

    public Byte getClassesNumber() {
        return classesNumber;
    }

    public void setClassesNumber(Byte classesNumber) {
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
        this.note = note;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return class_teacher
     */
    public String getClassTeacher() {
        return classTeacher;
    }

    /**
     * @param classTeacher
     */
    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }
}