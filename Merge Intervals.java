// Problem Link : https://leetcode.com/problems/merge-intervals/description/

class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[] temp = intervals[0];

        for(int i=1; i<intervals.length; i++) {

            int[] arr = intervals[i];

            if(arr[0] <= temp[1]) temp[1] = Math.max(temp[1], arr[1]);

            else {

                list.add(temp);

                temp = arr;
            }
        }

        list.add(temp);

        int[][] result = new int[list.size()][2];

        for(int i=0; i<list.size(); i++) {

            result[i] = list.get(i);
        }
        
        return result;
    }
}
