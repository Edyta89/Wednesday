public class FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100
// but for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

        //public static void fizzBuzz() {
            // write your code here for Gradescope tes
          for (int i=0; i <100; i++){
             if (i%3==0 && i%5==0){
                 System.out.println( "FizzBuzz");
             }
             else if (i%5==0){
                 System.out.println("Buzz");
             }
             else if(i%3==0){
                 System.out.println("Fizz");
          }  else{
                 System.out.println(i);
             }



        }
    }}

