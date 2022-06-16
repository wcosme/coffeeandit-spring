package br.com.coffeeandit.transactionbff.dto;

import java.io.Serializable;
import java.util.UUID;

import lombok.Data;
@Data
public class Conta implements Serializable {

	private static final long serialVersionUID = -1343066217366993297L;
	
	private UUID id;

}
