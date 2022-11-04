package com.amazon.utilities;

public class Assertions {


   public static void verifyEquals(String actual,String expected){

      if(actual.contains(expected)){
         System.out.println("GEÇTİ");
      }else{
         System.out.println("KALDI");
      }


   }
}
