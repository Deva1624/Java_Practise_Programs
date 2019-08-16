import java.util.Scanner;
class Base{
    double length, breadth;
   void Shape(double l, double b){
      length = l;
      breadth= b;
    }
    void Shape(double len){  
     length = breadth = len;
   }
    double calculate(){ 
    return length * breadth ;
  }
}
public class Test1 extends Base{
    double height;
    public void Test1(double l , double b, double h){
        Shape(l,b);
        height = h;
    }
    public void Test1(double l , double b){
        Shape(l);
        height = b;
    }
    double calculate(){
        return length*breadth*height;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Create an object to read input                                                            
	    double l=sc.nextDouble(); //Read length
	    double b=sc.nextDouble(); //Read breadth	
	    double h=sc.nextDouble(); //Read height
	    Test1 myshape1 = new Test1();
        myshape1.Test1(l,h);
	    Test1 myshape2 = new Test1();
        myshape2.Test1(l,b,h);
        double volume1 = myshape1.calculate();
        double volume2=myshape2.calculate();

        System.out.println(volume1);
        System.out.println(volume2);
    }
}