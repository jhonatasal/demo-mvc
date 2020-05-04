package com.jalves.curso.boot.DAO;

import java.util.List;

import com.jalves.curso.boot.domain.Cargo;

public interface CargoDao {
	void save(Cargo cargo);

	void update(Cargo cargo);

	void delete(Long id);

	Cargo findById(Long id);

	List<Cargo> findAll();
}
