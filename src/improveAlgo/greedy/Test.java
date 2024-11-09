package improveAlgo.greedy;

class Shape  {
    //from   ww w  . j  a va2 s  . c om
    static int i = 10;   {
        i = 15;
        System .out.print (" Shape "+i);
    }
    public Shape(){
        System.out.println("This is base");
    }
    static  { System .out.print (" Shape static "+i);  }
}

class Rectangle extends Shape  {
    static  {
        i = 45;
        System .out.print (" Rectangle static ");
    }{
        i = 30;
        System .out.print (" Rectangle "+i);
    }
}

class Square extends Rectangle{
    static  { System .out.println ("Square");  }
}
public class Test {
    public static void main (String [] args)  {
        Rectangle m = new Rectangle ();
    }
}
