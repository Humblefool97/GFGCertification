package com.example.dsa.gfg.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * DA in the form of Adjacency list
 * https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/
 */
public class DijkstrasAlgorithm {
    static class AdjList {
        //In real-life problems,We can have a map<id,Object> where the object can hold any info
        ArrayList<ArrayList<HashMap<Integer, Integer>>> adList;
        int size;

        public AdjList(int size) {
            adList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                adList.add(new ArrayList<>());
            }
        }

        public void addNode(int u, int v, int weight) {
            adList.get(u).add(new HashMap<>(v, weight));
        }

        public ArrayList<ArrayList<HashMap<Integer, Integer>>> getAdjList() {
            return adList;
        }
    }

    private int getMinimumDistanceNode(int[] dist, boolean[] sptSet, int n) {
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (!sptSet[i] && dist[i] < minValue) {
                minIndex = i;
                minValue = dist[i];
            }
        }
        return minIndex;
    }

    private void dijkstras(int src, int n, ArrayList<ArrayList<HashMap<Integer, Integer>>> adList) {
        boolean[] sptSet = new boolean[n];
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        for (int i = 0; i < n; i++) {
            int u = getMinimumDistanceNode(dist, sptSet, n);
            sptSet[u] = true;
            //Get all the adjoining nodes
            List<HashMap<Integer, Integer>> adjNodes = adList.get(u);
            for (int j = 0; j < adjNodes.size(); j++) {
                HashMap<Integer, Integer> node = adjNodes.get(0);
                for (Integer key : node.keySet()) {
                    if (!sptSet[key]) {
                        dist[key] = Math.min(dist[key], dist[u] + node.get(key));
                    }
                }
            }
        }
        //Print dist arr that gives distance value of src to all nodes
    }
}
