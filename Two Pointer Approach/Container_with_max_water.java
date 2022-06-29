//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

 

// Example 1:


// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
// Example 2:

// Input: height = [1,1]
// Output: 1
 

// Constraints:

// n == height.length
// 2 <= n <= 105
// 0 <= height[i] <= 104
//Time Complexity: O(n)

public class Container_with_max_water {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int res =0;
        int currAnswer = 0;
        while(i!=j)
        {
            if(height[i]>height[j])
            {
                currAnswer = height[j]*(j-i);
                res = Math.max(res,currAnswer);
                j--;
            }
            else{
                currAnswer = height[i]*(j-i);
                res = Math.max(res,currAnswer);
                i++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Container_with_max_water obj = new Container_with_max_water();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(height));
    }
}
