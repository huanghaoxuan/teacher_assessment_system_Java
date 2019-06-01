package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ScoreHorizontaltopicprojects implements Serializable {
    private Integer id;

    private BigDecimal oneMillion;

    private BigDecimal oneToThreeMillion;

    private BigDecimal threeToFiveMillion;

    private BigDecimal fiveToTenMillion;

    private BigDecimal tenToTwentyMillion;

    private BigDecimal twentyToThirtyMillion;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public ScoreHorizontaltopicprojects() {
    }

    public ScoreHorizontaltopicprojects(Integer id, BigDecimal oneMillion, BigDecimal oneToThreeMillion, BigDecimal threeToFiveMillion, BigDecimal fiveToTenMillion, BigDecimal tenToTwentyMillion, BigDecimal twentyToThirtyMillion) {
        this.id = id;
        this.oneMillion = oneMillion;
        this.oneToThreeMillion = oneToThreeMillion;
        this.threeToFiveMillion = threeToFiveMillion;
        this.fiveToTenMillion = fiveToTenMillion;
        this.tenToTwentyMillion = tenToTwentyMillion;
        this.twentyToThirtyMillion = twentyToThirtyMillion;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getOneMillion() {
        return oneMillion;
    }

    public void setOneMillion(BigDecimal oneMillion) {
        this.oneMillion = oneMillion;
    }

    public BigDecimal getOneToThreeMillion() {
        return oneToThreeMillion;
    }

    public void setOneToThreeMillion(BigDecimal oneToThreeMillion) {
        this.oneToThreeMillion = oneToThreeMillion;
    }

    public BigDecimal getThreeToFiveMillion() {
        return threeToFiveMillion;
    }

    public void setThreeToFiveMillion(BigDecimal threeToFiveMillion) {
        this.threeToFiveMillion = threeToFiveMillion;
    }

    public BigDecimal getFiveToTenMillion() {
        return fiveToTenMillion;
    }

    public void setFiveToTenMillion(BigDecimal fiveToTenMillion) {
        this.fiveToTenMillion = fiveToTenMillion;
    }

    public BigDecimal getTenToTwentyMillion() {
        return tenToTwentyMillion;
    }

    public void setTenToTwentyMillion(BigDecimal tenToTwentyMillion) {
        this.tenToTwentyMillion = tenToTwentyMillion;
    }

    public BigDecimal getTwentyToThirtyMillion() {
        return twentyToThirtyMillion;
    }

    public void setTwentyToThirtyMillion(BigDecimal twentyToThirtyMillion) {
        this.twentyToThirtyMillion = twentyToThirtyMillion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", oneMillion=").append(oneMillion);
        sb.append(", oneToThreeMillion=").append(oneToThreeMillion);
        sb.append(", threeToFiveMillion=").append(threeToFiveMillion);
        sb.append(", fiveToTenMillion=").append(fiveToTenMillion);
        sb.append(", tenToTwentyMillion=").append(tenToTwentyMillion);
        sb.append(", twentyToThirtyMillion=").append(twentyToThirtyMillion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}