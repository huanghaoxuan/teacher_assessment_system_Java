package com.example.demo.model;

import java.io.Serializable;

public class PublicaffairsEmployment implements Serializable {
    private Integer id;

    private Integer directEmploymentNumber;

    private Integer helpConnectEmploymentNumber;

    private Integer participationInEmploymentGuidanceNumber;

    private Integer mentoringExaminationCoursesNumber;

    private Integer helpAdmitEntranceNumber;

    private Integer guideEntrepreneurshipNumber;

    private String note;

    private Integer year;

    public PublicaffairsEmployment() {
    }

    public PublicaffairsEmployment(Integer directEmploymentNumber, Integer helpConnectEmploymentNumber, Integer participationInEmploymentGuidanceNumber, Integer mentoringExaminationCoursesNumber, Integer helpAdmitEntranceNumber, Integer guideEntrepreneurshipNumber, String note, Integer year, String semester, String classTeacher, String status) {
        this.directEmploymentNumber = directEmploymentNumber;
        this.helpConnectEmploymentNumber = helpConnectEmploymentNumber;
        this.participationInEmploymentGuidanceNumber = participationInEmploymentGuidanceNumber;
        this.mentoringExaminationCoursesNumber = mentoringExaminationCoursesNumber;
        this.helpAdmitEntranceNumber = helpAdmitEntranceNumber;
        this.guideEntrepreneurshipNumber = guideEntrepreneurshipNumber;
        this.note = note;
        this.year = year;
        this.semester = semester;
        this.classTeacher = classTeacher;
        this.status = status;
    }

    public PublicaffairsEmployment(Integer id, Integer directEmploymentNumber, Integer helpConnectEmploymentNumber, Integer participationInEmploymentGuidanceNumber, Integer mentoringExaminationCoursesNumber, Integer helpAdmitEntranceNumber, Integer guideEntrepreneurshipNumber, String note, Integer year, String semester, String classTeacher, String status) {
        this.id = id;
        this.directEmploymentNumber = directEmploymentNumber;
        this.helpConnectEmploymentNumber = helpConnectEmploymentNumber;
        this.participationInEmploymentGuidanceNumber = participationInEmploymentGuidanceNumber;
        this.mentoringExaminationCoursesNumber = mentoringExaminationCoursesNumber;
        this.helpAdmitEntranceNumber = helpAdmitEntranceNumber;
        this.guideEntrepreneurshipNumber = guideEntrepreneurshipNumber;
        this.note = note;
        this.year = year;
        this.semester = semester;
        this.classTeacher = classTeacher;
        this.status = status;
    }

    private String semester;

    private String classTeacher;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDirectEmploymentNumber() {
        return directEmploymentNumber;
    }

    public void setDirectEmploymentNumber(Integer directEmploymentNumber) {
        this.directEmploymentNumber = directEmploymentNumber;
    }

    public Integer getHelpConnectEmploymentNumber() {
        return helpConnectEmploymentNumber;
    }

    public void setHelpConnectEmploymentNumber(Integer helpConnectEmploymentNumber) {
        this.helpConnectEmploymentNumber = helpConnectEmploymentNumber;
    }

    public Integer getParticipationInEmploymentGuidanceNumber() {
        return participationInEmploymentGuidanceNumber;
    }

    public void setParticipationInEmploymentGuidanceNumber(Integer participationInEmploymentGuidanceNumber) {
        this.participationInEmploymentGuidanceNumber = participationInEmploymentGuidanceNumber;
    }

    public Integer getMentoringExaminationCoursesNumber() {
        return mentoringExaminationCoursesNumber;
    }

    public void setMentoringExaminationCoursesNumber(Integer mentoringExaminationCoursesNumber) {
        this.mentoringExaminationCoursesNumber = mentoringExaminationCoursesNumber;
    }

    public Integer getHelpAdmitEntranceNumber() {
        return helpAdmitEntranceNumber;
    }

    public void setHelpAdmitEntranceNumber(Integer helpAdmitEntranceNumber) {
        this.helpAdmitEntranceNumber = helpAdmitEntranceNumber;
    }

    public Integer getGuideEntrepreneurshipNumber() {
        return guideEntrepreneurshipNumber;
    }

    public void setGuideEntrepreneurshipNumber(Integer guideEntrepreneurshipNumber) {
        this.guideEntrepreneurshipNumber = guideEntrepreneurshipNumber;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", directEmploymentNumber=").append(directEmploymentNumber);
        sb.append(", helpConnectEmploymentNumber=").append(helpConnectEmploymentNumber);
        sb.append(", participationInEmploymentGuidanceNumber=").append(participationInEmploymentGuidanceNumber);
        sb.append(", mentoringExaminationCoursesNumber=").append(mentoringExaminationCoursesNumber);
        sb.append(", helpAdmitEntranceNumber=").append(helpAdmitEntranceNumber);
        sb.append(", guideEntrepreneurshipNumber=").append(guideEntrepreneurshipNumber);
        sb.append(", note=").append(note);
        sb.append(", year=").append(year);
        sb.append(", semester=").append(semester);
        sb.append(", classTeacher=").append(classTeacher);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}