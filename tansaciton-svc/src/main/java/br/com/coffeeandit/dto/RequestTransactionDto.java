package br.com.coffeeandit.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.coffeeandit.enums.SituationEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class RequestTransactionDto extends TransactionDto {
    @JsonIgnore
    private SituationEnum situacao;
    @JsonIgnore
    private LocalDateTime data;
}
