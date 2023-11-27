package com.quirkventure.quirkquestweb.lotto.service;

import com.quirkventure.quirkquestweb.lotto.dto.LottoDrawsDTO;
import com.quirkventure.quirkquestweb.lotto.dto.RecommendedNumbersDTO;
import com.quirkventure.quirkquestweb.lotto.entity.LottoDraws;
import com.quirkventure.quirkquestweb.lotto.entity.RecommendedNumbers;
import com.quirkventure.quirkquestweb.lotto.repository.LottoDrawsRepository;
import com.quirkventure.quirkquestweb.lotto.repository.RecommendedNumbersRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LottoService {
    private final LottoDrawsRepository lottoDrawsRepository;
    private final RecommendedNumbersRepository recommendedNumbersRepository;

    public LottoService(LottoDrawsRepository lottoDrawsRepository, RecommendedNumbersRepository recommendedNumbersRepository) {
        this.lottoDrawsRepository = lottoDrawsRepository;
        this.recommendedNumbersRepository = recommendedNumbersRepository;
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

    public RecommendedNumbersDTO convertToDTO(RecommendedNumbers recommendedNumbers) {
        return new RecommendedNumbersDTO(
                recommendedNumbers.getId(),
                recommendedNumbers.getCreatedAt(),
                recommendedNumbers.getNumber1(),
                recommendedNumbers.getNumber2(),
                recommendedNumbers.getNumber3(),
                recommendedNumbers.getNumber4(),
                recommendedNumbers.getNumber5(),
                recommendedNumbers.getNumber6(),
                recommendedNumbers.getReason()
        );
    }

}
