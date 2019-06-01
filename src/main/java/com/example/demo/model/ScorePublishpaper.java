package com.example.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ScorePublishpaper implements Serializable {
    private Integer id;

    private BigDecimal EI;

    private BigDecimal SCI;

    private BigDecimal others;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ScorePublishpaper() {
    }

    public ScorePublishpaper(Integer id, BigDecimal EI, BigDecimal SCI, BigDecimal others) {
        this.id = id;
        this.EI = EI;
        this.SCI = SCI;
        this.others = others;
    }

    public BigDecimal getEI() {
        return EI;
    }

    public void setEI(BigDecimal EI) {
        this.EI = EI;
    }

    public BigDecimal getSCI() {
        return SCI;
    }

    public void setSCI(BigDecimal SCI) {
        this.SCI = SCI;
    }

    public BigDecimal getOthers() {
        return others;
    }

    public void setOthers(BigDecimal others) {
        this.others = others;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", EI=").append(EI);
        sb.append(", SCI=").append(SCI);
        sb.append(", others=").append(others);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}