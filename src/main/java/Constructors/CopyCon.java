package Constructors;

public class CopyCon {

    //copying values from constructor

    int id;
    String name;

    CopyCon(int i, String n){
        id=i;
        name=n;
    }

    CopyCon(CopyCon c){
        id=c.id;
        name=c.name;
        System.out.println("Copying values from constructor");
    }
    void display(){
        System.out.println(id+" "+name);
    }

    CopyCon(){
        System.out.println("Copying values without constructor");
    }
    void dis(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        CopyCon con = new CopyCon(10,"LM");
        CopyCon cn = new CopyCon(con);
        con.display();
        cn.display();
        CopyCon con2= new CopyCon(07,"CR");
        CopyCon cn2 = new CopyCon();
        cn2.id=con2.id;
        cn2.name=con2.name;
        con2.dis();
        cn2.dis();
    }
}
