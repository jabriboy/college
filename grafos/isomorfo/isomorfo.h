// Gabriel Rocha e Thiago Marques
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

// Define uma estrutura de n� que ser� usada para criar uma lista de adjac�ncia
typedef struct Node {
    int vertex;         // Armazena o n�mero do v�rtice
    struct Node* next;  // Aponta para o pr�ximo n� na lista de adjac�ncia
    int grau;           // Armazena o grau do v�rtice
} Node;

// Cria um novo n� com o n�mero do v�rtice especificado
Node* create_node(int vertex) {
    Node* new_node = (Node*)malloc(sizeof(Node)); // Aloca mem�ria para o novo n�
    new_node->vertex = vertex;                    // Define o n�mero do v�rtice
    new_node->next = NULL;                        // Inicializa o pr�ximo n� como NULL
    new_node->grau = 0;                           // Inicializa o grau como 0
    return new_node;
}

// Adiciona uma aresta entre dois v�rtices em uma lista de adjac�ncia
void add_edge(Node** adjacency_list, int src, int dest) {
    Node* new_node = create_node(dest);            // Cria um novo n� de destino
    new_node->next = adjacency_list[src];          // Define o pr�ximo n� como o primeiro na lista
    adjacency_list[src] = new_node;                // Define o novo n� como o primeiro na lista de adjac�ncia
}

// Imprime a lista de adjac�ncia de um grafo
void print_adjacency_list(Node** adjacency_list, int size_graph) {
    for (int i = 0; i < size_graph; ++i) {
        printf("Vertex %d: ", i);
        Node* first = adjacency_list[i];
        Node* current = adjacency_list[i];
        while (current != NULL) {
            first->grau++;                          // Calcula o grau do v�rtice
            printf("-> %d", current->vertex);       // Imprime o v�rtice adjacente
            current = current->next;
        }
        printf(" (Grau %d)", first->grau);           // Imprime o grau do v�rtice
        printf("\n");
    }
}

// Calcula o grau de cada v�rtice em um grafo e armazena em um vetor
void grau_function(Node** adjacency_list, int size_graph, Node** vector) {
    for (int i = 0; i < size_graph; i++) {
        Node* first = adjacency_list[i];
        Node* current = adjacency_list[i];
        while (current != NULL) {
            first->grau++;                          // Calcula o grau do v�rtice
            current = current->next;
        }
        vector[i] = first;
    }
}

// Compara os graus dos v�rtices em duas listas de v�rtices
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
            return 0; // Se os graus n�o forem iguais, retorna 0
        }
    }
    return 1; // Se os graus forem iguais para todos os v�rtices, retorna 1
}

