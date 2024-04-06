import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        final int INF = 9999;
        
        // 그래프 초기화
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 그래프 생성
        for (int[] e : edge) {
            int start = e[0];
            int end = e[1];
            graph.get(start).add(new int[]{end, 1});
            graph.get(end).add(new int[]{start, 1});
        }

        // 다익스트라 알고리즘
        int[] distances = new int[n + 1];
        Arrays.fill(distances, INF);
        distances[1] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.offer(new int[]{1, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int distance = current[1];
            if (distance > distances[node]) continue;

            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0];
                int weight = neighbor[1];
                int nextDistance = distance + weight;
                if (nextDistance < distances[nextNode]) {
                    distances[nextNode] = nextDistance;
                    pq.offer(new int[]{nextNode, nextDistance});
                }
            }
        }

        // 최대 거리 찾기
        int maxDistance = 0;
        for (int i = 1; i <= n; i++) {
            if (distances[i] != INF && distances[i] > maxDistance) {
                maxDistance = distances[i];
            }
        }

        // 최대 거리를 가진 노드의 개수 세기
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (distances[i] == maxDistance) {
                answer++;
            }
        }

        return answer;
    }
}