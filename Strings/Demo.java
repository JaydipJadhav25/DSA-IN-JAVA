import java.util.*;

public class Demo {
     
    public static float getShortedPath(String path){
        int x = 0;
        int y = 0;

        //now traverl on path and count x and y rep
        for(char c : path.toCharArray()){
           
            if(c == 'N'){
                y++;
            }else if(c == 'S'){
               y--;
            }else if (c == 'E'){
                   x++;
            }else if (c == 'W'){
                   x--;
            }else {
                System.out.println("Wrong Path!");
                break;
            }

        }

        //use fromula

        return (float) Math.sqrt((x*x) + (y*y) );
    }
     
    public static void main(String[] args) {

    

      

    }
}
