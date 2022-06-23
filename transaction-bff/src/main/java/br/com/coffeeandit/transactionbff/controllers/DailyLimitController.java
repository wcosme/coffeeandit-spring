package br.com.coffeeandit.transactionbff.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.coffeeandit.transactionbff.dto.DailyLimit;
import br.com.coffeeandit.transactionbff.services.DailyLimitService;

@RestController
@RequestMapping("/limits")
public class DailyLimitController {
	
	private DailyLimitService dailyLimitService;

    public DailyLimitController(DailyLimitService dailyLimitService) {
        this.dailyLimitService = dailyLimitService;
    }

    @GetMapping(value = "/{agency}/{account}")
    public DailyLimit findDailyLimit(@PathVariable("agency") Long agency, @PathVariable("account") Long account) {

        return dailyLimitService.findDailyLimit(agency, account);

    }
}
