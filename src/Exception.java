 class Exception {
    public static void main(String[] args) {
    try {
        int result = divide(10, 0); // Potential exception
        System.out.println("Result: " + result);
    } catch (ArithmeticException e) { // Catching specific type of exception
        System.out.println("Cannot divide by zero");
    } finally { // Cleanup activities
        System.out.println("Finally block executed");
    }
}

     public static int divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero"); // Throwing an exception
        }
        return num1/num2;
}
}
