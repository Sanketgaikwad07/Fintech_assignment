package Array;

public class Monotonic_array {
    public boolean monoti(int []num)
    {
        boolean decresaing =true;
        boolean indreasing=true;
        for(int i=0;i<num.length-1;i++){
            if(num[i]<num[i+1]) decresaing=false;
            if(num[i]>num[i+1]) indreasing=false;
        }
        return indreasing||decresaing;

    }

    public static void main(String[] args) {
        Monotonic_array mo=new Monotonic_array();
        System.out.println(mo.monoti(new int[]{1,2,3,4,5}));
        System.out.println(mo.monoti(new int []{0,5,3,2,}));
        System.out.println(mo.monoti(new int[]{6,4,3,2,1}));

    }
}
