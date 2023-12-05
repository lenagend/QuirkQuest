package com.kkm9291.springboot.lotto.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class LottoDraws {

    @Id
    private Long drawNo;
    private LocalDate drawDate;
    private BigDecimal totalSellAmount;
    private BigDecimal firstPrizeAmount;
    private Integer firstPrizeWinners;
    private Integer bonusNo;
    private Integer drawNo1;
    private Integer drawNo2;
    private Integer drawNo3;
    private Integer drawNo4;
    private Integer drawNo5;
    private Integer drawNo6;

    public LottoDraws() {
    }


    public Long getDrawNo() {
        return drawNo;
    }

    public void setDrawNo(Long drawNo) {
        this.drawNo = drawNo;
    }

    public LocalDate getDrawDate() {
        return drawDate;
    }

    public void setDrawDate(LocalDate drawDate) {
        this.drawDate = drawDate;
    }

    public BigDecimal getTotalSellAmount() {
        return totalSellAmount;
    }

    public void setTotalSellAmount(BigDecimal totalSellAmount) {
        this.totalSellAmount = totalSellAmount;
    }

    public BigDecimal getFirstPrizeAmount() {
        return firstPrizeAmount;
    }

    public void setFirstPrizeAmount(BigDecimal firstPrizeAmount) {
        this.firstPrizeAmount = firstPrizeAmount;
    }

    public Integer getFirstPrizeWinners() {
        return firstPrizeWinners;
    }

    public void setFirstPrizeWinners(Integer firstPrizeWinners) {
        this.firstPrizeWinners = firstPrizeWinners;
    }

    public Integer getBonusNo() {
        return bonusNo;
    }

    public void setBonusNo(Integer bonusNo) {
        this.bonusNo = bonusNo;
    }

    public Integer getDrawNo1() {
        return drawNo1;
    }

    public void setDrawNo1(Integer drawNo1) {
        this.drawNo1 = drawNo1;
    }

    public Integer getDrawNo2() {
        return drawNo2;
    }

    public void setDrawNo2(Integer drawNo2) {
        this.drawNo2 = drawNo2;
    }

    public Integer getDrawNo3() {
        return drawNo3;
    }

    public void setDrawNo3(Integer drawNo3) {
        this.drawNo3 = drawNo3;
    }

    public Integer getDrawNo4() {
        return drawNo4;
    }

    public void setDrawNo4(Integer drawNo4) {
        this.drawNo4 = drawNo4;
    }

    public Integer getDrawNo5() {
        return drawNo5;
    }

    public void setDrawNo5(Integer drawNo5) {
        this.drawNo5 = drawNo5;
    }

    public Integer getDrawNo6() {
        return drawNo6;
    }

    public void setDrawNo6(Integer drawNo6) {
        this.drawNo6 = drawNo6;
    }
}
