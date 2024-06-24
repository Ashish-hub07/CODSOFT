class An
{
  void name()
  {
      System.out.println("ethi nhue");
  }

}
class Bn extends An
{

    void name() {
       // super.name();
        System.out.println("sethi achi");
    }

}
class Dynamic
{
    public static void main(String[] args) {
        An a=new Bn();
        a.name();
    }
}
