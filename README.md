# MaisDesignPattern
1) Crie uma pequena aplicação para demonstrar o emprego do padrão de projeto GoF Strategy na 
escolha de algoritmos de ordenação a serem empregados em um conjunto de dados de um determinado 
programa. 
Para isso:
• Crie uma interface (estratégia abstrata) contendo um método chamado ordenar que recebe por 
parâmetro a informação sobre o conjunto de dados e qual algoritmo de ordenação utilizar.
• Crie três classes estratégias concretas que implementam a estratégia abstrata apresentando ao 
usuário informações sobre o conjunto de dados ordenado e algoritmo de ordenação utilizado. 
Exemplo de algoritmos possíveis: BubbleSort, HeapSort, ShellSort, MergeSort, InsertionSort, 
QuickSort, entre outros.
• Crie uma classe chamada Ordenador e ajuste-a de forma que ela contenha um atributo do tipo da 
estratégia abstrata e um método para invocar o método ordenar.
• Demonstre o uso do padrão de projeto implementado fazendo simulações de diferentes
ordenações a serem executadas em conjuntos de dados.
Exemplo de saída:
Conjunto de dados do tipo ArrayList ordenado pelo algoritmo QuickSort.
Conjunto de dados do tipo LinkedList ordenado pelo algoritmo BubbleSort.
Conjunto de dados do tipo Queue ordenado pelo algoritmo MergeSort.
2) Aplique o padrão de projeto GoF Factory Method na aplicação criada na questão 1, com o objetivo de 
criar uma estrutura que será responsável por instanciar um dos três tipos de algoritmos de ordenação 
utilizados. 
3) Crie uma classe filha da classe Ordenador incluindo alguma especialização ou informação adicional, e 
altere-a empregando o padrão de projeto GoF Singleton, de forma a garantir que não seja possível
instanciar esta classe (a filha) mais de uma vez. Simule a tentativa de instanciar mais de uma vez a classe.

4) Apresente uma aplicação do padrão de projeto GoF Adapter no mesmo projeto utilizado para resolver 
as questões anteriores. Comente o código de forma a indicar com que objetivo o padrão foi aplicado, e 
quais alterações foram realizadas no código para atender o que sugere o padrão escolhido. 
