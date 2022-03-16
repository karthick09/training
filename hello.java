import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        String ch=s.next();
        System.out.println(ch);
        System.out.print(a+b*c);
        s.close();
    }
}
class test
{
    public static void main(String[] args) {
        System.out.println("test");
    }
}