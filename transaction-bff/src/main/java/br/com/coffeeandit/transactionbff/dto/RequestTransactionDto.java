package br.com.coffeeandit.transactionbff.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.coffeeandit.transactionbff.enums.SituacaoEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Schema(description = "Objeto de transporte para o envio de uma promessa de transação")
public class RequestTransactionDto extends TransactionDto {
	
	private static final long serialVersionUID = -3030728086917271047L;
	
	@JsonIgnore
    private SituacaoEnum situacao;
    @JsonIgnore
    private LocalDateTime data;


}
