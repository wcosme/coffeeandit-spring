package br.com.coffeeandit.services;

import java.util.Optional;

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


}
