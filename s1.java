import java,util.Scanner;
public class StudentMarkList{
public static void main(String[]args)
{
  Scanner sc = new Scanner(System.in);
   System.out.println("enter Student name:");
    String name =sc.nextLine();
   System.out.println("enter the mark1:");
   int m1=sc.nextInt();
   System.out.println("enter the mark2:");
   int m2=sc.nextInt();
   int total=m1+m2;
   int average =total/2;
  System.out.println("student name:"+name);
  System.out.println("total marks:"+total);
  system.out.println"average:"+average);
}
}
