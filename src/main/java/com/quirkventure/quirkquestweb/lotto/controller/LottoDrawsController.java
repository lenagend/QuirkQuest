package com.quirkventure.quirkquestweb.lotto.controller;

import com.quirkventure.quirkquestweb.lotto.dto.LottoDrawsDTO;
import com.quirkventure.quirkquestweb.lotto.dto.RecommendedNumbersDTO;
import com.quirkventure.quirkquestweb.lotto.service.LottoService;
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
