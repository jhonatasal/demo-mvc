package com.jalves.curso.boot.services;

import java.util.List;

import com.jalves.curso.boot.domain.Cargo;

public interface CargoService {
	void salvar(Cargo cargo);

	void editar(Cargo cargo);

	void excluir(Long id);

	Cargo buscarPorId(Long id);

	List<Cargo> buscarTodos();
}
