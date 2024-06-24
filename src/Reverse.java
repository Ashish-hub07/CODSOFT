import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int dig,num,rev=0,rem;
        System.out.println("enter a number");
        num=sc.nextInt();
        while(num!=0)
        {
          dig=num%10;
          rev=rev*10+dig;
          num/=10;
        }
        System.out.println(rev);
    }
}
