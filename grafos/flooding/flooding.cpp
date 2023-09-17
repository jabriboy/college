// Gabriel Rocha, Thiago Marques e João Victor Carvalho

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_VERTICES 100

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_VERTICES 100

// Função para realizar o flood fill
void flood_fill(int graph[MAX_VERTICES][MAX_VERTICES], int visited[MAX_VERTICES], int n, int vertex, int component) {
    visited[vertex] = component; // Marcamos o vértice atual como parte da componente atual.
    for (int i = 0; i < n; i++) {
        if (graph[vertex][i] && visited[i] == -1) {
            flood_fill(graph, visited, n, i, component); // Chamamos a função recursivamente para explorar os vértices conectados.
        }
    }
}

int main() {
    int graph[MAX_VERTICES][MAX_VERTICES];
    int visited[MAX_VERTICES];
    char num_vertices[100]; // Armazenará o número de vértices como uma string temporária.

    // Abrir o arquivo contendo a matriz de adjacências
    FILE *file = fopen("grafos.txt", "r");
    if (file == NULL) {
        printf("Erro ao abrir o arquivo.\n");
        return 1;
    }

    // Ler o número de vértices do arquivo e calcular o tamanho da matriz
    fgets(num_vertices, sizeof(num_vertices), file);
    int size_graph = (strlen(num_vertices) + 1) / 2;

    // Ler a matriz de adjacências do arquivo
    for (int i = 0; i < size_graph; i++) {
        for (int j = 0; j < size_graph; j++) {
            fscanf(file, "%d", &graph[i][j]);
        }
    }

    // Inicializar o vetor de visitados
    for (int i = 0; i < size_graph; i++) {
        visited[i] = -1; // Inicializamos todos os vértices como não visitados.
    }

    int num_componentes = 0;

    // Aplicar o algoritmo de flooding para encontrar as componentes conexas
    for (int i = 0; i < size_graph; i++) {
        if (visited[i] == -1) {
            num_componentes++;
            flood_fill(graph, visited, size_graph, i, num_componentes); // Chama a função de flood fill para explorar a componente atual.
        }
    }

    printf("Numero de componentes conexas: %d\n", num_componentes);

    // Fechar o arquivo
    fclose(file);

    return 0;
}

