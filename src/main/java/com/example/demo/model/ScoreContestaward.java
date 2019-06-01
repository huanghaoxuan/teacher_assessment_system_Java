package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ScoreContestaward implements Serializable {
    private Integer id;

    private BigDecimal countryFirstDigit;

    private BigDecimal countrySecondDigit;

    private BigDecimal countryThirdDigit;

    private BigDecimal provincialFirstDigit;

    private BigDecimal provincialSecondDigit;

    private BigDecimal provincialThirdDigit;

    public ScoreContestaward() {
    }

    public ScoreContestaward(Integer id, BigDecimal countryFirstDigit, BigDecimal countrySecondDigit, BigDecimal countryThirdDigit, BigDecimal provincialFirstDigit, BigDecimal provincialSecondDigit, BigDecimal provincialThirdDigit, BigDecimal cityFirstDigit, BigDecimal citySecondDigit, BigDecimal cityThirdDigit, BigDecimal schoolFirstDigit, BigDecimal schoolSecondDigit, BigDecimal schoolThirdDigit) {
        this.id = id;
        this.countryFirstDigit = countryFirstDigit;
        this.countrySecondDigit = countrySecondDigit;
        this.countryThirdDigit = countryThirdDigit;
        this.provincialFirstDigit = provincialFirstDigit;
        this.provincialSecondDigit = provincialSecondDigit;
        this.provincialThirdDigit = provincialThirdDigit;
        this.cityFirstDigit = cityFirstDigit;
        this.citySecondDigit = citySecondDigit;
        this.cityThirdDigit = cityThirdDigit;
        this.schoolFirstDigit = schoolFirstDigit;
        this.schoolSecondDigit = schoolSecondDigit;
        this.schoolThirdDigit = schoolThirdDigit;
    }

    private BigDecimal cityFirstDigit;

    private BigDecimal citySecondDigit;

    private BigDecimal cityThirdDigit;

    private BigDecimal schoolFirstDigit;

    private BigDecimal schoolSecondDigit;

    private BigDecimal schoolThirdDigit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCountryFirstDigit() {
        return countryFirstDigit;
    }

    public void setCountryFirstDigit(BigDecimal countryFirstDigit) {
        this.countryFirstDigit = countryFirstDigit;
    }

    public BigDecimal getCountrySecondDigit() {
        return countrySecondDigit;
    }

    public void setCountrySecondDigit(BigDecimal countrySecondDigit) {
        this.countrySecondDigit = countrySecondDigit;
    }

    public BigDecimal getCountryThirdDigit() {
        return countryThirdDigit;
    }

    public void setCountryThirdDigit(BigDecimal countryThirdDigit) {
        this.countryThirdDigit = countryThirdDigit;
    }

    public BigDecimal getProvincialFirstDigit() {
        return provincialFirstDigit;
    }

    public void setProvincialFirstDigit(BigDecimal provincialFirstDigit) {
        this.provincialFirstDigit = provincialFirstDigit;
    }

    public BigDecimal getProvincialSecondDigit() {
        return provincialSecondDigit;
    }

    public void setProvincialSecondDigit(BigDecimal provincialSecondDigit) {
        this.provincialSecondDigit = provincialSecondDigit;
    }

    public BigDecimal getProvincialThirdDigit() {
        return provincialThirdDigit;
    }

    public void setProvincialThirdDigit(BigDecimal provincialThirdDigit) {
        this.provincialThirdDigit = provincialThirdDigit;
    }

    public BigDecimal getCityFirstDigit() {
        return cityFirstDigit;
    }

    public void setCityFirstDigit(BigDecimal cityFirstDigit) {
        this.cityFirstDigit = cityFirstDigit;
    }

    public BigDecimal getCitySecondDigit() {
        return citySecondDigit;
    }

    public void setCitySecondDigit(BigDecimal citySecondDigit) {
        this.citySecondDigit = citySecondDigit;
    }

    public BigDecimal getCityThirdDigit() {
        return cityThirdDigit;
    }

    public void setCityThirdDigit(BigDecimal cityThirdDigit) {
        this.cityThirdDigit = cityThirdDigit;
    }

    public BigDecimal getSchoolFirstDigit() {
        return schoolFirstDigit;
    }

    public void setSchoolFirstDigit(BigDecimal schoolFirstDigit) {
        this.schoolFirstDigit = schoolFirstDigit;
    }

    public BigDecimal getSchoolSecondDigit() {
        return schoolSecondDigit;
    }

    public void setSchoolSecondDigit(BigDecimal schoolSecondDigit) {
        this.schoolSecondDigit = schoolSecondDigit;
    }

    public BigDecimal getSchoolThirdDigit() {
        return schoolThirdDigit;
    }

    public void setSchoolThirdDigit(BigDecimal schoolThirdDigit) {
        this.schoolThirdDigit = schoolThirdDigit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", countryFirstDigit=").append(countryFirstDigit);
        sb.append(", countrySecondDigit=").append(countrySecondDigit);
        sb.append(", countryThirdDigit=").append(countryThirdDigit);
        sb.append(", provincialFirstDigit=").append(provincialFirstDigit);
        sb.append(", provincialSecondDigit=").append(provincialSecondDigit);
        sb.append(", provincialThirdDigit=").append(provincialThirdDigit);
        sb.append(", cityFirstDigit=").append(cityFirstDigit);
        sb.append(", citySecondDigit=").append(citySecondDigit);
        sb.append(", cityThirdDigit=").append(cityThirdDigit);
        sb.append(", schoolFirstDigit=").append(schoolFirstDigit);
        sb.append(", schoolSecondDigit=").append(schoolSecondDigit);
        sb.append(", schoolThirdDigit=").append(schoolThirdDigit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}