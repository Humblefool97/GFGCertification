package com.example.dsa.gfg.graph;

import java.util.*;

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
     *
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
     *
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

    /**
     * TC = O(|V|+|E|)
     *
     * @param node
     * @param visited
     * @param recStack
     * @return
     */
    private boolean isCyclicUtil(int node, boolean[] visited, boolean[] recStack) {
        if (visited[node]) return false;
        if (recStack[node]) return true;
        visited[node] = true;
        recStack[node] = true; // Assume that we will find a cycle for this node
        List<Integer> adjNodes = adjList.get(node);
        for (Integer adjNode : adjNodes) {
            if (isCyclicUtil(adjNode, visited, recStack)) return true;
        }
        recStack[node] = false; //Cuz no such cycle found for this node
        return false;
    }

    public boolean isCyclic() {
        boolean[] visited = new boolean[size];
        boolean[] recStack = new boolean[size];
        for (int i = 0; i < adjList.size(); i++) {
            if (isCyclicUtil(i, visited, recStack)) return true;
        }
        return false;
    }


    /**
     * Return the node with minimum distance value in
     * distance array & not included in shortest path tree (SPT)
     *
     * @param distArr
     * @param sptSet
     * @return
     */
    private int getNodeWithMinDistance(int distArr[], boolean[] sptSet) {
        int minIndex = -1;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (!sptSet[i] && distArr[i] < minDistance) {
                minDistance = distArr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * Time Complexity: The time complexity of the Dijkstra's Algorithm when implemented using a min heap is O(ElogV),
     * where E is the number of Edges and V is the number of vertices.
     * <p>
     * Note: The Dijkstra's Algorithm doesn't work in the case when the Graph has negative edge weight.
     *
     * @param src
     * @return
     */
    private void dijkstras(int src) {
        boolean[] sptSet = new boolean[size];
        int[] distArray = new int[size];
        for (int i = 0; i < size; i++) {
            sptSet[i] = false;
            distArray[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < size; i++) {
            int u = getNodeWithMinDistance(distArray, sptSet);
            sptSet[u] = true;
            List<Integer> adjNode = adjList.get(u);
            for (int j = 0; j < adjNode.size(); j++) {
                //Refer psuedo code as the graph implementation for weightted graph is not there
//                if(!sptSet[adjNode.get(j)] && distArray[adjNode.get(j)] >  )
            }
        }
    }

    /**
     * Finding the connected components for an undirected graph is an easier task.
     * The idea is to traverse all of the unvisited vertices, and for each unvisited vertex print,
     * it's DFS or BFS traversal.
     */
    public void findStronglyConncted() {
        boolean[] visited = new boolean[size];
        for (int i = 0; i < size; i++) {
            if (!visited[i])
                dfsUtil(visited, i);
        }
    }
}
