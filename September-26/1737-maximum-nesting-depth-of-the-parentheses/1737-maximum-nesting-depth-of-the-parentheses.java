class Solution {
    public int maxDepth(String s) {
        int res = 0;

        Stack<Character> stack = new Stack<Character>();
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            }
            
            res = Math.max(res, stack.size());
        }
        
        return res;
    }
}