import java.util.Scanner;

class cal
{
    int a,b,c;
    public int  add()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("value of x:");
        a=s.nextInt();
        System.out.println("value of y:");
        b=s.nextInt();
        c=a+b;
        s.close();
        return c;
    }

}
public class m {
    public static void main(String[] args) {
        int a;
        cal c1= new cal();
        a=c1.add();
        System.out.println("total is "+a);
    }
    
}
