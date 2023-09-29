/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex4prova;

/**
 *
 * @author Aluno
 */
public class OrdemAdapter extends Ordem {
    String mensagem;
    public OrdemAdapter(String conjuntoDados, String mensagem) {
        super(conjuntoDados);
        this.mensagem = mensagem;
        System.out.println(conjuntoDados + mensagem);
    }
    
}
