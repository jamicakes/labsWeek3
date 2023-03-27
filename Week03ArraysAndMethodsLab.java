package week3LabFollow;

public class Week03ArraysAndMethodsLab {

 public static void main(String[] args) {
         
     //
     // Arrays:
     //
     
     // 1. Create an array with the following values 1, 5, 2, 8, 13, 6

   int[] values = {1, 5, 2, 8, 13, 6, -3};
   
     
     // 2. Print out the first element in the array
 
   System.out.println(values[0]);
     
     // 3. Print out the last element in the array without using the number 5
     System.out.println(values[values.length -1]);
     
     // 4. Print out the element in the array at position 6, what happens?

    //  System.out.println(values[6]); // out of bounds error
     
     // 5. Print out the element in the array at position -1, what happens?
   //  System.out.println(values[-1]); // out of bounds
         
     // 6. Write a traditional for loop that prints out each element 
     //in the array
     
     for (int i = 0; i < values.length; i++) {
     
 System.out.println(values[i]);
     }
         
     // 7. Write an enhanced for loop that prints out each element in the array

  for (int number : values) {
    System.out.println(number);
  }
     
     // 8. Create a new variable called sum, write a loop that adds 
     //          each element in the array to the sum

  
  double sum = 0;
  for (double number : values) {
    sum += number ;
       
  }
      
  System.out.println(sum);
         
  // 9. Create a new variable called average and assign the average value of 
  // the array to it

  double average = sum % values.length;
  System.out.println(average);

  // 10. Write an enhanced for loop that prints out each number in the array
  // only if the number is odd

     for (int oddNumbers : values) {
        if (oddNumbers % 2!= 0) {
          System.out.println(oddNumbers);
        }
    }
       
  
     // 11. Create an array that contains the
  //   values "Sam", "Sally", "Thomas", and "Robert"

     String[] firstNames = {"Sam", "Sally", "Thomas", "Robert"};
     
     // 12. Calculate the sum of all the letters in the new array

     int sumOfLetters = 0;
         for (String name : firstNames) {
                   
           sumOfLetters += firstNames.length; 
         } System.out.println(sumOfLetters);

     //
     // Methods:
     //
     
     // 13. Write and test a method that takes a String name and prints out a greeting. 
     //          This method returns nothing.
     
        greet("Vikk");
     
     // 14. Write and test a method that takes a String name and  
     //          returns a greeting.  Do not print in the method.
String greeting = greetEasier("Jami") ;
System.out.println(greeting);
     // Compare method 13 and method 14:  
     //      a. Analyze the difference between these two methods.
     //      b. What do you find? 
     //      c. How are they different?
     

     
     // 15. Write and test a method that takes a String and an int and 
     //          returns true if the number of letters in the string is greater than the int
     
System.out.println(isStringLongerThanNumber("Freddie", 3));

     
     // 16. Write and test a method that takes an array of string and a string and 
     //          returns true if the string passed in exists in the array
     
String[] momsAreCool = {"Strong", "Knowledge", "Confidence", "Glow", "Courage"};
System.out.println(exist(momsAreCool, "Weak")); 
        
   
     // 17. Write and test a method that takes an array of int and 
     //          returns the smallest number in the array
 

System.out.println(lowestInt(values));


     
     // 18. Write and test a method that takes an array of double and 
     //          returns the average
     double[] doubles = {34.5, 39.2, 67.2};
     System.out.println(testDouble(doubles));

     // 19. Write and test a method that takes an array of Strings and 
     //          returns an array of int where each element
     //          matches the length of the string at that position
    
    int[] nameLengths = extractStringLengths(momsAreCool);
    for (int number : nameLengths) {
      System.out.println(number);
    }
             
     // 20. Write and test a method that takes an array of strings and 
     //          returns true if the sum of letters for all strings with an even amount of letters
     //          is greater than the sum of those with an odd amount of letters.

    
    System.out.println(evenOrOdd(momsAreCool));
 
     // 21. Write and test a method that takes a string and 
     //          returns true if the string is a palindrome
    
    System.out.println(isPalindrome("racecar"));
     
     
 }  //Looks like class end 
 

 
 // Method 13:

 public static void greet (String name ) {
   System.out.println("Greetings, " + name + "!");
 }
 // Method 14:
public static String greetEasier (String name) {
  return "Hello, " + name + "!";
}
 
 // Method 15:
public static boolean isStringLongerThanNumber (String wordLength, int number) {
 
  return (wordLength.length () > number);
}
 // return true;  
//  }
//  return false;
//}
 
 
 // Method 16:
public static boolean exist(String[] momsAreCool, String string) {
  for (String str : momsAreCool) {
    if (str.equals(string)) {
      return true; 
      
      
    }
  } return false;
}


 

 
 // Method 17:

public static int lowestInt(int[] values) {
  int smallest = values[0];
  for (int number : values)  {
    if (number < smallest) {
      smallest = number;
    }
  }
  return smallest;
}

 
 // Method 18:

public static double testDouble(double[] array) {
  double sum = 0;
     
  for (double number : array) {
    sum += number;
       
  }
  return sum / array.length;
  
}

 
 // Method 19:
public static int[] extractStringLengths(String[] strings) {
  int[] results = new int[strings.length];
  for (int i = 0; i < strings.length; i++) {
    results[i] = strings[i].length();
  }
  return results;
}
 // Method 20:
 public static boolean evenOrOdd(String[] even) {
   int evenLetters = 0;
   int oddLetters = 0;
   
       for (String string : even) {
         if (string.length() % 2 == 0) {
           evenLetters += string.length();
         }  else {
             oddLetters += string.length();
           }
           
         }
         return evenLetters > oddLetters;
       }
   
         
         
//         for (int i = 0; i < even.length; i++) {
//     if (even.length % 2 == 0 > even.length % 2 = 1) {
//       System.out.println(true);
//     }
//     
//   }
  
 
 
 // Method 21:
 
public static boolean isPalindrome (String racecar) {
  for (int i = 0; i < racecar.length() /2; i++) {
    if  (racecar.charAt(i) != racecar.charAt(racecar.length() - i - 1)) {
      return false;
    }
  }
  return true;

}
}

