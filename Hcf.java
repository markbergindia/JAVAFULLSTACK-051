import java.util.*;
public class Hcf {
    public static void main(String[] args) {
        int n1=12; int n2=18;
        int min=0;
        int hcf=1;
        if(n1<n2){
            min=n1;
        }else{
            n2=min;
        }
        for(int i=min;i>=1;i--){
            if(n1%i==0 && n2%i==0){
                hcf=i;
                break;
            }
        }
        System.out.println("hcf is : " + hcf);
        int lcm = n1*n2/hcf;
        System.out.println(lcm);
    }
}
