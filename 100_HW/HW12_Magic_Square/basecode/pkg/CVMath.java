package pkg;

public class CVMath {
public static void findSpecialSquares(int n) {
       int i = 1;
       while(n > 0){
           if(Math.pow(1+8*Math.pow(i,2),0.5)% 1==0){
               int root = (int)Math.pow(i,2);
               System.out.println(root);
               n--;
           }
           i++;
       }
    }
}