package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Torcedor;

/**
 * Classe Dao da entidade Torcedor.
 */
public class TorcedorDao extends GenericDao<Torcedor, Integer> {

  public TorcedorDao() {
    super(Torcedor.class);
  }

}
