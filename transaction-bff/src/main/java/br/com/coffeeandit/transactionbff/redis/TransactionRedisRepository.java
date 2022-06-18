package br.com.coffeeandit.transactionbff.redis;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.coffeeandit.transactionbff.dto.TransactionDto;

@Repository
public interface TransactionRedisRepository extends CrudRepository<TransactionDto, String> {

}
