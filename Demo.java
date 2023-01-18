
import java.util.Scanner;

public class Demo {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.print("Enter any number: ");
        int n = scanner.nextInt();

        int result = obj.digitsInFactorial(n);
        System.out.println("Digits in factorial : "+result);
    }

}

class Solution{
    public int digitsInFactorial(int N){
        int  factorial =1;
        for(int i=1;i<=N;i++){
            factorial *= i;
        }
        int count =1;
        while(factorial != 0){
            factorial = factorial % 10;
            count++;
        }
        return count;
    }
}