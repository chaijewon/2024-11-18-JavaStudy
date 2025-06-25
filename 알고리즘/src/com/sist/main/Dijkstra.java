package com.sist.main;
// 그래프 최단경로 (다익스트라 알고리즘)
import java.util.*;

public class Dijkstra {
    static class Node implements Comparable<Node> {
        int vertex, dist;
        Node(int v, int d) { vertex = v; dist = d; }

        public int compareTo(Node o) {
            return this.dist - o.dist;
        }
    }

    public static int[] dijkstra(List<Node>[] graph, int start) {
        int n = graph.length;
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        while(!pq.isEmpty()) {
            Node cur = pq.poll();
            if(dist[cur.vertex] < cur.dist) continue;

            for(Node next : graph[cur.vertex]) {
                int newDist = dist[cur.vertex] + next.dist;
                if(newDist < dist[next.vertex]) {
                    dist[next.vertex] = newDist;
                    pq.offer(new Node(next.vertex, newDist));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int n = 5;
        List<Node>[] graph = new ArrayList[n];
        for(int i=0; i<n; i++) graph[i] = new ArrayList<>();

        // 간선 추가 (vertex, cost)
        graph[0].add(new Node(1, 10));
        graph[0].add(new Node(3, 30));
        graph[0].add(new Node(4, 100));
        graph[1].add(new Node(2, 50));
        graph[2].add(new Node(4, 10));
        graph[3].add(new Node(2, 20));
        graph[3].add(new Node(4, 60));

        int start = 0;
        int[] distances = dijkstra(graph, start);
        for(int i=0; i<n; i++) {
            System.out.println(start + "에서 " + i + "까지 최단 거리: " + distances[i]);
        }
    }
}
