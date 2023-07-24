
class Solution {
    public String s1;
    public String s2;

    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        int res = (goal+goal).indexOf(s);

        if(res==-1 || s.length()!=goal.length()){
            return false;
        }
        return true;
    }
}


public class Main {
    public static void main(String[] args) {

        Solution s=new Solution();
        s.s1="hello";
        s.s2="llohe";

        System.out.println( s.rotateString(s.s1,s.s2));
       // System.out.println("false");

    }
}