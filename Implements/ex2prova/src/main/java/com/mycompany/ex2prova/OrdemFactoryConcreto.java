/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2prova;

/**
 *
 * @author Aluno
 */
public class OrdemFactoryConcreto extends OrdemFactory {

    @Override
    protected Ordem createOrdem(String tipo,String conjuntoString) {
         switch(tipo) {
            case "SHELLSORT":
            return new ShellSort(conjuntoString);
            case "HEAPSORT":
            return new HeapSort(conjuntoString);
            case "BUBBLESORT":
            return new BubbleSort(conjuntoString);
            default:
            return null;
        }
    }
    
}
