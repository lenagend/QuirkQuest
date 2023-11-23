package com.quirkventure.quirkquestweb.lotto;

import com.quirkventure.quirkquestweb.lotto.repository.LottoDrawsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
public class LottoDrawsRepositoryIntegrationTest {

    @Autowired
    private LottoDrawsRepository repository;

    @Test
    public void whenFindAll_thenReturnLottoDrawsPage() {
        var page = repository.findAll(PageRequest.of(0, 5));
        assertThat(page).isNotNull();
        assertThat(page.getContent()).isNotEmpty();
    }

}
