package Strategy2;

public class CalcArea {
    FiguresArea figuresArea;

    public void setFiguresArea(FiguresArea figuresArea) {
        this.figuresArea = figuresArea;
    }
    public double executeCalcArea(double a, double b){

        return figuresArea.executeArea(a,b);
    }
}
