
 import java.io.*;
public class Pali {


        public static void main(String[] args) throws IOException
        {
            BufferedReader ob =new BufferedReader(new InputStreamReader(System.in));
            int num,rev=0,rem;

            System.out.println("enter a number");
            num=Integer.parseInt(ob.readLine());
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

