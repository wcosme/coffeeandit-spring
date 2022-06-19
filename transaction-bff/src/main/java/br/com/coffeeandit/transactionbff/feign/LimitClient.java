package br.com.coffeeandit.transactionbff.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.coffeeandit.transactionbff.dto.DailyLimit;

@FeignClient(value = "limits", url = "${limits.url}")
public interface LimitClient {

    @RequestMapping(path = "/daily-limit/{agency}/{account}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    DailyLimit findDailyLimit(@PathVariable("agency") Long agency, @PathVariable("account") Long account);

}
