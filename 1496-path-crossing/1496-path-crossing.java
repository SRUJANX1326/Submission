class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> visited = new HashSet<>();
        int i = 0;
        int j = 0;

        visited.add("0,0");

        for (int k = 0; k < path.length(); k++) {
            char direction = path.charAt(k);
            if (direction == 'N') {
                j++;
            } else if (direction == 'S') {
                j--;
            } else if (direction == 'E') {
                i++;
            } else if (direction == 'W') {
                i--;
            }

            String currentCoord = i + "," + j;
            if (visited.contains(currentCoord)) {
                return true;
            }
            visited.add(currentCoord);
        }

        return false;
    }
}