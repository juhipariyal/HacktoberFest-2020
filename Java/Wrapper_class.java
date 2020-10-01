public class Wrapper_class{

    public static void main(String args[]){
        byte b=20;
        short s=50;
        int i=10;
        long l=40000000;
        float f=50.0555F;
        double d=60.0D;
        char c='A';
        boolean b1=true;

//Autoboxing: Converting primitives into objects
        Byte bobj=b;
        Short sobj=s;
        Integer iobj=i;
        Long lobj=l;
        Float fobj=f;
        Double dobj=d;
        Character cobj=c;
        Boolean b1obj=b1;

//Printing objects
        System.out.println("---Object values---");
        System.out.println("Byte object: "+bobj);
        System.out.println("Short object: "+sobj);
        System.out.println("Integer object: "+iobj);
        System.out.println("Long object: "+lobj);
        System.out.println("Float object: "+fobj);
        System.out.println("Double object: "+dobj);
        System.out.println("Character object: "+cobj);
        System.out.println("Boolean object: "+b1obj);

//Unboxing: Converting Objects to Primitives
        byte bvalue=bobj;
        short svalue=sobj;
        int ivalue=iobj;
        long lvalue=lobj;
        float fvalue=fobj;
        double dvalue=dobj;
        char cvalue=cobj;
        boolean b1value=b1obj;

//Printing primitives
        System.out.println("\n---Primitive values---");
        System.out.println("byte value: "+bvalue);
        System.out.println("short value: "+svalue);
        System.out.println("int value: "+ivalue);
        System.out.println("long value: "+lvalue);
        System.out.println("float value: "+fvalue);
        System.out.println("double value: "+dvalue);
        System.out.println("char value: "+cvalue);
        System.out.println("boolean value: "+b1value);
    }
}

