package com.quirkventure.quirkquestweb.lotto.service;

import com.quirkventure.quirkquestweb.lotto.entity.LottoDraws;
import com.quirkventure.quirkquestweb.lotto.repository.LottoDrawsRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertNotNull;
@ExtendWith(MockitoExtension.class)
public class LottoDrawsServiceTests {

    @Mock
    private LottoDrawsRepository lottoDrawsRepository;

    @InjectMocks
    private LottoDrawsService lottoDrawsService;

    @Test
    public void testFindAllLottoDraws() {
        Page<LottoDraws> mockPage = Page.empty();
        when(lottoDrawsRepository.findAll(Pageable.unpaged())).thenReturn(mockPage);

        Page<LottoDraws> result = lottoDrawsService.findAllLottoDraws(Pageable.unpaged());

        assertNotNull(result);
        // 추가적인 검증 로직
    }
}
