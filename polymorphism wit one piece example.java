package Inheritance;

class Garp
{
    public void info()
    {
        System.out.println("he is powerful marine");
    }

    public void post()
    {
        System.out.println("vice admiral");
    }
}

class ace extends Garp
{
     public void info()
    {
        System.out.println("he is fire fist ace");
    }

    public void post()
    {
        System.out.println("commander of whitebeard ship");
    }
}

class sabo extends Garp
{
     public void info()
    {
        System.out.println("he is a criminal");
    }

    public void post()
    {
        System.out.println("2nd hand of revolutionist");
    }
}

class luffy extends Garp
{
     public void info()
    {
        System.out.println("he will be king of the pirates");
    }

    public void post()
    {
        System.out.println("Captian of straw hats");
    }
}

class sengoku
{
    public void poly(Garp ref)
    {
        ref.info();
        ref.post();

        System.out.println("***********************************************");
    }


}

public class polymorphism4 
{
    public static void main(String[] args) {
        
        ace a= new ace();
        sabo s= new sabo();
        luffy l= new luffy();
        sengoku sg= new sengoku();

        sg.poly(a);
        sg.poly(s);
        sg.poly(l);


    }
    
}
