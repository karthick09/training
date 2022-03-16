import java.util.Scanner;

class studentmaste {
    public String adno;
    public String name;
    public void details()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the admission no");
        adno=s.next();
        s.nextLine();
        System.out.println("enter the name");
        name=s.nextLine();
    }
    public String get_adno()
    {
        return adno;
    }
    public String get_name()
    {
        return name;
    }
}
class cse extends studentmaste{
    int deptid,year;
    float cgpa;
    String mentorname;
    public void dept_details(){
        Scanner s=new Scanner(System.in);
        System.out.println("enetr the dept id");
        deptid=s.nextInt();
        System.out.println("enetr the year");
        year=s.nextInt();
        System.out.println("enter cgpa");
        cgpa=s.nextFloat();
        s.nextLine();
        System.out.println("enetr the name of the mentor ");
        mentorname=s.nextLine();
        s.close();
    }
    public int get_deptid(){
        return deptid;
    }
    public int get_year(){
        return year;
    }
    public float get_cgpa(){
        return cgpa;
    }
    public String get_mentorname()
    {
        return mentorname;
    }
    public void display()
    {
        System.out.println("the admission is "+adno);
        System.out.println("the name of student "+name); 
        System.out.println("the dept id is  "+deptid);  
        System.out.println("the year  "+year);
        System.out.println("the CGPA is  "+cgpa);
        System.out.println("the mentor name is  "+mentorname);

    }
    
}
public class student{
    public static void main(String[] args) {
        cse s=new cse();
        s.details();
        s.dept_details();
        s.display();


    }

}
