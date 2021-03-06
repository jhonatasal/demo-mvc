package com.jalves.curso.boot.services;

import java.util.List;

import com.jalves.curso.boot.domain.Departamento;

public interface DepartamentoService {
	boolean departamentoTemCargo(Long id);

	void salvar(Departamento departamento);

	void editar(Departamento departamento);

	void excluir(Long id);

	Departamento buscarPorId(Long id);

	List<Departamento> buscarTodos();
}
