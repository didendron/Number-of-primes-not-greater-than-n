package com.mycompany;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long counter=0;
        System.out.println("Enter a natural number:");
        Scanner in=new Scanner(System.in);
        long number=in.nextLong();
        for(long i=number-1;i>=2;i--){
            if(isPrime(i))counter+=1;
        }
        System.out.println("Number of primes not greater than "+number+" is: "+counter);


    }
    public static boolean isPrime(long number){
        if (number==2) return true;
        if (number==3) return true;
        if ((number%2)==0){
            return false;
        }
        else {
            long lessFactor=3;
            boolean condition=true;
            int counter=-1;
            while(condition){
                long greaterFactor=number/lessFactor;
                while ((greaterFactor%2==0)||((greaterFactor%3==0)&&(lessFactor>3))
                        ||((greaterFactor%5==0)&&(lessFactor>5))||((greaterFactor%7==0)&&(lessFactor>7))
                ){  counter++;
                    if(lessFactor==5)counter=0;
                    if(counter==0){
                        lessFactor+=2;
                        greaterFactor=number/lessFactor;
                    }
                    else{
                        lessFactor+=4;
                        greaterFactor=number/lessFactor;
                        counter=-1;
                    }

                }


                if (greaterFactor*lessFactor==number){
                    return false;
                }
                counter++;
                if(lessFactor==5)counter=0;
                if(counter==0){
                    lessFactor+=2;
                }
                else{
                    lessFactor+=4;
                    counter=-1;
                }


                while((lessFactor%3==0)||((lessFactor!=5)&&(lessFactor%5==0))||((lessFactor!=7)&&(lessFactor%7==0))
                        ||((lessFactor!=11)&&(lessFactor%11==0))||((lessFactor!=13)&&(lessFactor%13==0))
                        ||((lessFactor!=17)&&(lessFactor%17==0))||((lessFactor!=19)&&(lessFactor%19==0))
                        ||((lessFactor!=23)&&(lessFactor%23==0))

                ){
                    counter++;
                    if(lessFactor==5)counter=0;
                    if(counter==0){
                        lessFactor+=2;
                    }
                    else{
                        lessFactor+=4;
                        counter=-1;
                    }


                }




                if (greaterFactor<lessFactor) condition=false;
            }
            return true;
        }
    }

}
