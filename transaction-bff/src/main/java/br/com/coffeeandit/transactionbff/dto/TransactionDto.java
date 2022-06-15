package br.com.coffeeandit.transactionbff.dto;

import java.util.UUID;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "uuid")
public class TransactionDto {
	
	private UUID uuid;

}
