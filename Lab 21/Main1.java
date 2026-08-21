class Person {

    void show() {
        System.out.println("Someone enter in the room");
    } 
}
public class Main1{
  public static void main(String[] args) {

        Person p = new Person() {

            void show() {
                System.out.println("p enter in class");
            }

        };

        Person p2=new Person();
        p.show();
        p2.show();
    }
}