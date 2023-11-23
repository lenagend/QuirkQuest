package com.quirkventure.quirkquestweb.lotto.service;

import com.quirkventure.quirkquestweb.lotto.entity.LottoDraws;
import com.quirkventure.quirkquestweb.lotto.repository.LottoDrawsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LottoDrawsService {
    private final LottoDrawsRepository lottoDrawsRepository;

    public LottoDrawsService(LottoDrawsRepository lottoDrawsRepository) {
        this.lottoDrawsRepository = lottoDrawsRepository;
    }

    public Page<LottoDraws> findAllLottoDraws(Pageable pageable){
        return lottoDrawsRepository.findAll(pageable);
    }
}
