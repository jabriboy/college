// Gabriel Rocha e Thiago Marques

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include "isomorfo.h"  // Inclui o arquivo de cabe�alho personalizado "isomorfo.h"

int main(){
    FILE* graph1 = fopen("graph1.txt", "r"); // Abre o arquivo "graph1.txt" para leitura
    FILE* graph2 = fopen("graph2.txt", "r"); // Abre o arquivo "graph2.txt" para leitura
    
    // Verifica se ambos os arquivos de grafo foram abertos com sucesso
    if (!graph1 || !graph2) {
        printf("Arquivos do grafo n�o encontrados"); // Exibe uma mensagem de erro se um arquivo n�o puder ser aberto
        return 0;
    }
    
    char num_vertex[100], adjacency[100];
    
    // L� a primeira linha do arquivo "graph1.txt" para obter o n�mero de v�rtices no primeiro grafo
    fgets(num_vertex, sizeof(num_vertex), graph1);
    int size_graph1 = (strlen(num_vertex) + 1) / 2; // Calcula o n�mero de v�rtices
//    printf("\nNumero de Vertices: %d\n", size_graph1);
    
    // L� a primeira linha do arquivo "graph2.txt" para obter o n�mero de v�rtices no segundo grafo
    fgets(num_vertex, sizeof(num_vertex), graph2);
    int size_graph2 = (strlen(num_vertex) + 1) / 2; // Calcula o n�mero de v�rtices
//    printf("\nNumero de Vertices: %d\n", size_graph2);
    
    // Verifica se os dois grafos t�m o mesmo n�mero de v�rtices
    if (size_graph1 != size_graph2) {
        printf("N�o sao isomorfos"); // Exibe uma mensagem e termina o programa se n�o forem isom�rficos
        return 0;
    }
    
    // Aloca espa�o para listas de adjac�ncia para o primeiro e segundo grafo
    Node** adjacency_list1 = (Node**)malloc(size_graph1 * sizeof(Node*));
    for (int i = 0; i < size_graph1; ++i) {
        adjacency_list1[i] = NULL;
    }
    Node** adjacency_list2 = (Node**)malloc(size_graph2 * sizeof(Node*));
    for (int i = 0; i < size_graph2; ++i) {
        adjacency_list2[i] = NULL;
    }
    
    int row = 0;
    // L� as linhas do arquivo "graph1.txt" para construir a lista de adjac�ncia do primeiro grafo
    while (fgets(adjacency, sizeof(adjacency), graph1)) {
        char* token = strtok(adjacency, " ");
        int col = 0;
        while (token != NULL) {
            int is_adjacent = atoi(token);
            
            // Adiciona uma aresta � lista de adjac�ncia se for um v�rtice adjacente
            if (is_adjacent) {
                add_edge(adjacency_list1, row, col);
            }
            
            token = strtok(NULL, " ");
            col++;
        }
        row++;
    }
    
    row = 0;
    // L� as linhas do arquivo "graph2.txt" para construir a lista de adjac�ncia do segundo grafo
    while (fgets(adjacency, sizeof(adjacency), graph2)) {
        char* token = strtok(adjacency, " ");
        int col = 0;
        while (token != NULL) {
            int is_adjacent = atoi(token);
            
            // Adiciona uma aresta � lista de adjac�ncia se for um v�rtice adjacente
            if (is_adjacent) {
                add_edge(adjacency_list2, row, col);
            }
            
            token = strtok(NULL, " ");
            col++;
        }
        row++;
    }
    
    // Imprime a lista de adjac�ncia do primeiro grafo
    printf("\nlista de adjacencias 1:\n");
    print_adjacency_list(adjacency_list1, size_graph1);
    
    // Imprime a lista de adjac�ncia do segundo grafo
    printf("\nlista de adjacencias 2:\n");
    print_adjacency_list(adjacency_list2, size_graph2);
    
    // Calcula o grau de cada v�rtice da lista de adjac�ncias
    Node* lista1[size_graph1];
    grau_function(adjacency_list1, size_graph1, lista1);
    Node* lista2[size_graph2];
    grau_function(adjacency_list2, size_graph2, lista2);
    
    // Verifica se os graus dos v�rtices dos dois grafos s�o iguais
    if (compare_grau(lista1, lista2, size_graph1) == 0) {
        printf("\nN�o sao isomorfos"); // Exibe uma mensagem e termina o programa se n�o forem isom�rficos
    }
    else {
        printf("\npossivelmente isomorfos");
    }
    
    return 0;
}

