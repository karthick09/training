abstract class nokia1
{
    public void sim_card(){
        System.out.println("250mb");
    }
    abstract void camera();
}
class nokia3 extends nokia1
{
    public void sim_card()
    {
        System.out.println("2 gb");

    }
    public void camera()
    {
        System.out.println("5mb");

    }
}
public class abstar {
    public static void main(String[] args) {
        nokia3 t= new nokia3();
        t.sim_card();
        t.camera();
    }
    
}
