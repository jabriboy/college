// Gabriel Rocha e Thiago Marques

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include "isomorfo.h"  // Inclui o arquivo de cabeçalho personalizado "isomorfo.h"

int main(){
    FILE* graph1 = fopen("graph1.txt", "r"); // Abre o arquivo "graph1.txt" para leitura
    FILE* graph2 = fopen("graph2.txt", "r"); // Abre o arquivo "graph2.txt" para leitura
    
    // Verifica se ambos os arquivos de grafo foram abertos com sucesso
    if (!graph1 || !graph2) {
        printf("Arquivos do grafo não encontrados"); // Exibe uma mensagem de erro se um arquivo não puder ser aberto
        return 0;
    }
    
    char num_vertex[100], adjacency[100];
    
    // Lê a primeira linha do arquivo "graph1.txt" para obter o número de vértices no primeiro grafo
    fgets(num_vertex, sizeof(num_vertex), graph1);
    int size_graph1 = (strlen(num_vertex) + 1) / 2; // Calcula o número de vértices
//    printf("\nNumero de Vertices: %d\n", size_graph1);
    
    // Lê a primeira linha do arquivo "graph2.txt" para obter o número de vértices no segundo grafo
    fgets(num_vertex, sizeof(num_vertex), graph2);
    int size_graph2 = (strlen(num_vertex) + 1) / 2; // Calcula o número de vértices
//    printf("\nNumero de Vertices: %d\n", size_graph2);
    
    // Verifica se os dois grafos têm o mesmo número de vértices
    if (size_graph1 != size_graph2) {
        printf("Não sao isomorfos"); // Exibe uma mensagem e termina o programa se não forem isomórficos
        return 0;
    }
    
    // Aloca espaço para listas de adjacência para o primeiro e segundo grafo
    Node** adjacency_list1 = (Node**)malloc(size_graph1 * sizeof(Node*));
    for (int i = 0; i < size_graph1; ++i) {
        adjacency_list1[i] = NULL;
    }
    Node** adjacency_list2 = (Node**)malloc(size_graph2 * sizeof(Node*));
    for (int i = 0; i < size_graph2; ++i) {
        adjacency_list2[i] = NULL;
    }
    
    int row = 0;
    // Lê as linhas do arquivo "graph1.txt" para construir a lista de adjacência do primeiro grafo
    while (fgets(adjacency, sizeof(adjacency), graph1)) {
        char* token = strtok(adjacency, " ");
        int col = 0;
        while (token != NULL) {
            int is_adjacent = atoi(token);
            
            // Adiciona uma aresta à lista de adjacência se for um vértice adjacente
            if (is_adjacent) {
                add_edge(adjacency_list1, row, col);
            }
            
            token = strtok(NULL, " ");
            col++;
        }
        row++;
    }
    
    row = 0;
    // Lê as linhas do arquivo "graph2.txt" para construir a lista de adjacência do segundo grafo
    while (fgets(adjacency, sizeof(adjacency), graph2)) {
        char* token = strtok(adjacency, " ");
        int col = 0;
        while (token != NULL) {
            int is_adjacent = atoi(token);
            
            // Adiciona uma aresta à lista de adjacência se for um vértice adjacente
            if (is_adjacent) {
                add_edge(adjacency_list2, row, col);
            }
            
            token = strtok(NULL, " ");
            col++;
        }
        row++;
    }
    
    // Imprime a lista de adjacência do primeiro grafo
    printf("\nlista de adjacencias 1:\n");
    print_adjacency_list(adjacency_list1, size_graph1);
    
    // Imprime a lista de adjacência do segundo grafo
    printf("\nlista de adjacencias 2:\n");
    print_adjacency_list(adjacency_list2, size_graph2);
    
    // Calcula o grau de cada vértice da lista de adjacências
    Node* lista1[size_graph1];
    grau_function(adjacency_list1, size_graph1, lista1);
    Node* lista2[size_graph2];
    grau_function(adjacency_list2, size_graph2, lista2);
    
    // Verifica se os graus dos vértices dos dois grafos são iguais
    if (compare_grau(lista1, lista2, size_graph1) == 0) {
        printf("\nNão sao isomorfos"); // Exibe uma mensagem e termina o programa se não forem isomórficos
    }
    else {
        printf("\npossivelmente isomorfos");
    }
    
    return 0;
}

