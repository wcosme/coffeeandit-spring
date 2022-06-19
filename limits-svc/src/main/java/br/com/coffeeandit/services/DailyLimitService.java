package br.com.coffeeandit.services;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import br.com.coffeeandit.domain.DailyLimit;
import br.com.coffeeandit.repositories.DailyLimitRepository;

@Service
public class DailyLimitService {
	
	private DailyLimitRepository dailyLimitRepository;

	public DailyLimitService(DailyLimitRepository dailyLimitRepository) {
		this.dailyLimitRepository = dailyLimitRepository;
	}
	
	public Optional<DailyLimit> findById(Long id) {
        return dailyLimitRepository.findById(id);
    }
	
	public Optional<DailyLimit> insertDailyLimit(Long agency, Long account){
		Optional<DailyLimit> dailyLimit = dailyLimitRepository.findByAgencyAndAccount(agency, account);
		
		if(dailyLimit.isEmpty()) {
			var limit = new DailyLimit();
			BeanUtils.copyProperties(dailyLimit, limit);
			limit.setDailyLimits(new BigDecimal(2000));
		}
		
		return dailyLimit;
	}


}
