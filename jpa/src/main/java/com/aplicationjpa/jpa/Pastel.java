package com.aplicationjpa.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pastel")

public class Pastel {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long Id;
	    
	    private String sabor;
	    private double preco;
	    private String tamanho;

}
