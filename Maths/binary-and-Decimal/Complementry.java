public class Complementry{

    public static void main(String[] args) {
        System.out.println("Complementry Of Base 10");
        int n =  1; 
        int m = n;
        int mass = 0;
        if(m == 0){
          System.out.println(1);
        }
        if(n==1){
            System.out.println(0);
        }
        while (m != 0) {
            //
            mass = (mass<<1) |1;
            m = m>>1;
        }
        int ans = (~n) & mass;
        System.out.println("complementry is : "+ans);
    }
}