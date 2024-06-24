public class Methodex {
  /*  Methodex()
    {
        System.out.println("hii");
    }*/
    Methodex(String a)
    {
        System.out.println("my name is " +a);
    }
    Methodex(int a ,int b)
    {
        System.out.println("add "+ (a+b));
    }
    public void demo()
    {
        System.out.println("small exaple");
    }

    public static void main(String[] args) {
        Methodex me=new Methodex("ashish");
        Methodex ad=new Methodex(3,4);
        me.demo();
    }


}
