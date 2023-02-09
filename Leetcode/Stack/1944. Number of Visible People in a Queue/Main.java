class Solution {
        public int[] canSeePersonsCount(int[] A) {
            int n = A.length, res[] = new int[n];
            Stack<Integer> stack = new Stack();
            for (int i = 0; i < n; ++i) {
                while (!stack.isEmpty() && A[stack.peek()] <= A[i])
                    res[stack.pop()]++;
                if (!stack.isEmpty())
                    res[stack.peek()]++;
                stack.add(i);
            }
            return res;
        }
    }
}