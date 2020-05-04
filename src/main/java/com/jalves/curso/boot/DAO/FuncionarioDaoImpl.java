package com.jalves.curso.boot.DAO;

import org.springframework.stereotype.Repository;

import com.jalves.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDAO{

}