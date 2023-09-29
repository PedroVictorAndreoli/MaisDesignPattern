/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4prova;

/**
 *
 * @author Aluno
 */
public class Ex4prova {

    public static void main(String[] args) {
        OrdemFactory fabrica = new OrdemFactoryConcreto();
        String ordenacao = "Ordem de dados";
        System.out.println("HeapSort");
        fabrica.createOrdem("HEAPSORT",ordenacao);
        
        System.out.println("BubbleSort");
        fabrica.createOrdem("BUBBLESORT",ordenacao);
        
        System.out.println("ShellSort");
        fabrica.createOrdem("SHELLSORT",ordenacao);
        
        
        
        //foi utilizado o adapter para adaptar classes em que mensagens sejam obrigatoriamentes 
        //passadas por parametro
        //para isso foi criado o Ordem Adapter que obriga ter uma mensagem passada por parametro
        System.out.println("InsertionSort");
        fabrica.createOrdem("INSERTIONSORT",ordenacao);
        
        System.out.println("Teste Singleton");
        fabrica.createOrdem("INSERTIONSORT",ordenacao);
        
        
    }
}
