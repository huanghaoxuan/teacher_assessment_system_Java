package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "fruit_experiment_teaching")
public class FruitExperimentTeaching implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String character;

    @Column(name = "all_time")
    private BigDecimal allTime;

    @Column(name = "week_time")
    private BigDecimal weekTime;

    @Column(name = "student_number")
    private Integer studentNumber;

    @Column(name = "parallel_chasses_number")
    private Integer parallelChassesNumber;

    @Column(name = "grouping_per_class_number")
    private Integer groupingPerClassNumber;

    @Column(name = "instructors_number")
    private Integer instructorsNumber;

    @Column(name = "experiment_type")
    private String experimentType;

    @Column(name = "report_number")
    private Integer reportNumber;

    @Column(name = "corrections_number")
    private Integer correctionsNumber;

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
     * @return all_time
     */
    public BigDecimal getAllTime() {
        return allTime;
    }

    /**
     * @param allTime
     */
    public void setAllTime(BigDecimal allTime) {
        this.allTime = allTime;
    }

    /**
     * @return week_time
     */
    public BigDecimal getWeekTime() {
        return weekTime;
    }

    /**
     * @param weekTime
     */
    public void setWeekTime(BigDecimal weekTime) {
        this.weekTime = weekTime;
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
     * @return parallel_chasses_number
     */
    public Integer getParallelChassesNumber() {
        return parallelChassesNumber;
    }

    /**
     * @param parallelChassesNumber
     */
    public void setParallelChassesNumber(Integer parallelChassesNumber) {
        this.parallelChassesNumber = parallelChassesNumber;
    }

    /**
     * @return grouping_per_class_number
     */
    public Integer getGroupingPerClassNumber() {
        return groupingPerClassNumber;
    }

    /**
     * @param groupingPerClassNumber
     */
    public void setGroupingPerClassNumber(Integer groupingPerClassNumber) {
        this.groupingPerClassNumber = groupingPerClassNumber;
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
     * @return experiment_type
     */
    public String getExperimentType() {
        return experimentType;
    }

    /**
     * @param experimentType
     */
    public void setExperimentType(String experimentType) {
        this.experimentType = experimentType;
    }

    /**
     * @return report_number
     */
    public Integer getReportNumber() {
        return reportNumber;
    }

    /**
     * @param reportNumber
     */
    public void setReportNumber(Integer reportNumber) {
        this.reportNumber = reportNumber;
    }

    /**
     * @return corrections_number
     */
    public Integer getCorrectionsNumber() {
        return correctionsNumber;
    }

    /**
     * @param correctionsNumber
     */
    public void setCorrectionsNumber(Integer correctionsNumber) {
        this.correctionsNumber = correctionsNumber;
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