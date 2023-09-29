/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1prova;

/**
 *
 * @author Aluno
 */
public class Ex1prova {

    public static void main(String[] args) {
        System.out.println("Conjunto de Dados ArrayList");
        Ordenador ordenador = new Ordenador((new HeapSort()));
        ordenador.ordena("ArrayList");
        System.out.println("Conjunto de Dados LinkedList");
        ordenador.mudarOrdenacao(new ShellSort());
        ordenador.ordena("LinkedList");
        System.out.println("Conjunto de Dados Queue");
         ordenador.mudarOrdenacao(new BubbleSort());
        ordenador.ordena("Queue");
    }
}
