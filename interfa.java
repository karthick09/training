import java.util.Scanner;

interface emp{
    void details();
}
class scomp implements emp{
    int empno;
    public void details(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter scomp emp no :");
        empno=s.nextInt();
        System.out.println("scomp emp no :");
        System.out.println(empno);
    }

}
class ecomp implements emp{
    int empno;
    public void details(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter scomp emp no :");
        empno=s.nextInt();
        System.out.println("scomp emp no :");
        System.out.println(empno);

    }

}
public class interfa {
    public static void main(String[] args) {
        scomp n =new scomp();
        ecomp m =new ecomp();
        emp a=n;
        emp b=m;
        a.details();
        b.details();
    }  
    
    
}
