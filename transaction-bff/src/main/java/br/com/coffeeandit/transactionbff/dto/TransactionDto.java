package br.com.coffeeandit.transactionbff.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.coffeeandit.transactionbff.enums.SituacaoEnum;
import br.com.coffeeandit.transactionbff.enums.TipoTransacao;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "uuid")
public class TransactionDto implements Serializable {
	
	private static final long serialVersionUID = 8046485259673242587L;

	@Schema(description = "Identificador único da transação")
	private UUID uuid;

	@Schema(description = "Valor da transação")
    @NotNull(message = "Informar o valor da transação")
    private BigDecimal valor;
	
    @Schema(description = "Data/hora/minuto e segundo da transação")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime data;
    
    @NotNull(message = "Informar a conta de origem da transação")
    @Schema(description = "Conta de origem da transação")
    @Valid
    private ContaDto conta;
    
    @Schema(description = "Beneficiário da transação")
    @Valid
    private BeneficiatioDto beneficiario;
    
    @NotNull(message = "Informar o tipo da transação")
    @Schema(description = "Tipo de transação")
    private TipoTransacao tipoTransacao;
    
    @Schema(description = "Situação da transação")
    private SituacaoEnum situacao;


    

}
