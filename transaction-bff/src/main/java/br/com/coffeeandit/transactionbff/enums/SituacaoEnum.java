package br.com.coffeeandit.transactionbff.enums;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema
public enum SituacaoEnum {

	ANALISADA,
    NAO_ANALISADA,
    EM_ANALISE_HUMANA,
    EM_SUSPEITA_FRAUDE,
    RISCO_CONFIRMADO;

}
