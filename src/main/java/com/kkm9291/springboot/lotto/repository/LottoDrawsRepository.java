package com.kkm9291.springboot.lotto.repository;

import com.kkm9291.springboot.lotto.entity.LottoDraws;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LottoDrawsRepository extends JpaRepository<LottoDraws, Long> {
    Page<LottoDraws> findAll(Pageable pageable);
}
