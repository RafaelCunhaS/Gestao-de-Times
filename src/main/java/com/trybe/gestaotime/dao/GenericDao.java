package com.trybe.gestaotime.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Classe abstrata GenericDao.
 **/

public abstract class GenericDao<T, I extends Serializable> {

  private final EntityManager em =
      Persistence.createEntityManagerFactory("crudHibernatePU").createEntityManager();

  private Class<T> persistedClass;

  protected GenericDao(Class<T> persistedClass) {
    this.persistedClass = persistedClass;
  }

  /**
   * Salva dados no banco.
   */
  public void salvar(T t) {
    em.getTransaction().begin();
    em.persist(t);
    em.getTransaction().commit();
  }

  /**
   * Atualiza dados no banco.
   */
  public void editar(T t) {
    em.getTransaction().begin();
    em.merge(t);
    em.getTransaction().commit();
  }

  /**
   * Remove dados no banco.
   */
  public void deletar(Long id) {
    T t = em.find(persistedClass, id);

    em.getTransaction().begin();
    em.remove(t);
    em.getTransaction().commit();
  }

  /**
   * Retorna todos dados da tabela.
   */
  public List<T> listar() {
    CriteriaBuilder cb = em.getCriteriaBuilder();
    CriteriaQuery<T> cq = cb.createQuery(persistedClass);
    Root<T> root = cq.from(persistedClass);
    cq.select(root);

    return em.createQuery(cq).getResultList();
  }

  /**
   * Retorna dados por id.
   */
  public T encontrar(Long id) {
    return em.find(persistedClass, id);
  }

}
