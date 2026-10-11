class Solution {
    public boolean asteroidsDestroyed(int m, int[] asteroids) {
        long mass=m;
        Arrays.sort(asteroids);
        for(int i=0;i<asteroids.length;i++){
            if(mass>=asteroids[i]){
                mass+=asteroids[i];
            }else{
                return false;
            }
        }
        return true;
    }
}