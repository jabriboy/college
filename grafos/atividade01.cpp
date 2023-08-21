#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Node {
    int vertex;
    struct Node* next;
} Node;

Node* createNode(int vertex) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->vertex = vertex;
    newNode->next = NULL;
    return newNode;
}

void addEdge(Node** adjacencyList, int src, int dest) {
    Node* newNode = createNode(dest);
    newNode->next = adjacencyList[src];
    adjacencyList[src] = newNode;
}

void printAdjacencyList(Node** adjacencyList, int numVertices) {
    for (int i = 0; i < numVertices; ++i) {
        printf("Vertex %d: ", i);
        Node* current = adjacencyList[i];
        while (current != NULL) {
            printf("-> %d", current->vertex);
            current = current->next;
        }
        printf("\n");
    }
}

int main() {
    FILE* file = fopen("grafo.txt", "r");
    if (file == NULL) {
        perror("Erro ao abrir o arquivo");
        return 1;
    }

    char line[100];
    fgets(line, sizeof(line), file);
    char* token = strtok(line, " ");
    int numVertices = 0;

    while (token != NULL) {
        token = strtok(NULL, " ");
        numVertices++;
    }

    Node** adjacencyList = (Node**)malloc(numVertices * sizeof(Node*));
    for (int i = 0; i < numVertices; ++i) {
        adjacencyList[i] = NULL;
    }

    int row = 0;
    while (fgets(line, sizeof(line), file)) {
        token = strtok(line, " ");
        int col = 0;
        while (token != NULL) {
            int isAdjacent = atoi(token);
            if (isAdjacent) {
                addEdge(adjacencyList, row, col);
            }
            token = strtok(NULL, " ");
            col++;
        }
        row++;
    }

    printAdjacencyList(adjacencyList, numVertices);

    for (int i = 0; i < numVertices; ++i) {
        Node* current = adjacencyList[i];
        while (current != NULL) {
            Node* temp = current;
            current = current->next;
            free(temp);
        }
    }
    free(adjacencyList);

    fclose(file);
    return 0;
}

