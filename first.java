class a{
    void display(){
        System.out.println("class A");
    }
}
class b extends a{
    void display()
    {
        System.out.println("class B");
    }
}
public class first 
{
    public static void main(String[] args) 
    {
        b obj = new b();
        obj.display();
    }
}