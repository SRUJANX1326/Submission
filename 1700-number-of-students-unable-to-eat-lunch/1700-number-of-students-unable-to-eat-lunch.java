class Solution {
    public boolean ALSame(ArrayList<Integer> AL){
        for(int i=1;i<AL.size();i++){
            if(AL.get(i-1)!=AL.get(i)) return false;
        }
        return true;
    }
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayList<Integer> students_AL=new ArrayList();
        for(int i=0;i<students.length;i++){
            students_AL.add(students[i]);
        }
        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==students_AL.getFirst()){
                students_AL.removeFirst();
            }else{
                int temp=students_AL.removeFirst();
                students_AL.addLast(temp);
                i--;
                if(ALSame(students_AL)) return students_AL.size();
            }
        }
        return 0;
    }
}