import java.util.Scanner;
class question2{
 public static void main(String[]args){
     Scanner in =new Scanner(System.in);
     System.out.println("******** WELCOME TO ENJOY TOGETHER FOR PLAYING WORD GAME**********!!!!");
     System.out.println("YOU HAVE TO FILL THE FOLLOWINGS");

     System.out.print("WHAT IS YOUR NAME:");
     Scanner scanner=new Scanner(System.in);
     String name=in.nextLine();
     System.out.println("MY NAME IS:"+name);

     System.out.print("WHICH CITY ARE YOU COME FROM:");
     Scanner scanner2=new Scanner(System.in);
     String city=in.nextLine();
     System.out.println("I'M COME FROM:"+city);

     System.out.print("YOUR AGE:");
     Scanner scanner3 =new Scanner(System.in);
     int age=in.nextInt();
     System.out.println("MY AGE:"+age);

     System.out.print("WHAT KIND OF PET YOU LIKE:");
     Scanner scanner4=new Scanner(System.in);
     String patname=in.nextLine();
     System.out.println("THE PET I LIKE IS:"+patname);

     System.out.print("WHAT IS YOUR PROFESSIONAL:");
     Scanner scanner5 =new Scanner(System.in);
     String professional=in.nextLine();
     System.out.println("MY PROFESSIONAL:"+professional);

     System.out.print("WHICH COLLAGE ARE YOU:");
     Scanner scanner6=new Scanner(System.in);
     String collagename=in.nextLine();
     System.out.println("MY COLLAGE IS:"+collagename);

 }
}
