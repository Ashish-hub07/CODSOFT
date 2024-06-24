
import java.util.*;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int num,rev=0,rem;

        System.out.println("enter a number");
        num=sc.nextInt();
        int temp=num;

        while (num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(temp==rev )
        {
            System.out.println("is palindrom"+temp);
        }
        else
        {
            System.out.println("not palindrom");
        }


    }
}