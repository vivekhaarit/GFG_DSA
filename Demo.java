
import java.util.Scanner;

public class Demo {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.print("Enter any number: ");
        int n = scanner.nextInt();

        boolean result = obj.isPrime(n);
        System.out.println("The number is : "+result);
    }

}

class Solution {
    public boolean isPrime(int N) {
        if(N == 2 || N ==3 || N==5 || N==7 || N== 11 || N== 13) return true;
        else{
            int n = (int)Math.floor(Math.sqrt(N));
            int i=2;
            for (;i<=n;i++){
                if(N%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}