import java.lang.*;
public class Typecasting {
    public static void main(String[] args) {
        byte b1=25;//1 byte
        System.out.println("Hello Java");
        System.out.println("Value of b1: "+b1);
        int i1;//4 bytes
        i1=b1;//implicit typecasting
        System.out.println("Value of i1: "+i1);
        double d1=2.55;//8 bytes
        System.out.println("Value of d1: "+d1);
        float f1;//4 bytes
        f1=(float)d1;//Explicit
        System.out.println("Value of f1: "+f1);
        float f2=3.56f;
        System.out.println("Value of f2: "+f2);
        byte b2;
        b2=(byte)f2;//Explicit
        System.out.println("Value of b2: "+b2);
        String s1="121";//Non primitive data type
        System.out.println("Value of s1: "+s1);
        int i3;//Primitive data type
        i3=Integer.parseInt(s1);//Wraper to primitive done
        System.out.println("Value of i3 "+i3);
        double d2=Double.parseDouble(s1);
        System.out.println("Value of d2: "+d2);
    }
}
