package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Userinformation implements Serializable {
    private Integer id;

    private String name;

    private String sex;

    private String birthday;

    private String academicQualifications;

    private String academicDegrees;

    private String duties;

    private String politicalLandscape;

    private String classTeacher;

    private String departmentDept;

    private String enterSchoolTime;

    public Userinformation(String name, String sex, String birthday, String academicQualifications, String academicDegrees, String duties, String politicalLandscape, String classTeacher, String departmentDept, String enterSchoolTime, String universityYear, String undergraduateGraduationSchool, String academicQualificationsSchool, String academicDegreesSchool, String idcard, String willDiscipline, String willProfessionalTitles, String studyProfessional, BigDecimal jobYear, String teacherQualificationCertificate, String preJobTraining, String putonghuaExam, String academicQualificationsTime, String academicDegreesTime, String professionalTechnologyDuties, String professionalTechnologyDutiesTime, String professionalStudyDirection, String professionalStudyDirectionYear, String continuingEducationSituation, String engineeringPracticeExperience, Integer guidanceStudentPracticeNumber) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.academicQualifications = academicQualifications;
        this.academicDegrees = academicDegrees;
        this.duties = duties;
        this.politicalLandscape = politicalLandscape;
        this.classTeacher = classTeacher;
        this.departmentDept = departmentDept;
        this.enterSchoolTime = enterSchoolTime;
        this.universityYear = universityYear;
        this.undergraduateGraduationSchool = undergraduateGraduationSchool;
        this.academicQualificationsSchool = academicQualificationsSchool;
        this.academicDegreesSchool = academicDegreesSchool;
        this.idcard = idcard;
        this.willDiscipline = willDiscipline;
        this.willProfessionalTitles = willProfessionalTitles;
        this.studyProfessional = studyProfessional;
        this.jobYear = jobYear;
        this.teacherQualificationCertificate = teacherQualificationCertificate;
        this.preJobTraining = preJobTraining;
        this.putonghuaExam = putonghuaExam;
        this.academicQualificationsTime = academicQualificationsTime;
        this.academicDegreesTime = academicDegreesTime;
        this.professionalTechnologyDuties = professionalTechnologyDuties;
        this.professionalTechnologyDutiesTime = professionalTechnologyDutiesTime;
        this.professionalStudyDirection = professionalStudyDirection;
        this.professionalStudyDirectionYear = professionalStudyDirectionYear;
        this.continuingEducationSituation = continuingEducationSituation;
        this.engineeringPracticeExperience = engineeringPracticeExperience;
        this.guidanceStudentPracticeNumber = guidanceStudentPracticeNumber;
    }

    public Userinformation() {
    }

    public Userinformation(Integer id, String name, String sex, String birthday, String academicQualifications, String academicDegrees, String duties, String politicalLandscape, String classTeacher, String departmentDept, String enterSchoolTime, String universityYear, String undergraduateGraduationSchool, String academicQualificationsSchool, String academicDegreesSchool, String idcard, String willDiscipline, String willProfessionalTitles, String studyProfessional, BigDecimal jobYear, String teacherQualificationCertificate, String preJobTraining, String putonghuaExam, String academicQualificationsTime, String academicDegreesTime, String professionalTechnologyDuties, String professionalTechnologyDutiesTime, String professionalStudyDirection, String professionalStudyDirectionYear, String continuingEducationSituation, String engineeringPracticeExperience, Integer guidanceStudentPracticeNumber) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.academicQualifications = academicQualifications;
        this.academicDegrees = academicDegrees;
        this.duties = duties;
        this.politicalLandscape = politicalLandscape;
        this.classTeacher = classTeacher;
        this.departmentDept = departmentDept;
        this.enterSchoolTime = enterSchoolTime;
        this.universityYear = universityYear;
        this.undergraduateGraduationSchool = undergraduateGraduationSchool;
        this.academicQualificationsSchool = academicQualificationsSchool;
        this.academicDegreesSchool = academicDegreesSchool;
        this.idcard = idcard;
        this.willDiscipline = willDiscipline;
        this.willProfessionalTitles = willProfessionalTitles;
        this.studyProfessional = studyProfessional;
        this.jobYear = jobYear;
        this.teacherQualificationCertificate = teacherQualificationCertificate;
        this.preJobTraining = preJobTraining;
        this.putonghuaExam = putonghuaExam;
        this.academicQualificationsTime = academicQualificationsTime;
        this.academicDegreesTime = academicDegreesTime;
        this.professionalTechnologyDuties = professionalTechnologyDuties;
        this.professionalTechnologyDutiesTime = professionalTechnologyDutiesTime;
        this.professionalStudyDirection = professionalStudyDirection;
        this.professionalStudyDirectionYear = professionalStudyDirectionYear;
        this.continuingEducationSituation = continuingEducationSituation;
        this.engineeringPracticeExperience = engineeringPracticeExperience;
        this.guidanceStudentPracticeNumber = guidanceStudentPracticeNumber;
    }

    private String universityYear;

    private String undergraduateGraduationSchool;

    private String academicQualificationsSchool;

    private String academicDegreesSchool;

    private String idcard;

    private String willDiscipline;

    private String willProfessionalTitles;

    private String studyProfessional;

    private BigDecimal jobYear;

    private String teacherQualificationCertificate;

    private String preJobTraining;

    private String putonghuaExam;

    private String academicQualificationsTime;

    private String academicDegreesTime;

    private String professionalTechnologyDuties;

    private String professionalTechnologyDutiesTime;

    private String professionalStudyDirection;

    private String professionalStudyDirectionYear;

    private String continuingEducationSituation;

    private String engineeringPracticeExperience;

    private Integer guidanceStudentPracticeNumber;

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
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getAcademicQualifications() {
        return academicQualifications;
    }

    public void setAcademicQualifications(String academicQualifications) {
        this.academicQualifications = academicQualifications == null ? null : academicQualifications.trim();
    }

    public String getAcademicDegrees() {
        return academicDegrees;
    }

    public void setAcademicDegrees(String academicDegrees) {
        this.academicDegrees = academicDegrees == null ? null : academicDegrees.trim();
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties == null ? null : duties.trim();
    }

    public String getPoliticalLandscape() {
        return politicalLandscape;
    }

    public void setPoliticalLandscape(String politicalLandscape) {
        this.politicalLandscape = politicalLandscape == null ? null : politicalLandscape.trim();
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher == null ? null : classTeacher.trim();
    }

    public String getDepartmentDept() {
        return departmentDept;
    }

    public void setDepartmentDept(String departmentDept) {
        this.departmentDept = departmentDept == null ? null : departmentDept.trim();
    }

    public String getEnterSchoolTime() {
        return enterSchoolTime;
    }

    public void setEnterSchoolTime(String enterSchoolTime) {
        this.enterSchoolTime = enterSchoolTime == null ? null : enterSchoolTime.trim();
    }

    public String getUniversityYear() {
        return universityYear;
    }

    public void setUniversityYear(String universityYear) {
        this.universityYear = universityYear == null ? null : universityYear.trim();
    }

    public String getUndergraduateGraduationSchool() {
        return undergraduateGraduationSchool;
    }

    public void setUndergraduateGraduationSchool(String undergraduateGraduationSchool) {
        this.undergraduateGraduationSchool = undergraduateGraduationSchool == null ? null : undergraduateGraduationSchool.trim();
    }

    public String getAcademicQualificationsSchool() {
        return academicQualificationsSchool;
    }

    public void setAcademicQualificationsSchool(String academicQualificationsSchool) {
        this.academicQualificationsSchool = academicQualificationsSchool == null ? null : academicQualificationsSchool.trim();
    }

    public String getAcademicDegreesSchool() {
        return academicDegreesSchool;
    }

    public void setAcademicDegreesSchool(String academicDegreesSchool) {
        this.academicDegreesSchool = academicDegreesSchool == null ? null : academicDegreesSchool.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getWillDiscipline() {
        return willDiscipline;
    }

    public void setWillDiscipline(String willDiscipline) {
        this.willDiscipline = willDiscipline == null ? null : willDiscipline.trim();
    }

    public String getWillProfessionalTitles() {
        return willProfessionalTitles;
    }

    public void setWillProfessionalTitles(String willProfessionalTitles) {
        this.willProfessionalTitles = willProfessionalTitles == null ? null : willProfessionalTitles.trim();
    }

    public String getStudyProfessional() {
        return studyProfessional;
    }

    public void setStudyProfessional(String studyProfessional) {
        this.studyProfessional = studyProfessional == null ? null : studyProfessional.trim();
    }

    public BigDecimal getJobYear() {
        return jobYear;
    }

    public void setJobYear(BigDecimal jobYear) {
        this.jobYear = jobYear;
    }

    public String getTeacherQualificationCertificate() {
        return teacherQualificationCertificate;
    }

    public void setTeacherQualificationCertificate(String teacherQualificationCertificate) {
        this.teacherQualificationCertificate = teacherQualificationCertificate == null ? null : teacherQualificationCertificate.trim();
    }

    public String getPreJobTraining() {
        return preJobTraining;
    }

    public void setPreJobTraining(String preJobTraining) {
        this.preJobTraining = preJobTraining == null ? null : preJobTraining.trim();
    }

    public String getPutonghuaExam() {
        return putonghuaExam;
    }

    public void setPutonghuaExam(String putonghuaExam) {
        this.putonghuaExam = putonghuaExam == null ? null : putonghuaExam.trim();
    }

    public String getAcademicQualificationsTime() {
        return academicQualificationsTime;
    }

    public void setAcademicQualificationsTime(String academicQualificationsTime) {
        this.academicQualificationsTime = academicQualificationsTime == null ? null : academicQualificationsTime.trim();
    }

    public String getAcademicDegreesTime() {
        return academicDegreesTime;
    }

    public void setAcademicDegreesTime(String academicDegreesTime) {
        this.academicDegreesTime = academicDegreesTime == null ? null : academicDegreesTime.trim();
    }

    public String getProfessionalTechnologyDuties() {
        return professionalTechnologyDuties;
    }

    public void setProfessionalTechnologyDuties(String professionalTechnologyDuties) {
        this.professionalTechnologyDuties = professionalTechnologyDuties == null ? null : professionalTechnologyDuties.trim();
    }

    public String getProfessionalTechnologyDutiesTime() {
        return professionalTechnologyDutiesTime;
    }

    public void setProfessionalTechnologyDutiesTime(String professionalTechnologyDutiesTime) {
        this.professionalTechnologyDutiesTime = professionalTechnologyDutiesTime == null ? null : professionalTechnologyDutiesTime.trim();
    }

    public String getProfessionalStudyDirection() {
        return professionalStudyDirection;
    }

    public void setProfessionalStudyDirection(String professionalStudyDirection) {
        this.professionalStudyDirection = professionalStudyDirection == null ? null : professionalStudyDirection.trim();
    }

    public String getProfessionalStudyDirectionYear() {
        return professionalStudyDirectionYear;
    }

    public void setProfessionalStudyDirectionYear(String professionalStudyDirectionYear) {
        this.professionalStudyDirectionYear = professionalStudyDirectionYear == null ? null : professionalStudyDirectionYear.trim();
    }

    public String getContinuingEducationSituation() {
        return continuingEducationSituation;
    }

    public void setContinuingEducationSituation(String continuingEducationSituation) {
        this.continuingEducationSituation = continuingEducationSituation == null ? null : continuingEducationSituation.trim();
    }

    public String getEngineeringPracticeExperience() {
        return engineeringPracticeExperience;
    }

    public void setEngineeringPracticeExperience(String engineeringPracticeExperience) {
        this.engineeringPracticeExperience = engineeringPracticeExperience == null ? null : engineeringPracticeExperience.trim();
    }

    public Integer getGuidanceStudentPracticeNumber() {
        return guidanceStudentPracticeNumber;
    }

    public void setGuidanceStudentPracticeNumber(Integer guidanceStudentPracticeNumber) {
        this.guidanceStudentPracticeNumber = guidanceStudentPracticeNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", academicQualifications=").append(academicQualifications);
        sb.append(", academicDegrees=").append(academicDegrees);
        sb.append(", duties=").append(duties);
        sb.append(", politicalLandscape=").append(politicalLandscape);
        sb.append(", classTeacher=").append(classTeacher);
        sb.append(", departmentDept=").append(departmentDept);
        sb.append(", enterSchoolTime=").append(enterSchoolTime);
        sb.append(", universityYear=").append(universityYear);
        sb.append(", undergraduateGraduationSchool=").append(undergraduateGraduationSchool);
        sb.append(", academicQualificationsSchool=").append(academicQualificationsSchool);
        sb.append(", academicDegreesSchool=").append(academicDegreesSchool);
        sb.append(", idcard=").append(idcard);
        sb.append(", willDiscipline=").append(willDiscipline);
        sb.append(", willProfessionalTitles=").append(willProfessionalTitles);
        sb.append(", studyProfessional=").append(studyProfessional);
        sb.append(", jobYear=").append(jobYear);
        sb.append(", teacherQualificationCertificate=").append(teacherQualificationCertificate);
        sb.append(", preJobTraining=").append(preJobTraining);
        sb.append(", putonghuaExam=").append(putonghuaExam);
        sb.append(", academicQualificationsTime=").append(academicQualificationsTime);
        sb.append(", academicDegreesTime=").append(academicDegreesTime);
        sb.append(", professionalTechnologyDuties=").append(professionalTechnologyDuties);
        sb.append(", professionalTechnologyDutiesTime=").append(professionalTechnologyDutiesTime);
        sb.append(", professionalStudyDirection=").append(professionalStudyDirection);
        sb.append(", professionalStudyDirectionYear=").append(professionalStudyDirectionYear);
        sb.append(", continuingEducationSituation=").append(continuingEducationSituation);
        sb.append(", engineeringPracticeExperience=").append(engineeringPracticeExperience);
        sb.append(", guidanceStudentPracticeNumber=").append(guidanceStudentPracticeNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}