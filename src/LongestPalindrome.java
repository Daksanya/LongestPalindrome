import java.util.Scanner;

public class LongestPalindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(findPalindrome(string));
    }
    static String findPalindrome(String string){
        String s="";
        for(int i=0; i<string.length()-1;i++){
            String str=isPalindrome(string,i,i);
            String str2=isPalindrome(string,i,i+1);
            if(str.length()>s.length()){
                s=str;
            }
            if(str2.length()>s.length()){
                s=str2;
            }
        }
        return s;
    }
    static String isPalindrome(String string, int start, int end){
        while(start>=0 && end<string.length() && string.charAt(start)==string.charAt(end)){
            start--;
            end++;
        }
        return string.substring(start+1,end);
    }

}