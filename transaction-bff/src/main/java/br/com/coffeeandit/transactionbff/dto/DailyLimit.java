package br.com.coffeeandit.transactionbff.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "id")
public class DailyLimit implements Serializable{
	
	private static final long serialVersionUID = 9197638869918393192L;

	private Long id;
	private Long account;
	private Long agency;
	private BigDecimal dailyLimits;
	private LocalDateTime data;

}
