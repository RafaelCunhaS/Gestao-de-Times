package com.trybe.gestaotime.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe Documento.
 */
@Entity
public class Documento {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String cpf;

  @Column(name = "numero_carteira_trabalho")
  private String numeroCarteiraTrabalho;

  @Column(name = "numero_cbf")
  private String numeroCbf;

  // @OneToOne(mappedBy = "documento", cascade = CascadeType.ALL, orphanRemoval = true,
  // fetch = FetchType.LAZY)
  // private Jogador jogador;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNumeroCarteiraTrabalho() {
    return numeroCarteiraTrabalho;
  }

  public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
    this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
  }

  public String getNumeroCbf() {
    return numeroCbf;
  }

  public void setNumeroCbf(String numeroCbf) {
    this.numeroCbf = numeroCbf;
  }
}
