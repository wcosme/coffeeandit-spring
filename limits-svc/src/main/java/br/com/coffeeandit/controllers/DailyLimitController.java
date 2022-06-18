package br.com.coffeeandit.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.coffeeandit.domain.DailyLimit;
import br.com.coffeeandit.services.DailyLimitService;

@RestController
@RequestMapping("/daily-limit")
public class DailyLimitController {
	
	private DailyLimitService limitService;

	public DailyLimitController(DailyLimitService limitService) {
		this.limitService = limitService;
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<DailyLimit> findOneLimit(@PathVariable("id") Long id){
		
		Optional<DailyLimit> optional = limitService.findById(id);
		
		if(optional.isPresent()) {
			ResponseEntity.ok().body(optional.get());
		}
		
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "resource not found.");
	}
	
	

}
