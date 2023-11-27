package com.quirkventure.quirkquestweb.lotto.entity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class RecommendedNumbers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "created_at")
    private LocalDate createdAt;

    private Integer number1;
    private Integer number2;
    private Integer number3;
    private Integer number4;
    private Integer number5;
    private Integer number6;

    @Column(columnDefinition = "TEXT")
    private String reason;

    public RecommendedNumbers() {
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public Integer getNumber1() {
        return number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public Integer getNumber3() {
        return number3;
    }

    public Integer getNumber4() {
        return number4;
    }

    public Integer getNumber5() {
        return number5;
    }

    public Integer getNumber6() {
        return number6;
    }

    public String getReason() {
        return reason;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public void setNumber3(Integer number3) {
        this.number3 = number3;
    }

    public void setNumber4(Integer number4) {
        this.number4 = number4;
    }

    public void setNumber5(Integer number5) {
        this.number5 = number5;
    }

    public void setNumber6(Integer number6) {
        this.number6 = number6;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}