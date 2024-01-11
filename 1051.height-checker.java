/*
 * @lc app=leetcode id=1051 lang=java
 *
 * [1051] Height Checker
 */

// @lc code=start
class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] sortedArray = Arrays.copyOf(heights,heights.length);
        Arrays.sort(sortedArray);
        for (int i = 0; i < sortedArray.length; i++) {
            if(sortedArray[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}
// @lc code=end

