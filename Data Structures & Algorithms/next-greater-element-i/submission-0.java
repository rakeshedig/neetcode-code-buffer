class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Find next greater element for nums2
        for (int num : nums2) {

            while (!stack.isEmpty() && num > stack.peek()) {
                int smaller = stack.pop();
                map.put(smaller, num);
            }

            stack.push(num);
        }

        // Step 2: Build answer for nums1
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }

        return result;
    }
}