package com.kkm9291.springboot.lotto.service;

import com.kkm9291.springboot.lotto.dto.LottoDrawsDTO;
import com.kkm9291.springboot.lotto.entity.LottoDraws;
import com.kkm9291.springboot.lotto.entity.RecommendedNumbers;
import com.kkm9291.springboot.lotto.repository.LottoDrawsRepository;
import com.kkm9291.springboot.lotto.repository.RecommendedNumbersRepository;
import com.kkm9291.springboot.lotto.dto.RecommendedNumbersDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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

    public Page<RecommendedNumbersDTO> findAllRecommendedNumbers(Pageable pageable){
        return recommendedNumbersRepository.findAll(pageable)
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
                recommendedNumbers.getReason(),
                recommendedNumbers.getFrequencyInfo()
        );
    }

}
