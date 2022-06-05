//Literals:
/*
 * Integer Literals - Java Compiler stores it as 32 bit value. 
 * Example: int a, int b, int c;
 
 * Floating Point Literals - Java Compiler stores it as 64 bit value.
 * Example: float a, float b, float c;
  
 * Character Literals - Java Compiler stores it as 16 bit value.
 * Example: char a, char b, char c;
 * 
 * String Literals - Java Compiler stores it as 16 bit value.
 * Example: String a, String b, String c;
  
 * Boolean Literals - Java Compiler stores it as 1 bit value. They are true or false.
 * Example: boolean a, boolean b, boolean c;
 */

 //Keywords:
/*
 * Keywords are used to define the meaning of a word.
 * There are 48 Keywords in Java. They are:
  
 * abstract, assert, boolean, break, byte, case, catch, char, 
 * class, const, continue, default, do, double, else, enum, 
 * extends, final, finally, float, for, goto, if, implements, 
 * import, instanceof, int, interface, long, native, new, package, 
 * private, protected, public, return, short, static, strictfp, super, 
 * switch, synchronized, this, throw, throws, transient, try, void, volatile, while
  
 * Keywords are case sensitive.
 */

 //Arrays:
 /*
  * Arrays are used to store multiple values in a single variable.
  * One dimensional array - Array of same type. Example: int[] a; //a is an array of integers.
  * Two dimensional array - Array of arrays of same type. Example: int[][] a; //a is an array of arrays of integers.
  * Multi dimensional array - Array of arrays of arrays of same type. Example: int[][][] a; //a is an array of arrays of arrays of integers.
  */

  //Operators:
  /*
   * Operators are used to perform operations on variables. 
   * There are 56 operators in Java.
   * Example: int a = 10; int b = 20; int c = a + b; //c = 30;
   
   * Arithmetic Operators:
   * +, -, *, /, %, ++, --, +=, -=, *=, /=, %=, ==, !=, >, <, >=, <=, &&, ||, !, &, |, ^, <<, >>, >>>
   * 
   * Bitwise Operators:
   * &, |, ^, ~, <<, >>, >>>
   * 
   * Assignment Operators:
   * =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=
   * 
   * Comparison Operators:
   * ==, !=, >, <, >=, <=
   * 
   * Logical Operators:
   * &&, ||, !
   * 
   * Relational Operators:
   * ==, !=, >, <, >=, <=
   */

//If Statements:
/*
 * If statements are used to execute code if a condition is true.
 * Example: if(a == b) { 
   //code to be executed }
   //else { 
   //code to be executed }
*/

//Switch Statements:
/*
 * Switch statements are used to execute code based on a condition.
 * Example: switch(a) { 
   case 1: //code to be executed; 
   break; 
   case 2: //code to be executed; 
   break; 
   default: //code to be executed; 
   break; 
  }
*/

    //Loops:
    /*
    * Loops are used to execute code multiple times.
    * There are three types of loops in Java.
    * For Loop - Executes a block of code a specified number of times.
    * While Loop - Executes a block of code while a condition is true.
    * Do While Loop - Executes a block of code at least once, and then checks the condition.
    */
    
    //For Loop:
    /*
    * For Loop - Executes a block of code a specified number of times.
    * Example: for(int i = 0; i < 10; i++) { 
    //code to be executed 
    }
    */
    
    //While Loop:
    /*
    * While Loop - Executes a block of code while a condition is true.
    * Example: while(a < 10) { 
    //code to be executed 
    }
    */
    
    //Do While Loop:
    /*
    * Do While Loop - Executes a block of code at least once, and then checks the condition.
    * Example: do { 
    //code to be executed 
    } while(a < 10);
    */
    
    //Break Statement:
    /*
    * Break statement is used to terminate the execution of a loop.
    * Example: for(int i = 0; i < 10; i++) { 
    //code to be executed 
    if(i == 5) { 
        break; 
    } 
    }
    */
    
    //Continue Statement:
    /*
    * Continue statement is used to skip the rest of the code in a loop and continue with the next iteration.
    * Example: for(int i = 0; i < 10; i++) { 
    //code to be executed 
    if(i == 5) { 
        continue; 
    } 
    }
    */
    
    //Return Statement:
    /*
    * Return statement is used to return a value from a function.
    * Example: int add(int a, int b) { 
    return a + b; 
    }
    */
    
    //Function:
    /*
    * Functions are used to perform a specific task.
    * Example: int add(int a, int b) { 
    return a + b; 
    }
    */

//Classes:
/*
 * Classes are used to group variables and functions together.
 * Example:
class volume {
    int length;
    int breadth;
    int height;
}
class solution {
    public static void main (String args[]){
        volume vol = new volume();
        int volume = vol.length * vol.breadth * vol.height;
        vol.length = 10;
        vol.breadth = 10;
        vol.height = 10;
        System.out.println("Volume: " + volume);
    }
}
*/

//Methods:
/*
 * Methods are used to perform a specific task.
 * Example:
 * class volume {
    int length;
    int breadth;
    int height;
    int volume() {
        return length * breadth * height;
    }
}
class solution {
    public static void main (String args[]){
        volume vol = new volume();
        int volume = vol.volume();
        vol.length = 10;
        vol.breadth = 10;
        vol.height = 10;
        System.out.println("Volume: " + volume);
    }
}
*/

//Constructors:
/*
 * Constructors are used to initialize the values of variables.
 * Example:
 * class volume {
    int length;
    int breadth;
    int height;
    volume() {
        length = 10;
        breadth = 10;
        height = 10;
    }
}
class solution {
    public static void main (String args[]){
        volume vol = new volume();
        int volume = vol.volume();
        System.out.println("Volume: " + volume);
    }
}
*/

//Access Specifiers:
/*
 * Access Specifiers are used to restrict the access to variables and functions.
 * The access specifiers are: public, private, protected.
*/
    //Examples:
    /*
    Public:
     * Public - Access specifier for variables and functions.
     * Public variables and functions can be accessed by any code.
     * Example:
     * class volume {
        int length;
        int breadth;
        int height;
        public int volume() {
            return length * breadth * height;
        }
    }
    class solution {
        public static void main (String args[]){
            volume vol = new volume();
            int volume = vol.volume();
            System.out.println("Volume: " + volume);
        }
    }
    

    Private:
     * Private - Access specifier for variables and functions.
     * Private variables and functions can only be accessed by the class.
     * Example:
     * class volume {
        int length;
        int breadth;
        int height;
        private int volume() {
            return length * breadth * height;
        }
    }
    class solution {
        public static void main (String args[]){
            volume vol = new volume();
            int volume = vol.volume();
            System.out.println("Volume: " + volume);
        }
    }

    //Protected:
     * Protected - Access specifier for variables and functions.
     * Protected variables and functions can be accessed by the class and any class that inherits from the class.
     * Example:
     * class volume {
        int length;
        int breadth;
        int height;
        protected int volume() {
            return length * breadth * height;
        }
    }
    class solution {
        public static void main (String args[]){
            volume vol = new volume();
            int volume = vol.volume();
            System.out.println("Volume: " + volume);
        }
    }
    */

//Inheritance:
/*
 * Inheritance is used to create a new class based on an existing class.
 * Example:
 * class volume {
    int length;
    int breadth;
    int height;
    int volume() {
        return length * breadth * height;
    }
}
class solution {
    public static void main (String args[]){
        volume vol = new volume();
        int volume = vol.volume();
        System.out.println("Volume: " + volume);
    }
}
class volume2 extends volume {
    int volume() {
        return length * breadth * height;
    }
}
class solution2 {
    public static void main (String args[]){
        volume2 vol = new volume2();
        int volume = vol.volume();
        System.out.println("Volume: " + volume);
    }
}

There are different types of inheritance:
 * Single Inheritance:
 * Example:
 * class volume {
    int length;
    int breadth;
    int height;
    int volume() {
        return length * breadth * height;
    }
}
class solution {
    public static void main (String args[]){
        volume vol = new volume();
        int volume = vol.volume();
        System.out.println("Volume: " + volume);
    }
}
class volume2 extends volume {
    int volume() {
        return length * breadth * height;
    }
}
class solution2 {
    public static void main (String args[]){
        volume2 vol = new volume2();
        int volume = vol.volume();
        System.out.println("Volume: " + volume);
    }
}

 * super:
 * super - is used to access the variables and functions of the parent class.
 * Example:
 * class A {
 * int i;
 * int j;
 * A(int a, int b){
 * i = a;
 * j = b;
 * }
 * }
 * }
 * class B extends A {
 * int k;
 * B(int p, int q, int r){
 * super(p, q);
 * k = r;
 * }
 * }
 
 //Meathod Overriding:
    * Method Overriding is used to override the methods of the parent class.
*/

//Exception Handling:
/*
 * Exception Handling is used to handle the exceptions.
 * It is managed by 5 keywords: try, catch, throw, finally, and throws.
 */

