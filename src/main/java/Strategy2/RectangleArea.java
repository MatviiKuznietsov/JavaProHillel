package Strategy2;

public class RectangleArea implements FiguresArea{
    @Override
    public double executeArea(double a ,double b) {
        System.out.println("RectangleArea = " + a*b);
        return a*b;
    }
}
