package com.quirkventure.quirkquestweb.lotto.repository;

import com.quirkventure.quirkquestweb.lotto.entity.RecommendedNumbers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecommendedNumbersRepository extends JpaRepository<RecommendedNumbers, Long> {
    List<RecommendedNumbers> findTop30ByOrderByCreatedDateDesc();
}
