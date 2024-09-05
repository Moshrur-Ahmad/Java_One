import java.lang.*;
public class JavaClass {
    boolean b1;
    boolean b2=true;
    boolean b3;
    int i1=7;
    int i2;
    //Default Constructor
    public JavaClass()
    {
        System.out.println("Default cons calling");
        this.b1=false;
        b2=false;
    }
    public JavaClass(int a,int b)
    {
        System.out.println("Para cons calling!");
        this.i1=a;
        i2=b;
    }
    public JavaClass(int x,int y,boolean c1)
    {
        System.out.println("Three para cons calling!");
        this.i1=x;
        this.i2=y;
        b1=c1;
    }
    public void show()//Method Creation
    {
        System.out.println("Showing!");
        System.out.println("Value of b1 "+this.b1);
        System.out.println("Value of b2 "+this.b2);
        System.out.println("Value of i1 "+this.i1);
        System.out.println("Value of i2 "+this.i2);
    }
    public static void main(String[] args) {
       // JavaClass obj1=new JavaClass();//object create done,default cons done
      //  obj1.show();
       // System.out.println(obj1.b2);
      //  System.out.println("Value of i1 "+obj1.i1);
      //  System.out.println("Value of b3 "+obj1.b3);
       // JavaClass obj2=new JavaClass(5,6);
      //  obj2.show();
      //  System.out.println("Value of i2 "+obj2.i2);
        JavaClass obj3=new JavaClass(7,9,true);
        obj3.show();
        System.out.println("Value of i1 "+obj3.i1);
        System.out.println("Value of i2 "+obj3.i2);
        System.out.println("Value of b3 "+obj3.b1);
    }
}
