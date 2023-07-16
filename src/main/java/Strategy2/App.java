package Strategy2;

public class App {
    public static void main(String[] args) {
        CalcArea calcArea = new CalcArea();
        calcArea.setFiguresArea(new RectangleArea());
        double result1 = calcArea.executeCalcArea(4,2);

        calcArea.setFiguresArea(new TriangleArea());
        double result2 =calcArea.executeCalcArea(4,2);

        System.out.println(result1);
        System.out.println(result2);

    }

}
