class Solution {
    public void changeColor(int[][] image,int sr,int sc,int color){
        int oldColor=image[sr][sc];
        image[sr][sc]=color;
        try{
            if(oldColor==image[sr+1][sc]){
                changeColor(image,sr+1,sc,color);
            }
        }catch(Exception E){

        }
        try{
            if(oldColor==image[sr][sc-1]){
                changeColor(image,sr,sc-1,color);
            }
        }catch(Exception E){

        }
        try{
            if(oldColor==image[sr][sc+1]){
                changeColor(image,sr,sc+1,color);
            }
        }catch(Exception E){

        }
        try{
            if(oldColor==image[sr-1][sc]){
                changeColor(image,sr-1,sc,color);
            }
        }catch(Exception E){

        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] != color) {
            changeColor(image,sr,sc,color);
        }
        return image;
    }
}