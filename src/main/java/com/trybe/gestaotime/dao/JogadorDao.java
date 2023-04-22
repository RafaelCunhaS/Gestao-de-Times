package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Jogador;

/**
 * Classe Dao da entidade Jogador.
 */
public class JogadorDao extends GenericDao<Jogador, Integer> {

  public JogadorDao() {
    super(Jogador.class);
  }

}
