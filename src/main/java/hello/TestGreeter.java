package hello;

public class TestGreeter {

  public static void main() {
    
    Greeter test1 = new Greeter("Allyn");
    Greeter test2 = new Greeter("Software Engineering");
    Greeter test3 = new Greeter("NAMESSSS!"); 
    
    System.out.println( test1.sayHello() );
    System.out.println( test2.sayHello() );
    System.out.println( test3.sayHello() );
  }
  
}
