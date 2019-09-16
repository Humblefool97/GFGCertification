package com.example.dsa.gfg.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * TC = O(|V|)
 * SC = O(|V|+|E|)
 */
public class AdjList {
    private boolean isDirected;
    private ArrayList<ArrayList<Integer>> adjList;
    private int size;

    public AdjList(int size, boolean isDirected) {
        adjList = new ArrayList<>();
        for (int i = 0; i < size; i++)
            adjList.add(new ArrayList<>());
        this.isDirected = isDirected;
    }

    public void addNode(int u, int v) {
        adjList.get(u).add(v);
        if (!isDirected) adjList.get(v).add(u);
    }

    /**
     * BFS applications:
     * https://www.geeksforgeeks.org/applications-of-breadth-first-traversal/
     * @param v
     */
    public void bfs(int v) {
        //Create an auxillary array to mark all visited nodes
        boolean[] visitedNode = new boolean[size];
        for (int i = 0; i < size; i++)
            visitedNode[i] = false;
        int s = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visitedNode[s] = true;
        //one by one pop the element,which each & every neighbour & then push the neighbour in the queue
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(node);
            for (int i = 0; i < adjList.get(node).size(); i++) {
                int neighbourNode = adjList.get(node).get(i);
                if (!visitedNode[neighbourNode]) {
                    visitedNode[neighbourNode] = true;
                    queue.add(neighbourNode);
                }
            }
        }
    }

    /**
     * First visit the start node, then go visit its neighbour & its neighbour & its neighbour & its.....
     * applications:
     * https://www.geeksforgeeks.org/applications-of-depth-first-search/
     * @param start
     */
    public void dfs(int start) {
        boolean[] visited = new boolean[size];
        dfsUtil(visited, start);
    }

    private void dfsUtil(boolean[] visited, int node) {
        visited[node] = true;
        System.out.println(node);

        for (int n : adjList.get(node)) {
            if (!visited[n])
                dfsUtil(visited, n);
        }

    }
}
