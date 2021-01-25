public class SimpleCalculator {
    double firstNumber;
    double secondNumber;
    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }
    public double setFirstNumber(double firstNumber){
        return this.firstNumber = firstNumber;
    }
    public double setSecondNumber(double secondNumber){
        return this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        return (this.firstNumber+this.secondNumber);
    }
    public double getMultiplicationResult(){
        return(this.firstNumber*this.secondNumber);
    }
    public double getSubtractionResult(){
        return(this.firstNumber- this.secondNumber);
    }
    public double getDivisionResult(){
        if (this.secondNumber==0){
            return 0;
        }
        else{
        return(this.firstNumber/this.secondNumber);
         }
    }
    
}
