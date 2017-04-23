package hello;



public class Greeter {



  private String name = "";
  
  public Greeter(String names){
    name = names;
  }


  public String getName() 

  {

    return name;

  }



  public void setName(String name) 

  {

      this.name = name;

  }



  public String sayHello() 

  {

  	if (name == "") 

    {

       return "Hi!";

    }

    else 

    {

       return "Hi " + name + "!";

    }

  }

}
