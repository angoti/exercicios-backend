package com.professorangoti.exercicios;


public class Dominio {

  private static long id;
  private final String conteudo;

  public Dominio(String conteudo) {
    ++id;
    this.conteudo = conteudo;
  }

  public long getId() {
    return id;
  }

  public String getConteudo() {
    return conteudo;
  }
}