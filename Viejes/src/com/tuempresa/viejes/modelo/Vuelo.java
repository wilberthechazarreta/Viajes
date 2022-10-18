package com.tuempresa.viejes.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity @Getter @Setter
public class Vuelo {
	
	@Id
	@Required
	@Column(length = 32)
	String origen;
	
	@Required
	@Column(length = 32)
	String destino;
	
	@Required
	@Column(length = 8)
	String hora;
	
	@Required
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	LocalDate fecha;
	

}
