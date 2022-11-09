package String;

public class palindrome {
    public static void main(String[] args){
        String s = "nitin";
        int n = s.length();
        String rev = "";

        for(int i=n-1;i>=0;i--){
            rev += s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.print("is a palindrome");
        }else{
            System.out.print("not a palindrome");
        }
    }
}
