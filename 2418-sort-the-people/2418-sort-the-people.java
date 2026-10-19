class Solution {
    public static int getIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public String[] sortPeople(String[] names, int[] heights) {
        int[] stored_height = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            stored_height[i] = heights[i];
        }
        Arrays.sort(heights);
        for (int i = 0; i < heights.length / 2; i++) {
            int temp = heights[i];
            heights[i] = heights[heights.length - 1 - i];
            heights[heights.length - 1 - i] = temp;
        }
        String[] sorted_names = new String[names.length];
        for (int i = 0; i < heights.length; i++) {
            int temp = heights[i];
            int index = getIndex(stored_height, temp);
            sorted_names[i] = names[index];
        }
        System.out.println(Arrays.toString(heights));

        return sorted_names;
    }
}