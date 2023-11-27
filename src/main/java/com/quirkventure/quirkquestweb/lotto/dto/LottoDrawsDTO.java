package com.quirkventure.quirkquestweb.lotto.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record LottoDrawsDTO(
        Long drawNo,
        LocalDate drawDate,
        BigDecimal totalSellAmount,
        BigDecimal firstPrizeAmount,
        Integer firstPrizeWinners,
        Integer bonusNo,
        Integer drawNo1,
        Integer drawNo2,
        Integer drawNo3,
        Integer drawNo4,
        Integer drawNo5,
        Integer drawNo6
) {}
