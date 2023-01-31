package LoopDemo;

public class LoopDemo {
    public static void main(String[] args) {
        //int i = 0;
        // for (int i = 0; i<=10; i++)
        //System.out.println(i);

        //while (i < 10)/
        //do while loop
        //do{
        //System.out.println(i++);
        //}
        //while(i<10);

        // Array example for for-loop
        //int [] marks ={10, 20, 30, 40};
        //for(int num: marks){
        //System.out.println(num);
        //int x=10;
        //while(x<20){
        //System.out.println("Value of x is " + x++);


        //int x = 10;
        //do {
            //System.out.println("Value of x is " + x++);
       // }
        //while (x < 20);
        int[] num={0,15,35,20,22,36,32,41,62,70,36,63,45,78};
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                System.out.println("This is Even Number "+ num[i]);
            }
        else
            System.out.println("This is Odd Number "+ num[i]);
        }
    }
}
