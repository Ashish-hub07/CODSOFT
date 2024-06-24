public class Ridding {

    void Animal() {
        System.out.println("dog");
    }
}
 class Sound extends Ridding {
     @Override
     void Animal() {
         super.Animal();
         System.out.println("hihhiiii");
     }

     public static void main(String[] args) {
         Sound s = new Sound();
         s.Animal();
     }
 }












