import java.util.Scanner;

public class insta {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year: ");

int year=sc.nextInt();
if(year%400==0||year%4==0&&year%100!=0){
    System.out.println(year+" It is leap");

}else {
    System.out.println(year+" it is not leap");
}

    }
}

