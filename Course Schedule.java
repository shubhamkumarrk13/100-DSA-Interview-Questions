// Problem Link : https://leetcode.com/problems/course-schedule/description/

class Solution {

    public boolean canFinish(int N, int[][] prerequisites) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        int[] indegree = new int[N];

        for(int[] arr : prerequisites) {

            int u = arr[0];

            int v = arr[1];

            // v ---> u

            indegree[u]++;

            map.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<N; i++) {

            if(indegree[i] == 0) q.offer(i);
        }

        int cnt = 0;

        while(!q.isEmpty()) {

            int u = q.poll();

            cnt++;

            for(int v : map.getOrDefault(u, new ArrayList<>())) {

                indegree[v]--;

                if(indegree[v] == 0) q.offer(v);
            }
        }

        if(cnt == N) return true;

        return false;

    }
}
