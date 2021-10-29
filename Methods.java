import java.util.Scanner;
public class Methods
 {
   public static void main(String[] args){

    // declare method
    wellcome();
    

    
    
     int number1,number2,total=0; //product=0, division=0 ,substraction=0;
     int option;
     Scanner KB = new Scanner(System.in);
    
    do {
    Menu();
    option=KB.nextInt();
    switch(option){

        case 1:
    number1 = inputMethod();
    number2 = inputMethod();
    total = sumMethod(number1,number2);
    outputMethod(number1, number2,total,"the sum of two numbers"); 
       break;
        case 2 :
    number1 = inputMethod();
    number2 = inputMethod();
    total = multMethod(number1,number2);
    outputMethod(number1, number2,total,"the product of two numbers");
    
    break;
       case 3:
    number1 = inputMethod();
    number2 = inputMethod();
    total= divMethod(number1,number2);
    outputMethod(number1, number2,total,"the division of two numbers");
    
       
       break;
       case 4:

    number1 = inputMethod();
    number2 = inputMethod();
    total = subsMethod(number1,number2);
    outputMethod(number1, number2, total,"the substraction of two numbers");
       break;
      }
      } while (option != 4);
   }// public static void main
   

   public static void  wellcome() 
   { 
      System.out.println("wellcome to Java Programming");
   }
   public static void Menu(){
   //System.out.println("The first number is " + N1);
   //System.out.println("The second number is " + N2);
    System.out.println("********* Chose from the menu *******");
      System.out.println("1) the sum of two numbers : ");
      System.out.println("2) the product of two numbers");
      System.out.println("3) the division of two numbers : ");
      System.out.println("4) the substraction of two numbers : ");
   }

   public static int inputMethod()
   {
     // prompt the user the inter 2 intger numbers.
   Scanner KB = new Scanner(System.in);
      int num;
      System.out.println("please, enter a number : ");
      num = KB.nextInt();
      return num;
   }
   // displays outputs
   //public static void outputMethod(int N1, int N2,) int sum,int prod, int div ,int subs)

  public static void outputMethod(int Num_one, int Num_two, double Answer,String operation) {
System.out.println("First number = " + Num_one);
System.out.println("Second number = " + Num_two);
System.out.println("The "+operation+" of both numbers is = " + Answer);
System.out.println("");
}
 // System.out.println("The first number is " + N1);
 // System.out.println("The second number is " + N2);
  //System.out.println("The sum of two numbers is " + sum);
  //System.out.println("The product of two numbers is " + prod);
  //System.out.println("The division of two numbers is " + div);
  //System.out.println("The substraction of two numbers is " + subs);

  //}
 
   
     

 
  
   public static int sumMethod(int NN1, int NN2)
   { 
    return (NN1 + NN2);
   }
  
   public static int multMethod(int NNN1, int NNN2)
   { 
    return (NNN1 * NNN2);
   }
   
public static int divMethod(int D1, int D2)
   { 
    return (D1 / D2);
   }
  
   public static int subsMethod(int S1, int S2)
   { 
    return (S1 - S2);
   }
   }// end of main class
   
      
    
 