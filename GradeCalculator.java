import java.util.Scanner;
class GradeCalculator
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        float m,e,h;
        float avg;
        String sub1,sub2,sub3;
        float TotalMark,Avgper;
        System.out.println("Enter marks of subject");
        sub1=sc.next();
        sub2=sc.next();
        sub3=sc.next();
        System.out.println("Enter marks of corresponding subject");
        m=sc.nextInt();
        e=sc.nextInt();
        h=sc.nextInt();
        TotalMark=(m+h+e);
        avg=(m+h+e)/300;
        Avgper=avg*100;
        if(Avgper>=80)
        {
                      
         System.out.println("TOtalMarks="+TotalMark);
         System.out.println("Average percentage="+Avgper);
         System.out.println("Grade=A");

        }
        else if(Avgper<80 && Avgper>=60)
        {
              System.out.println("TOtalMarks="+TotalMark);
         System.out.println("Average percentage="+Avgper);
         System.out.println("Grade=B");
                    
        }
        else if(Avgper<60 && Avgper>=40)
        {
              System.out.println("TOtalMarks="+TotalMark);
         System.out.println("Average percentage="+Avgper);
         System.out.println("Grade=C");
        }
        else
        {
              System.out.println("TOtalMarks="+TotalMark);
         System.out.println("Average percentage="+Avgper);
         System.out.println("Grade=D");
        }


    }
}
