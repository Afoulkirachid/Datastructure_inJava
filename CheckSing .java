      /*
      my name : Rachid Afoulki
      prof: Faissal Aljamal 
      CSC-117-01 Java Programming
      Due Date : 2/18/2021
      *This program reads an integer from the user and determines whether 
      it is positive, negatie, or it's a Zero.
      */ 
      
      // declare Scanner Labrary 
      import java.util.Scanner;
      
      // declaring the main class 
      class PositiveNegativeZero {
      
       public static void main(String[] args) {
       
      //declaring variables
       
        double num ;
        char choice;
        
      //instantiation of the Scanner
        do{  
        Scanner KB = new Scanner(System.in);
       
            
        System.out.println("Please, Enter a Number : ");
          num = KB.nextInt();  
            
       //Input Validation 
             
           if (num == 0)
              System.out.println("the Number is zero");   
                   
           else if( num < 0)
              System.out.println("the Number is negative");
                   
           else if ( num > 1)
              System.out.println("the Number is positive");
              
              
            System.out.println("---------------------------------");  
              
            System.out.println("Press (y/Y) if you want to continue");
            choice = KB.next().charAt(0); 
              
             }while (choice == 'Y' || choice == 'y');
          
      
          } 
       }