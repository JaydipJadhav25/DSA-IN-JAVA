public class BasicArrays{
    public static void main(String[] args) {
        

        //declaration of an array
      // int marks[] = new int[30];   // C/C++ style
      // int[] marks1 = new int[30];   // Java style (preferred);

       //Consistency with multiple declarations
        // both marks and scores are int[] arrays
        // int[] marks2, scores;
        // marks2 = new int[3];
        // scores = new int[2];
        
        //defind this valuse
        int age[] = {20, 22, 21, 23}; //c style
       // int[] age2 = {20, 22, 21, 23};//java style

        // int[] age3 = new int[]{20, 22, 21, 23};



        ///accessing
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);


        //updating
        age[0] = 100;
        age[2] = age[2]+10;//update


        //delete
//  in Java, you can’t directly delete an array like in C++ (where you use delete[]).
// That’s because Java has Garbage Collection (GC) — memory is managed automatically.
// But you can make an array eligible for deletion by removing references to it.
        int[] arr = {1, 2, 3, 4};
        System.out.println("Before: " + arr.length);
        // "delete" by removing reference
        arr = null;
        // Now the array can be garbage collected
        System.out.println("After: " + arr); // prints null
        //      No manual delete in Java.
        // To “delete” an array:
        // Set its reference to null.
        // Or reassign it to a new array.
        // Garbage Collector will clean up memory when it decides.









    }
}