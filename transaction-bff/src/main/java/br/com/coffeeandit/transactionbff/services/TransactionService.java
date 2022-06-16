package br.com.coffeeandit.transactionbff.services;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.coffeeandit.transactionbff.dto.RequestTransactionDto;
import br.com.coffeeandit.transactionbff.dto.TransactionDto;
import br.com.coffeeandit.transactionbff.redis.TransactionRedisRepository;

@Service
public class TransactionService {
		
	private TransactionRedisRepository redisRepository;
	private RedisTemplate<String, String> redisTemplate;
	
	public TransactionService(TransactionRedisRepository redisRepository, RedisTemplate<String, String> redisTemplate) {
		this.redisRepository = redisRepository;
		this.redisTemplate = redisTemplate;
	}
	
	@Transactional
    public Optional<TransactionDto> save(final RequestTransactionDto requestTransactionDto) {
        requestTransactionDto.setData(LocalDateTime.now());
        return Optional.of(redisRepository.save(requestTransactionDto));
    }

	public Optional<TransactionDto> findById(final UUID id) {
        return redisRepository.findById(id);
    }


}
