/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3prova;

/**
 *
 * @author Aluno
 */
public class InsertionSortSingleton extends Ordem{
    String mensagem;
    private static InsertionSortSingleton insertionSortSingleton;
    public InsertionSortSingleton(String conjuntoDados,String mensagem) {
        super(conjuntoDados);
        this.mensagem = mensagem;
        System.out.println(conjuntoDados + mensagem);
    }
    
    public static synchronized InsertionSortSingleton 
        getInstance(String conjuntoDados,String mensagem){
        if (insertionSortSingleton == null)
            insertionSortSingleton = new InsertionSortSingleton(conjuntoDados, mensagem);
        else
            System.out.print("InsertSort já instanciada");
        return insertionSortSingleton;
    }
    
    
}
