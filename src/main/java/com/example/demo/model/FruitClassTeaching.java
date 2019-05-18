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
    private String className;

    @Column(name = "class_character")
    private String classCharacter;

    @Column(name = "class_type")
    private String classType;

    @Column(name = "class_yesorno")
    private String classYesorno;

    @Column(name = "class_credits")
    private BigDecimal classCredits;

    @Column(name = "class_hours")
    private BigDecimal classHours;

    @Column(name = "class_number")
    private Byte classNumber;

    @Column(name = "class_parallel")
    private Integer classParallel;

    @Column(name = "class_homework_number")
    private Integer classHomeworkNumber;

    @Column(name = "class_correcting_number")
    private Integer classCorrectingNumber;

    @Column(name = "class_answering_number")
    private Integer classAnsweringNumber;

    @Column(name = "class_note")
    private String classNote;

    @Column(name = "class_year")
    private String classYear;

    @Column(name = "class_status")
    private String classStatus;

    @Column(name = "class_teacher")
    private String classTeacher;

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
     * @return class_name
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return class_character
     */
    public String getClassCharacter() {
        return classCharacter;
    }

    /**
     * @param classCharacter
     */
    public void setClassCharacter(String classCharacter) {
        this.classCharacter = classCharacter;
    }

    /**
     * @return class_type
     */
    public String getClassType() {
        return classType;
    }

    /**
     * @param classType
     */
    public void setClassType(String classType) {
        this.classType = classType;
    }

    /**
     * @return class_yesorno
     */
    public String getClassYesorno() {
        return classYesorno;
    }

    /**
     * @param classYesorno
     */
    public void setClassYesorno(String classYesorno) {
        this.classYesorno = classYesorno;
    }

    /**
     * @return class_credits
     */
    public BigDecimal getClassCredits() {
        return classCredits;
    }

    /**
     * @param classCredits
     */
    public void setClassCredits(BigDecimal classCredits) {
        this.classCredits = classCredits;
    }

    /**
     * @return class_hours
     */
    public BigDecimal getClassHours() {
        return classHours;
    }

    /**
     * @param classHours
     */
    public void setClassHours(BigDecimal classHours) {
        this.classHours = classHours;
    }

    /**
     * @return class_number
     */
    public Byte getClassNumber() {
        return classNumber;
    }

    /**
     * @param classNumber
     */
    public void setClassNumber(Byte classNumber) {
        this.classNumber = classNumber;
    }

    /**
     * @return class_parallel
     */
    public Integer getClassParallel() {
        return classParallel;
    }

    /**
     * @param classParallel
     */
    public void setClassParallel(Integer classParallel) {
        this.classParallel = classParallel;
    }

    /**
     * @return class_homework_number
     */
    public Integer getClassHomeworkNumber() {
        return classHomeworkNumber;
    }

    /**
     * @param classHomeworkNumber
     */
    public void setClassHomeworkNumber(Integer classHomeworkNumber) {
        this.classHomeworkNumber = classHomeworkNumber;
    }

    /**
     * @return class_correcting_number
     */
    public Integer getClassCorrectingNumber() {
        return classCorrectingNumber;
    }

    /**
     * @param classCorrectingNumber
     */
    public void setClassCorrectingNumber(Integer classCorrectingNumber) {
        this.classCorrectingNumber = classCorrectingNumber;
    }

    /**
     * @return class_answering_number
     */
    public Integer getClassAnsweringNumber() {
        return classAnsweringNumber;
    }

    /**
     * @param classAnsweringNumber
     */
    public void setClassAnsweringNumber(Integer classAnsweringNumber) {
        this.classAnsweringNumber = classAnsweringNumber;
    }

    /**
     * @return class_note
     */
    public String getClassNote() {
        return classNote;
    }

    /**
     * @param classNote
     */
    public void setClassNote(String classNote) {
        this.classNote = classNote;
    }

    /**
     * @return class_year
     */
    public String getClassYear() {
        return classYear;
    }

    /**
     * @param classYear
     */
    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

    /**
     * @return class_status
     */
    public String getClassStatus() {
        return classStatus;
    }

    /**
     * @param classStatus
     */
    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
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