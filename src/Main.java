
class Solution {
    public String s1;
    public String s2;

    public boolean rotateString(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        int res = (s2+s2).indexOf(s1);

        if(res==-1 || s1.length()!=s2.length()){
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
