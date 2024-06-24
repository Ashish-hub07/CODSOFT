//Write a Java program that takes user input for the radius of a circle and calculates
//its area
 import java.util.*;

public class Tri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float rad,area;
        System.out.println("enter the radius of circle");
        rad= sc.nextFloat();
          area= (22/7*rad*rad);//3.14

        System.out.println("radius"+area);


    }
}
