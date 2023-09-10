// Gabriel Rocha e Thiago Marques
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

// Define uma estrutura de nó que será usada para criar uma lista de adjacência
typedef struct Node {
    int vertex;         // Armazena o número do vértice
    struct Node* next;  // Aponta para o próximo nó na lista de adjacência
    int grau;           // Armazena o grau do vértice
} Node;

// Cria um novo nó com o número do vértice especificado
Node* create_node(int vertex) {
    Node* new_node = (Node*)malloc(sizeof(Node)); // Aloca memória para o novo nó
    new_node->vertex = vertex;                    // Define o número do vértice
    new_node->next = NULL;                        // Inicializa o próximo nó como NULL
    new_node->grau = 0;                           // Inicializa o grau como 0
    return new_node;
}

// Adiciona uma aresta entre dois vértices em uma lista de adjacência
void add_edge(Node** adjacency_list, int src, int dest) {
    Node* new_node = create_node(dest);            // Cria um novo nó de destino
    new_node->next = adjacency_list[src];          // Define o próximo nó como o primeiro na lista
    adjacency_list[src] = new_node;                // Define o novo nó como o primeiro na lista de adjacência
}

// Imprime a lista de adjacência de um grafo
void print_adjacency_list(Node** adjacency_list, int size_graph) {
    for (int i = 0; i < size_graph; ++i) {
        printf("Vertex %d: ", i);
        Node* first = adjacency_list[i];
        Node* current = adjacency_list[i];
        while (current != NULL) {
            first->grau++;                          // Calcula o grau do vértice
            printf("-> %d", current->vertex);       // Imprime o vértice adjacente
            current = current->next;
        }
        printf(" (Grau %d)", first->grau);           // Imprime o grau do vértice
        printf("\n");
    }
}

// Calcula o grau de cada vértice em um grafo e armazena em um vetor
void grau_function(Node** adjacency_list, int size_graph, Node** vector) {
    for (int i = 0; i < size_graph; i++) {
        Node* first = adjacency_list[i];
        Node* current = adjacency_list[i];
        while (current != NULL) {
            first->grau++;                          // Calcula o grau do vértice
            current = current->next;
        }
        vector[i] = first;
    }
}

// Compara os graus dos vértices em duas listas de vértices
int compare_grau(Node** lista1, Node** lista2, int size_graph) {
    int igualdade;
    for(int i = 0; i < size_graph; i++) {
        igualdade = 0;
        int grau1 = lista1[i]->grau;
        for(int c = 0; c < size_graph; c++) {
            int grau2 = lista2[c]->grau;
            if(grau1 == grau2) {
                igualdade = 1;
                lista2[c]->grau = -1;
                break;
            }
        }
        if(igualdade == 0) {
            return 0; // Se os graus não forem iguais, retorna 0
        }
    }
    return 1; // Se os graus forem iguais para todos os vértices, retorna 1
}

