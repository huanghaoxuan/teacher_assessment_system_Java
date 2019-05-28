package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "fruit_guide_contest")
public class FruitGuideContest implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String level;

    @Column(name = "prize_persons_number")
    private Integer prizePersonsNumber;

    @Column(name = "first_persons_number")
    private Integer firstPersonsNumber;

    @Column(name = "second_persons_number")
    private Integer secondPersonsNumber;

    @Column(name = "third_persons_number")
    private Integer thirdPersonsNumber;

    @Column(name = "outstanding_awards_number")
    private Integer outstandingAwardsNumber;

    @Column(name = "guidance_type")
    private String guidanceType;

    @Column(name = "instructors_number")
    private Integer instructorsNumber;

    private String note;

    private Integer year;

    private Integer semester;

    private String teacher;

    private String status;

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
     * @return prize_persons_number
     */
    public Integer getPrizePersonsNumber() {
        return prizePersonsNumber;
    }

    /**
     * @param prizePersonsNumber
     */
    public void setPrizePersonsNumber(Integer prizePersonsNumber) {
        this.prizePersonsNumber = prizePersonsNumber;
    }

    /**
     * @return first_persons_number
     */
    public Integer getFirstPersonsNumber() {
        return firstPersonsNumber;
    }

    /**
     * @param firstPersonsNumber
     */
    public void setFirstPersonsNumber(Integer firstPersonsNumber) {
        this.firstPersonsNumber = firstPersonsNumber;
    }

    /**
     * @return second_persons_number
     */
    public Integer getSecondPersonsNumber() {
        return secondPersonsNumber;
    }

    /**
     * @param secondPersonsNumber
     */
    public void setSecondPersonsNumber(Integer secondPersonsNumber) {
        this.secondPersonsNumber = secondPersonsNumber;
    }

    /**
     * @return third_persons_number
     */
    public Integer getThirdPersonsNumber() {
        return thirdPersonsNumber;
    }

    /**
     * @param thirdPersonsNumber
     */
    public void setThirdPersonsNumber(Integer thirdPersonsNumber) {
        this.thirdPersonsNumber = thirdPersonsNumber;
    }

    /**
     * @return outstanding_awards_number
     */
    public Integer getOutstandingAwardsNumber() {
        return outstandingAwardsNumber;
    }

    /**
     * @param outstandingAwardsNumber
     */
    public void setOutstandingAwardsNumber(Integer outstandingAwardsNumber) {
        this.outstandingAwardsNumber = outstandingAwardsNumber;
    }

    /**
     * @return guidance_type
     */
    public String getGuidanceType() {
        return guidanceType;
    }

    /**
     * @param guidanceType
     */
    public void setGuidanceType(String guidanceType) {
        this.guidanceType = guidanceType;
    }

    /**
     * @return instructors_number
     */
    public Integer getInstructorsNumber() {
        return instructorsNumber;
    }

    /**
     * @param instructorsNumber
     */
    public void setInstructorsNumber(Integer instructorsNumber) {
        this.instructorsNumber = instructorsNumber;
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