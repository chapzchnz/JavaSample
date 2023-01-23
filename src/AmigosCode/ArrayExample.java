package AmigosCode;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        /**
        int [] numbers = {0 ,1,2,3,4 } ;
        String [] names = {"utu", "Titi","Mixi"};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
         **/
     // array  and indexes
       /** int [] numbers = {0, 1, 4, 5 , 100};
                int hundred = numbers[4];
                int four = numbers[2];
        System.out.println(hundred);
        System.out.println(four);
        **/
    // increment and decrement
      /**  int [] numbers = {0,1,2,3,4,5};
        int number = 5;
        number--;
        System.out.println(number);
       **/
      // enhanced for loop
        /**int [] numbers = {1,0,4, 7, 88, 99};
                for( int number: numbers){
                    System.out.println(number);
                } **/
       /** int [] numbers = {1,0,4,7,88,99};
        for (int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }    **/

       /**String []names = {"Cherry","Cerry","Serry","Derry","Kirry"};
               for(String name: names){
                   if (name.equals("Serry")){
                      continue;

                   }
                   System.out.println(name);
               }   **/
       //While loop
       /** int count = 0;
        while (count<=10){
            System.out.println(count);
            count++;
        }**/
       //Do while loop
        int count = 21;
        do {
            System.out.println(count);
            count++;
        }
         while (count<=20);

            while (true){

            }



    }

}
