package String;

public class rev_str {
    public static void main(String[]args){
        String a = "myname";
        int n = a.length();
        String rev = "";
        for(int i= n-1;i>=0;i--){
            rev += a.charAt(i);
        }
        System.out.print(rev);
    }
}
