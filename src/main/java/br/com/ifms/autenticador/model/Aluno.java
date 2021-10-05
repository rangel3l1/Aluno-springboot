package br.com.ifms.autenticador.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
public class Aluno {
	
	@ApiModelProperty(value="Código do aluno")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAluno;
	
	@ApiModelProperty(value="Nome do aluno")
	private String nome;
	
	@ApiModelProperty(value="Data de nascimento do aluno")
	@Temporal(TemporalType.DATE)
	private Date nascimento;
	@ApiModelProperty(notes = "Mail server domain", required = true)
	private String cpf;
	@ApiModelProperty(value="idade do aluno")
	private int idade;	 


}
