public class Calculate {
    public static float calcutate(float firstNumber , float secondNumber , char operator){
        switch (operator){
            case '+':
                return firstNumber + secondNumber ;
            case '-':
                return firstNumber - secondNumber ;
            case '*':
                return firstNumber * secondNumber ;
            case '/':
                if(secondNumber != 0){
                    return  firstNumber / secondNumber;
                }else
                    throw new RuntimeException("Can't devide by zero");
            default:
                    throw new RuntimeException("Invalid operation");
        }
    }
}
