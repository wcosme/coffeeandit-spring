package br.com.coffeeandit.services;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.coffeeandit.domain.DailyLimit;
import br.com.coffeeandit.repositories.DailyLimitRepository;

@Service
public class DailyLimitService {
	
	private DailyLimitRepository dailyLimitRepository;
	
	@Value("${limite.valor:0}")
    private BigDecimal limiteDiario;


	public DailyLimitService(DailyLimitRepository dailyLimitRepository) {
		this.dailyLimitRepository = dailyLimitRepository;
	}
	
	public Optional<DailyLimit> findById(Long id) {
        return dailyLimitRepository.findById(id);
    }
	
	public Optional<DailyLimit> findDailyLimit(Long agency, Long account){
		
		Optional<DailyLimit> dailyLimit = dailyLimitRepository.findByAgencyAndAccount(agency, account);
		
		return dailyLimit;
	}

}
