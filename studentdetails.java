import java.util.Scanner;

public class studentdetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the total number of students :");
        int k = 0, n = sc.nextInt();
        int[] tamil, english, maths, sci, soc, total;
        tamil = new int[n];
        english = new int[n];
        maths = new int[n];
        sci = new int[n];
        soc = new int[n];
        total = new int[n];

        String[] name = new String[n];
        System.out.println ("Enter the details of the Student :");
        while (k < n) {
            System.out.println ("Enter the name of the student :");
            name[k] = sc.nextLine();
            sc.nextLine();
            System.out.println ("Enter the marks secured in tamil : ");
            tamil[k] = sc.nextInt();
            System.out.println ("Enter the marks secured in english : ");
            english[k] = sc.nextInt();
            System.out.println ("Enter the marks secured in Maths : ");
            maths[k] = sc.nextInt();
            System.out.println ("Enter the marks secured in Science : ");
            sci[k] = sc.nextInt();
            System.out.println ("Enter the marks secured in Social Science : ");
            soc[k] = sc.nextInt();
            total[k] = tamil[k] + english[k] + maths[k] + sci[k] + soc[k];
            k+=1;
        }

        k = 0;
        System.out.println ("\n\n\nMarks Information of the students : ");
        while (k < n) {
            System.out.println ("Total marks secured by the student " + name[k] + " is " + total[k]);
            System.out.println ("Tamil : " + tamil[k]);
            System.out.println ("English : " + english[k]);
            System.out.println ("Maths : " + maths[k]);
            System.out.println ("Science : " + sci[k]);
            System.out.println ("Social Science : " + soc[k]);
            System.out.println();
            k+=1;
        }
        sc.close();

    }
    
}
