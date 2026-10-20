public class cmodel {

    public double addi(double a, double b)
    {
        return a + b;
    }

    public double sub(double a, double b)
    {
        return a - b;
    }

    public double div(double a, double b)
    {
        if (b == 0)
            return 0;

        return a / b;
    }

    public double multi(double a, double b) {
        return a * b;
    }
}
