package com.paulo.sbc.services;

import java.util.Optional;

import com.paulo.sbc.entities.Funcionario;

public interface FuncionarioService {

	/**
	 * Persiste um funcionário na base de dados
	 * 
	 * @param funcionario
	 * @return Funcionario
	 */
	Funcionario persistir (Funcionario funcionario);
	
	/**
	 * Busca e retorna um funcionário dado um cpf
	 * 
	 * @param cpf
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Busca e retorna um funcionário dado um e-mail
	 * 
	 * @param email
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorEmail(String email);
	
	/**
	 * Busca e retorna um funcionario dado um id
	 * 
	 * @param id
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorId(Long id);
}
