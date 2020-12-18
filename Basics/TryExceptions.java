public class TryExceptions {

    public static void main (String [] args){

        try{
            int answer = divideNumbers(16, 2);
            System.out.println("Answer is: " + answer);
        }
        catch (Exception e){
            System.out.println("Tried computing twice but still it won't work.");
        }
    }

    public static int divideNumbers(int a, int b) throws Exception{
        int c;

        try {
            c = a / b;
            System.out.println("It worked! The answer is: " + c);
        }
        catch (Exception e) {
            System.out.println("There seem to be a problem...");
            c = a / b;
            System.out.println("Oh it works after all.");
        }
        finally {
            System.out.println("Better clean up your mess.");
        }
        System.out.println("In the end it does work, nice.");

        return c;
    }
    
}

/*If you try to pass in 5 and 0 as parameters the following will get printed: 
There seem to be a problem...
Better clean up your mess.
Tried computing twice but still it won't work.

But if you try to pass in values that can be divided the following get printed:
It worked the answer is : __ 
Better clean up your mess.
In the end it does work, nice.
Answer is: __*/
