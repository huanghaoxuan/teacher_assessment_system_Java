package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "fruit_guide_the_great_creation")
public class FruitGuideTheGreatCreation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String level;

    private String source;

    @Column(name = "project_status")
    private String projectStatus;

    @Column(name = "title_level")
    private String titleLevel;

    @Column(name = "student_grade")
    private String studentGrade;

    @Column(name = "student_number")
    private Integer studentNumber;

    private String effect;

    @Column(name = "mentors_number")
    private Integer mentorsNumber;

    @Column(name = "mentors_level")
    private String mentorsLevel;

    private String note;

    private Integer year;

    private Integer semester;

    private String status;

    private String teacher;

    private BigDecimal assign;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return project_status
     */
    public String getProjectStatus() {
        return projectStatus;
    }

    /**
     * @param projectStatus
     */
    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    /**
     * @return title_level
     */
    public String getTitleLevel() {
        return titleLevel;
    }

    /**
     * @param titleLevel
     */
    public void setTitleLevel(String titleLevel) {
        this.titleLevel = titleLevel;
    }

    /**
     * @return student_grade
     */
    public String getStudentGrade() {
        return studentGrade;
    }

    /**
     * @param studentGrade
     */
    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    /**
     * @return student_number
     */
    public Integer getStudentNumber() {
        return studentNumber;
    }

    /**
     * @param studentNumber
     */
    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * @return effect
     */
    public String getEffect() {
        return effect;
    }

    /**
     * @param effect
     */
    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * @return mentors_number
     */
    public Integer getMentorsNumber() {
        return mentorsNumber;
    }

    /**
     * @param mentorsNumber
     */
    public void setMentorsNumber(Integer mentorsNumber) {
        this.mentorsNumber = mentorsNumber;
    }

    /**
     * @return mentors_level
     */
    public String getMentorsLevel() {
        return mentorsLevel;
    }

    /**
     * @param mentorsLevel
     */
    public void setMentorsLevel(String mentorsLevel) {
        this.mentorsLevel = mentorsLevel;
    }

    /**
     * @return note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * @return semester
     */
    public Integer getSemester() {
        return semester;
    }

    /**
     * @param semester
     */
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return teacher
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * @param teacher
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    /**
     * @return assign
     */
    public BigDecimal getAssign() {
        return assign;
    }

    /**
     * @param assign
     */
    public void setAssign(BigDecimal assign) {
        this.assign = assign;
    }
}