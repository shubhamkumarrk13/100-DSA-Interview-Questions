class Solution {

    public int[] findLeftMax(int[] height) {

        int n = height.length;

        int[] leftMax = new int[n];

        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {

            if(height[i] > maxi) maxi = height[i];

            leftMax[i] = maxi;
        }

        return leftMax;
    }

    public int[] findRightMax(int[] height) {

        int n = height.length;

        int[] rightMax = new int[n];

        int maxi = Integer.MIN_VALUE;

        for(int i=n-1; i>=0; i--) {

            if(height[i] > maxi) maxi = height[i];

            rightMax[i] = maxi;
        }

        return rightMax;
    }

    public int trap(int[] height) {

        int[] leftMax = findLeftMax(height);

        int[] rightMax = findRightMax(height);

        int result = 0;

        for(int i=0; i<height.length; i++) {

            if(leftMax[i] > height[i] && rightMax[i] > height[i]) result = result + (Math.min(leftMax[i], rightMax[i]) - height[i]);
        }

        return result;
        
    }
}
