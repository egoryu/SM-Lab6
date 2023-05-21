public class EulerMethod {
    public static double eulerMethod(double x0, double y0, double h, double xn, int n) {
        double y = y0;
        while (x0 < xn) {
            y += h * Function.getFunction(x0, y, n);
            x0 += h;
        }

        return y;
    }
}
