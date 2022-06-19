package br.com.coffeeandit.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table
@EqualsAndHashCode(of = "id")
public class DailyLimit implements Serializable{
	
	private static final long serialVersionUID = 9197638869918393192L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long account;
	private Long agency;
	private BigDecimal dailyLimits;
	private LocalDateTime data;

}
