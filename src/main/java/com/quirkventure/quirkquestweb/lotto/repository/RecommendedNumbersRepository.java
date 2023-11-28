package com.quirkventure.quirkquestweb.lotto.repository;

import com.quirkventure.quirkquestweb.lotto.entity.RecommendedNumbers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendedNumbersRepository extends JpaRepository<RecommendedNumbers, Long> {
    Page<RecommendedNumbers> findAll (Pageable pageable);
}
