package com.kkm9291.springboot.lotto.controller;

import com.kkm9291.springboot.lotto.dto.LottoDrawsDTO;
import com.kkm9291.springboot.lotto.dto.RecommendedNumbersDTO;
import com.kkm9291.springboot.lotto.service.LottoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/lotto")
public class LottoDrawsController {

    private final LottoService lottoService;

    public LottoDrawsController(LottoService lottoService) {
        this.lottoService = lottoService;
    }

    @GetMapping
    public Page<LottoDrawsDTO> getAllLottoDraws(Pageable pageable) {
        return lottoService.findAllLottoDraws(pageable);
    }

    @GetMapping("/recommend")
    public Page<RecommendedNumbersDTO> getAllRecommendedNumbers(Pageable pageable) {return lottoService.findAllRecommendedNumbers(pageable);}
}
