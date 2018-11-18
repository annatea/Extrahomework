
public class Task1 {
     int number1;
     int number2;
   public Task1(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public int multiplication(){
        return number1 * number2;
    }
    public int subtraction(){
        return number1 - number2;
    }
    public static int factorial(int number){
        if(number > 1){
            return number * factorial(number-1);
        }

        return 1;
    }
