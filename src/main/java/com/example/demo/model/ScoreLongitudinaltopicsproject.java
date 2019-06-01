package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ScoreLongitudinaltopicsproject implements Serializable {
    private Integer id;

    private BigDecimal countryKeyFunding;

    private BigDecimal countryGeneralFunding;

    private BigDecimal countryProject;

    private BigDecimal provincialKeyFunding;

    private BigDecimal provincialGeneralFunding;

    private BigDecimal provincialProject;

    private BigDecimal cityKeyFunding;

    private BigDecimal cityGeneralFunding;

    public ScoreLongitudinaltopicsproject() {
    }

    public ScoreLongitudinaltopicsproject(Integer id, BigDecimal countryKeyFunding, BigDecimal countryGeneralFunding, BigDecimal countryProject, BigDecimal provincialKeyFunding, BigDecimal provincialGeneralFunding, BigDecimal provincialProject, BigDecimal cityKeyFunding, BigDecimal cityGeneralFunding, BigDecimal cityProject, BigDecimal schoolKeyFunding, BigDecimal schoolGeneralFunding, BigDecimal schoolProject) {
        this.id = id;
        this.countryKeyFunding = countryKeyFunding;
        this.countryGeneralFunding = countryGeneralFunding;
        this.countryProject = countryProject;
        this.provincialKeyFunding = provincialKeyFunding;
        this.provincialGeneralFunding = provincialGeneralFunding;
        this.provincialProject = provincialProject;
        this.cityKeyFunding = cityKeyFunding;
        this.cityGeneralFunding = cityGeneralFunding;
        this.cityProject = cityProject;
        this.schoolKeyFunding = schoolKeyFunding;
        this.schoolGeneralFunding = schoolGeneralFunding;
        this.schoolProject = schoolProject;
    }

    private BigDecimal cityProject;

    private BigDecimal schoolKeyFunding;

    private BigDecimal schoolGeneralFunding;

    private BigDecimal schoolProject;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCountryKeyFunding() {
        return countryKeyFunding;
    }

    public void setCountryKeyFunding(BigDecimal countryKeyFunding) {
        this.countryKeyFunding = countryKeyFunding;
    }

    public BigDecimal getCountryGeneralFunding() {
        return countryGeneralFunding;
    }

    public void setCountryGeneralFunding(BigDecimal countryGeneralFunding) {
        this.countryGeneralFunding = countryGeneralFunding;
    }

    public BigDecimal getCountryProject() {
        return countryProject;
    }

    public void setCountryProject(BigDecimal countryProject) {
        this.countryProject = countryProject;
    }

    public BigDecimal getProvincialKeyFunding() {
        return provincialKeyFunding;
    }

    public void setProvincialKeyFunding(BigDecimal provincialKeyFunding) {
        this.provincialKeyFunding = provincialKeyFunding;
    }

    public BigDecimal getProvincialGeneralFunding() {
        return provincialGeneralFunding;
    }

    public void setProvincialGeneralFunding(BigDecimal provincialGeneralFunding) {
        this.provincialGeneralFunding = provincialGeneralFunding;
    }

    public BigDecimal getProvincialProject() {
        return provincialProject;
    }

    public void setProvincialProject(BigDecimal provincialProject) {
        this.provincialProject = provincialProject;
    }

    public BigDecimal getCityKeyFunding() {
        return cityKeyFunding;
    }

    public void setCityKeyFunding(BigDecimal cityKeyFunding) {
        this.cityKeyFunding = cityKeyFunding;
    }

    public BigDecimal getCityGeneralFunding() {
        return cityGeneralFunding;
    }

    public void setCityGeneralFunding(BigDecimal cityGeneralFunding) {
        this.cityGeneralFunding = cityGeneralFunding;
    }

    public BigDecimal getCityProject() {
        return cityProject;
    }

    public void setCityProject(BigDecimal cityProject) {
        this.cityProject = cityProject;
    }

    public BigDecimal getSchoolKeyFunding() {
        return schoolKeyFunding;
    }

    public void setSchoolKeyFunding(BigDecimal schoolKeyFunding) {
        this.schoolKeyFunding = schoolKeyFunding;
    }

    public BigDecimal getSchoolGeneralFunding() {
        return schoolGeneralFunding;
    }

    public void setSchoolGeneralFunding(BigDecimal schoolGeneralFunding) {
        this.schoolGeneralFunding = schoolGeneralFunding;
    }

    public BigDecimal getSchoolProject() {
        return schoolProject;
    }

    public void setSchoolProject(BigDecimal schoolProject) {
        this.schoolProject = schoolProject;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", countryKeyFunding=").append(countryKeyFunding);
        sb.append(", countryGeneralFunding=").append(countryGeneralFunding);
        sb.append(", countryProject=").append(countryProject);
        sb.append(", provincialKeyFunding=").append(provincialKeyFunding);
        sb.append(", provincialGeneralFunding=").append(provincialGeneralFunding);
        sb.append(", provincialProject=").append(provincialProject);
        sb.append(", cityKeyFunding=").append(cityKeyFunding);
        sb.append(", cityGeneralFunding=").append(cityGeneralFunding);
        sb.append(", cityProject=").append(cityProject);
        sb.append(", schoolKeyFunding=").append(schoolKeyFunding);
        sb.append(", schoolGeneralFunding=").append(schoolGeneralFunding);
        sb.append(", schoolProject=").append(schoolProject);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}