package com.quirkventure.quirkquestweb.lotto.service;

import com.quirkventure.quirkquestweb.lotto.dto.LottoDrawsDTO;
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

    public Page<LottoDrawsDTO> findAllLottoDraws(Pageable pageable){
        return lottoDrawsRepository.findAll(pageable)
                .map(this::convertToDTO);
    }

    public LottoDrawsDTO convertToDTO(LottoDraws lottoDraws) {
        return new LottoDrawsDTO(
                lottoDraws.getDrawNo(),
                lottoDraws.getDrawDate(),
                lottoDraws.getTotalSellAmount(),
                lottoDraws.getFirstPrizeAmount(),
                lottoDraws.getFirstPrizeWinners(),
                lottoDraws.getBonusNo(),
                lottoDraws.getDrawNo1(),
                lottoDraws.getDrawNo2(),
                lottoDraws.getDrawNo3(),
                lottoDraws.getDrawNo4(),
                lottoDraws.getDrawNo5(),
                lottoDraws.getDrawNo6()
        );
    }
}
