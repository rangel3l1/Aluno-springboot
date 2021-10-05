package br.com.ifms.autenticador.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

	 
	public int calcularIdade(Date data) {

		Calendar date = new GregorianCalendar();
		date.setTime(data);
		Calendar hoje = Calendar.getInstance();
		return hoje.get(Calendar.YEAR) - date.get(Calendar.YEAR);

	}

}
