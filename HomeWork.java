package com.company;

public class Main {
     //Tirgul:
    //1. create a function that get 3 different grades(float), and checks what is the higher grade and return it from function.
    //2. create function that get an array of int[] and return the average of array's values. {5, 10, 15}
    //3. create a function that gets 2 arrays and return the name of the array with the larger size. (return String)

        public static void main(String[] args) {

            //3:
            greet();

            //4:
            //int number = 9;
            //printNum(number);

            //5:
           /* for(int i = 1; i <= 10; i++){
               printNum(i);
            }*/

            //6:
            //int k = 5;
            //changeNumber(k);
            //System.out.println(k);

            //7:
            /*multiply(5,7);
            int x = 3;
            int y= 6;
            multiply(x, y);
            multiply(4,5);*/

            //8:
            /*calc(8,9, '+');
            calc(5,2, '-');
            calc(5,2, '/');*/

            //9:
            int array[] = {1,2,3};
            int num = 4;
            checkNumInArray(array, num);
            int array2[] = {7,66,9};
            int num2 = 7;
            checkNumInArray(array2, num2);
               float hG = checkHigherGrade(8.9f, 7.3f, 4.5f);
               System.out.println(hG);
        }

        public static void checkNumInArray(int array [], int num ){
            boolean isExist = false;
            for(int i = 0; i < array.length; i++){
                if(array[i] == num){
                    isExist = true;
                }
            }
            System.out.println("is num inside array? - " + isExist);
        }

        public static void calc(int x, int y, char c){
            if(c == '+'){
                System.out.println(x + y);
            }
            else if (c == '-'){
                System.out.println(x - y);
            }
            else{
                System.out.println("Wrong character");
            }
        }

        public static void multiply(int a, int b){
            System.out.println(a * b);
        }

        public static void changeNumber(int[] array, int k){
            //k++;
            k = k + 1;
        }

        public static void printNum(int number){
            System.out.println(number);
        }

        public static void greet(){
            System.out.println("good morning");
        }
     
      public static float checkHigherGrade(float grade1, float grade2, float grade3){  // 50 ,40 , 40
        return  Math.max(Math.max(grade1, grade2),grade3);
   
      }

    }
