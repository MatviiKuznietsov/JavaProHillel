package Strategy2;

public class TriangleArea implements FiguresArea{
    @Override
    public double executeArea(double a ,double b) {
        System.out.println("TriangleArea = " + a*b/2);
        return a*b/2;
    }
}
