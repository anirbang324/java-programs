public class fact1 {
    public static void main(String[] args) {
        System.out.println("factorial of number is "+factorial_function(5));
    }

    public static int factorial_function(int n){
        if(n<=1)  // if the number is 1 or less than 1 then it should return 1
        {        
            return 1;
        }
        else{  //we need to multiply the numbers by going 1 step backward
            return (n*factorial_function(n-1));
        }
    }
}


//steps :

//
//factorial_function(5) = 5*factorial_function(4) = 5*24
//factorial_function(4) = 4*factorial_function(3) = 4*6
//factorial_function(3) = 3*factorial_function(2) = 3*2
//factorial_function(2) = 2*factorial_function(1) = 2*1
//factorial_function(1) = 1*factorial_function(0) = 1*1

//recursion works in reverse order so, 
// 1*1 = 1
// 2*1 = 2
// 3*2 = 6
// 4*6 = 24
// 5*24 = 120