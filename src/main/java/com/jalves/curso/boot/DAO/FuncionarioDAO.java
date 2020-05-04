package com.jalves.curso.boot.DAO;

import java.util.List;

import com.jalves.curso.boot.domain.Funcionario;

public interface FuncionarioDAO {
	void save(Funcionario funcionario);

	void update(Funcionario funcionario);

	void delete(Long id);

	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
}
