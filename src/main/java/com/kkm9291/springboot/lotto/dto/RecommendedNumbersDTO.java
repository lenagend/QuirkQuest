package com.kkm9291.springboot.lotto.dto;

import java.time.LocalDate;

public record RecommendedNumbersDTO(
        Integer id,
        LocalDate createdAt,
        Integer number1,
        Integer number2,
        Integer number3,
        Integer number4,
        Integer number5,
        Integer number6,
        String reason,
        String frequencyInfo
) {}