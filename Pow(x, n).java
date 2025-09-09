// Problem Link : https://leetcode.com/problems/powx-n/description/

class Solution {

    public double myPow(double x, int n) {

        long power = n;

        double result = 1;

        if(power < 0) power = -power;

        while(power > 0) {

            if(power % 2 == 1) {

                result = result * x;

                power = power - 1;
            }

            else {

                power = power / 2;

                x = x * x;
            }
        }

        if(n < 0) return 1 / result;

        return result;
        
    }
}
