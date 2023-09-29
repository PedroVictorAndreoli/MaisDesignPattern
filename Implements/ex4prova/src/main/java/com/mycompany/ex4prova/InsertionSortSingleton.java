/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex4prova;

/**
 *
 * @author Aluno
 */
public class InsertionSortSingleton extends OrdemAdapter{
    private static InsertionSortSingleton insertionSortSingleton;
   
    
    public static synchronized InsertionSortSingleton 
        getInstance(String conjuntoDados,String mensagem){
        if (insertionSortSingleton == null)
            insertionSortSingleton = new InsertionSortSingleton(conjuntoDados, mensagem);
        else
            System.out.print("InsertSort já instanciada");
        return insertionSortSingleton;
    }

    public InsertionSortSingleton(String conjuntoDados, String mensagem) {
        super(conjuntoDados, mensagem);
    }
    
    
}
