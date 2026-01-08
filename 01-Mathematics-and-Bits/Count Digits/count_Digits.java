import java.util.Scanner;

public class count_Digits {

    public static int CountDigits(int x)
    {
        x= Math.abs(x);
        int count = 0;
        if(x ==0) return 1;
        while(x > 0){
            x=x/10;
            count ++;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = CountDigits(x);
        System.out.printf("Total digits: %d",ans);

    }
}
