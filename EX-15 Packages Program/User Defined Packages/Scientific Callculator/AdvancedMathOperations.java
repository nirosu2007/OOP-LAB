package sci.calculator.advanced;

public class AdvancedMathOperations {
    public double factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial of negative number is not defined");
        if (n == 0 || n == 1) return 1;
        
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double num) {
        if (num < 0) throw new IllegalArgumentException("Square root of negative number is not real");
        return Math.sqrt(num);
    }

    public double logarithm(double num) {
        if (num <= 0) throw new IllegalArgumentException("Logarithm of non-positive number is not defined");
        return Math.log10(num);
    }

    public double sine(double angleDegrees) {
        return Math.sin(Math.toRadians(angleDegrees));
    }

    public double cosine(double angleDegrees) {
        return Math.cos(Math.toRadians(angleDegrees));
    }

    public double tangent(double angleDegrees) {
        return Math.tan(Math.toRadians(angleDegrees));
    }
}