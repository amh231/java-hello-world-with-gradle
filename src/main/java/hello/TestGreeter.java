package hello;

public class TestGreeter {

  public static void main() {
    
    /** -- Pass Test --
    Greeter passTest1 = new Greeter("Allyn");
    Greeter passTest2 = new Greeter("Software Engineering");
    Greeter passTest3 = new Greeter("NAMESSSS!"); 
    
    System.out.println( passTest1.sayHello() );
    System.out.println( passTest2.sayHello() );
    System.out.println( passTest3.sayHello() );
    **/
    
    /** -- Fail Test -- **/
    Greeter failTest1 = new Greeter("         ");
    Greeter failTest2 = new Greeter();
    Greeter failTest3 = new Greeter(1234);
    
    System.out.println( failTest1.sayHello() );
    System.out.println( failTest2.sayHello() );
    System.out.println( failTest3.sayHello() );
    
  }
  
}
