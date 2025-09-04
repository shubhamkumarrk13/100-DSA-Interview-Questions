// Problem Link : https://leetcode.com/problems/top-k-frequent-elements/description/

class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int ele : nums) {

            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {

            minHeap.offer(entry);

            if(minHeap.size() > k) minHeap.poll();
        }

        int[] result = new int[k];

        int ind = 0;

        while(!minHeap.isEmpty()) {

            Map.Entry<Integer, Integer> entry = minHeap.poll();

            result[ind++] = entry.getKey();
        }

        return result;
        
    }
}
