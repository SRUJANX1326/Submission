class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> visited=new HashSet();
        int i=0;
        int j=0;
        visited.add("0,0");
        for(int k=0;k<path.length();k++){
            if(path.charAt(k)=='N'){ j++; }
            if(path.charAt(k)=='S'){ j--; }
            if(path.charAt(k)=='E'){ i++; }
            if(path.charAt(k)=='W'){ i--; }
            if(visited.contains("%d,%d".formatted(i,j))) return true;
            else visited.add("%d,%d".formatted(i,j));
        }
        return false;
    }
}