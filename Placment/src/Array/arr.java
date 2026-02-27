package Array;

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//made obj
        System.out.print("Enter the host: ");
        int num = sc.nextInt();//user input

        int[] arr1 = new int[num];

//input
        for(int j=0;j<num;j++){
            System.out.print("Enter the number: ");
            arr1[j]=sc.nextInt();

        }
        System.out.print("Enter the number of x: ");
        int x=sc.nextInt();


         boolean found=false;
        //output
            for (int i = 0; i < arr1.length; i++) {//loop
            if(arr1[i]==x){
            System.out.println("X found in location: "+i);
            found=true;
}
            }
            if(!found){
                System.out.println("x is not in  array ");
            }
        }
    }

