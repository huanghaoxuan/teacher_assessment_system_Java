package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ScorePatentapplication implements Serializable {
    private Integer id;

    private BigDecimal invention;

    private BigDecimal countryAccept;

    private BigDecimal practical;

    private BigDecimal exteriorDesign;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ScorePatentapplication() {
    }

    public ScorePatentapplication(Integer id, BigDecimal invention, BigDecimal countryAccept, BigDecimal practical, BigDecimal exteriorDesign) {
        this.id = id;
        this.invention = invention;
        this.countryAccept = countryAccept;
        this.practical = practical;
        this.exteriorDesign = exteriorDesign;
    }

    public BigDecimal getInvention() {
        return invention;
    }

    public void setInvention(BigDecimal invention) {
        this.invention = invention;
    }

    public BigDecimal getCountryAccept() {
        return countryAccept;
    }

    public void setCountryAccept(BigDecimal countryAccept) {
        this.countryAccept = countryAccept;
    }

    public BigDecimal getPractical() {
        return practical;
    }

    public void setPractical(BigDecimal practical) {
        this.practical = practical;
    }

    public BigDecimal getExteriorDesign() {
        return exteriorDesign;
    }

    public void setExteriorDesign(BigDecimal exteriorDesign) {
        this.exteriorDesign = exteriorDesign;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", invention=").append(invention);
        sb.append(", countryAccept=").append(countryAccept);
        sb.append(", practical=").append(practical);
        sb.append(", exteriorDesign=").append(exteriorDesign);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}