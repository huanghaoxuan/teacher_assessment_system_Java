package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "fruit_graduation_design_guide")
public class FruitGraduationDesignGuide implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String character;

    private String level;

    @Column(name = "winners_number")
    private Integer winnersNumber;

    private String note;

    private Integer year;

    private Integer semester;

    private String status;

    private String teacher;

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
     * @return character
     */
    public String getCharacter() {
        return character;
    }

    /**
     * @param character
     */
    public void setCharacter(String character) {
        this.character = character;
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
     * @return winners_number
     */
    public Integer getWinnersNumber() {
        return winnersNumber;
    }

    /**
     * @param winnersNumber
     */
    public void setWinnersNumber(Integer winnersNumber) {
        this.winnersNumber = winnersNumber;
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
}