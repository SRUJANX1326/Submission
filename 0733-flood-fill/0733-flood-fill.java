class Solution {
    int width,height;
    public void changeColor(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        image[sr][sc] = color;
        
    if(sr+1<=height) if (oldColor == image[sr + 1][sc]) {
            changeColor(image, sr + 1, sc, color);
        }
    if(sc-1>=0)    if (oldColor == image[sr][sc - 1]) {
            changeColor(image, sr, sc - 1, color);
        }
    if(sc+1<=width)    if (oldColor == image[sr][sc + 1]) {
            changeColor(image, sr, sc + 1, color);
        }
    if(sr-1>=0)    if (oldColor == image[sr - 1][sc]) {
            changeColor(image, sr - 1, sc, color);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        height=image.length-1;
        width=image[0].length-1;
        if (image[sr][sc] != color) {
            changeColor(image, sr, sc, color);
        }
        return image;
    }
}