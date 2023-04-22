package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Documento;

/**
 * Classe Dao da entidade Documento.
 */
public class DocumentoDao extends GenericDao<Documento, Integer> {

  public DocumentoDao() {
    super(Documento.class);
  }

}
