public class Loading  {
    public void  load()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
    public void  load(int x,int y)

    {
        int c;

        c= x+y;

        System.out.println(c);

    }
    public void  load(char a)
    {

        System.out.println("ashu");

    }

    public static void main(String[] args) {
        Loading l= new Loading();
        l.load();
        l.load(5,6);
        l.load ('a');

    }
}
