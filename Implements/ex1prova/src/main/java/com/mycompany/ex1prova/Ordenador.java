/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1prova;

/**
 *
 * @author Aluno
 */
public class Ordenador {
    private IOrdenacao ordenacao;

    public Ordenador(IOrdenacao ordenacao) {
        this.ordenacao = ordenacao;
    }

    public void mudarOrdenacao(IOrdenacao ordenacao) {
        this.ordenacao = ordenacao;
    }
    
    public void ordena(String conjuntoDados){
        ordenacao.ordenar(conjuntoDados);
    }
    
}
