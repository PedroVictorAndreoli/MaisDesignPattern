/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2prova;

/**
 *
 * @author Aluno
 */
public class Ex2prova {

    public static void main(String[] args) {
        OrdemFactory fabrica = new OrdemFactoryConcreto();
        String ordenacao = "Ordem de dados";
        System.out.println("HeapSort");
        fabrica.createOrdem("HEAPSORT",ordenacao);
        
        System.out.println("BubbleSort");
        fabrica.createOrdem("BUBBLESORT",ordenacao);
        
        System.out.println("ShellSort");
        fabrica.createOrdem("SHELLSORT",ordenacao);
        
       
    }
}
