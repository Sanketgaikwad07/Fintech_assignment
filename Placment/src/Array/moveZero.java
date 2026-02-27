package Array;

public class moveZero {
    public  void moveZ(int [] num){
        int left=0;
        for(int i=0;i<num.length;i++){
            if(num[i]!=0) {
                int t = num[left];
                num[left] = num[i];
                num[i] = t;
                left++;
            }
            }
        }
public static void main(String args[]){
        moveZero mo=new moveZero();
        int arr[]={0,0,0,0,0,0,1,0,2,0,3,0,23};
        mo.moveZ(arr);
for(int n:arr){
    System.out.print(n + " ");
}

    }



    }

