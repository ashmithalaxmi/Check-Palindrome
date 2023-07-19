import java.util.Scanner;

public class CheckPalindrome {
    public static int isPalindrome(char[] str,int start,int end){
        if(start>end)
            return 1;
        if(str[start] != str[end])
            return 0;
        return isPalindrome(str,start+1,end-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr = scanner.nextLine();
        char[] str = arr.toCharArray();
        System.out.println(isPalindrome(str,0,arr.length()-1));
    }
}
