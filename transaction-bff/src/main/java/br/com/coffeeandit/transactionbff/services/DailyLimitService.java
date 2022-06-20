package br.com.coffeeandit.transactionbff.services;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.function.Supplier;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.coffeeandit.transactionbff.dto.DailyLimit;
import br.com.coffeeandit.transactionbff.feign.LimitClient;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.decorators.Decorators;


@Service
public class DailyLimitService {
	
	LimitClient limitClient;

    @Autowired
    private CircuitBreaker timeCircuitBreaker;


    public DailyLimitService(LimitClient limitClient) {
        this.limitClient = limitClient;
    }

    public DailyLimit findDailyLimit(final Long agency, final Long account) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        var dailyLimitSup = fallback(agency, account);

        return dailyLimitSup.get();
    }

    private Supplier<DailyLimit> fallback(final Long agency, final Long account) {
        var dailyLimitsSup = timeCircuitBreaker.decorateSupplier(() -> limitClient.findDailyLimit(agency, account));

        return Decorators
                .ofSupplier(dailyLimitsSup)
                .withCircuitBreaker(timeCircuitBreaker)
                .withFallback(Arrays.asList(CallNotPermittedException.class),
                        e -> this.getStaticLimit())
                .decorate();

    }

    private DailyLimit getStaticLimit() {
    	DailyLimit dailyLimit = new DailyLimit();
    	dailyLimit.setDailyLimits(BigDecimal.ZERO);
        return dailyLimit;
    }

}
