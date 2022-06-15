package br.com.coffeeandit.transactionbff.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.coffeeandit.transactionbff.dto.RequestTransactionDto;
import br.com.coffeeandit.transactionbff.dto.TransactionDto;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mono<TransactionDto> sendTransaction(@RequestBody RequestTransactionDto request){		
		return Mono.empty();	
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mono<TransactionDto> getTransaction(@PathVariable("id") final String uuid){
		return Mono.empty();
	}
	
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mono<TransactionDto> deleteTransaction(@PathVariable("id") final String uuid){
		return Mono.empty();
	}
	
	@PatchMapping(value = "/{id}/confirm", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Mono<TransactionDto> confirmPartialUpdateTransaction(@PathVariable("id") final String uuid){
		return Mono.empty();
	}
}
