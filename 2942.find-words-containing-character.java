/*
 * @lc app=leetcode id=2942 lang=java
 *
 * [2942] Find Words Containing Character
 */

// @lc code=start
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<words.length; i++) {
            for(int j=0; j<words[i].length(); j++) {
                if(words[i].charAt(j)==x) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}
// @lc code=end

