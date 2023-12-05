package com.kkm9291.springboot.lotto.service;

import com.kkm9291.springboot.lotto.entity.LottoDraws;
import com.kkm9291.springboot.lotto.dto.LottoDrawsDTO;
import com.kkm9291.springboot.lotto.repository.LottoDrawsRepository;
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
public class LottoServiceTests {

    @Mock
    private LottoDrawsRepository lottoDrawsRepository;

    @InjectMocks
    private LottoService lottoService;

    @Test
    public void testFindAllLottoDraws() {
        Page<LottoDraws> mockPage = Page.empty();
        when(lottoDrawsRepository.findAll(Pageable.unpaged())).thenReturn(mockPage);

        Page<LottoDrawsDTO> result = lottoService.findAllLottoDraws(Pageable.unpaged());

        assertNotNull(result);
        // 추가적인 검증 로직
    }
}
