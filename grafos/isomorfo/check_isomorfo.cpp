// Gabriel Rocha e Thiago Marques

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

typedef struct Node {
    int vertex;
    struct Node* next;
} Node;

Node* create_node(int vertex) {
    Node* new_node = (Node*)malloc(sizeof(Node));
    new_node->vertex = vertex;
    new_node->next = NULL;
    return new_node;
}

void add_edge(Node** adjacency_list, int src, int dest) {
    Node* new_node = create_node(dest);
    new_node->next = adjacency_list[src];
    adjacency_list[src] = new_node;
}

void print_adjacency_list(Node** adjacency_list, int size_graph) {
    for (int i = 0; i < size_graph; ++i) {
        printf("Vertex %d: ", i);
        Node* current = adjacency_list[i];
        while (current != NULL) {
            printf("-> %d", current->vertex);
            current = current->next;
        }
        printf("\n");
    }
}

int main(){
	FILE* graph1 = fopen("graph1.txt", "r");
	FILE* graph2 = fopen("graph2.txt", "r");
	
	
//	VERIFICA SE OS ARQUIVOS SÃO ABERTOS PARA LEITURA
	if(!graph1){
		printf("Arquivo do grafo 1 não encontrado");
		return 0;
	}
	if(!graph2){
		printf("Arquivo do grafo 2 não encontrado");
		return 0;	
	}
	
	char num_vertex[100], adjacency[100];
	
//	printf("Graph 1:\n");
//	while(fgets(num_vertex, sizeof(num_vertex), graph1)){
//		printf("%s", num_vertex);
//	}
	
	fgets(num_vertex, sizeof(num_vertex), graph1);
	int size_graph1 = (strlen(num_vertex)+1)/2;
	printf("\nNumero de Vertices: %d\n", size_graph1);
	
//	printf("\nGraph 2:\n");
//	while(fgets(num_vertex, sizeof(num_vertex), graph2)){
//		printf("%s", num_vertex);	
//	}
	
	fgets(num_vertex, sizeof(num_vertex), graph2);
	int size_graph2 = (strlen(num_vertex)+1)/2;
	printf("\nNumero de Vertices: %d\n", size_graph2);
	
	if(size_graph1 != size_graph2){
		printf("Não sao isomorfos");
		return 0;
	}
	
	Node** adjacency_list1 = (Node**)malloc(size_graph1 * sizeof(Node*));
    for (int i = 0; i < size_graph1; ++i) {
        adjacency_list1[i] = NULL;
    }
    
    Node** adjacency_list2 = (Node**)malloc(size_graph2 * sizeof(Node*));
    for (int i = 0; i < size_graph2; ++i) {
        adjacency_list2[i] = NULL;
    }
    
    int row = 0;
    while (fgets(adjacency, sizeof(adjacency), graph1)) {
        char* token = strtok(adjacency, " ");
        int col = 0;
        while (token != NULL) {
            int is_adjacent = atoi(token);
            if (is_adjacent) {
                add_edge(adjacency_list1, row, col);
            }
            token = strtok(NULL, " ");
            col++;
        }
        row++;
    }
    
    row = 0;
    while (fgets(adjacency, sizeof(adjacency), graph2)) {
        char* token = strtok(adjacency, " ");
        int col = 0;
        while (token != NULL) {
            int is_adjacent = atoi(token);
            if (is_adjacent) {
                add_edge(adjacency_list2, row, col);
            }
            token = strtok(NULL, " ");
            col++;
        }
        row++;
    }
    
    printf("\nlista de adjacencias 1:\n");
    print_adjacency_list(adjacency_list1, size_graph1);
    printf("\nlista de adjacencias 2:\n");
    print_adjacency_list(adjacency_list2, size_graph2);
	
	
	
	return 0;
}












