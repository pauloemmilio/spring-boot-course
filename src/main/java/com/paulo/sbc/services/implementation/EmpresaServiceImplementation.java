package com.paulo.sbc.services.implementation;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulo.sbc.entities.Empresa;
import com.paulo.sbc.repositories.EmpresaRepository;
import com.paulo.sbc.services.EmpresaService;

@Service
public class EmpresaServiceImplementation implements EmpresaService {

	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImplementation.class);
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Override
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		log.info("Buscando uma empresa para o CNPJ {}", cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		log.info("Persistindo empresa: {}", empresa);
		return this.empresaRepository.save(empresa);
	}

}
