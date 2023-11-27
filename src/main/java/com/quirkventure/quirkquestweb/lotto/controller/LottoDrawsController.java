package com.quirkventure.quirkquestweb.lotto.controller;

import com.quirkventure.quirkquestweb.lotto.dto.LottoDrawsDTO;
import com.quirkventure.quirkquestweb.lotto.entity.LottoDraws;
import com.quirkventure.quirkquestweb.lotto.service.LottoDrawsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/lotto")
public class LottoDrawsController {

    private final LottoDrawsService lottoDrawsService;

    public LottoDrawsController(LottoDrawsService lottoDrawsService) {
        this.lottoDrawsService = lottoDrawsService;
    }

    @GetMapping
    public Page<LottoDrawsDTO> getAllLottoDraws(Pageable pageable) {
        return lottoDrawsService.findAllLottoDraws(pageable);
    }
}
