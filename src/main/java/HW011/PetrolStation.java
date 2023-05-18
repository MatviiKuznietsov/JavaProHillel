package HW011;

public class PetrolStation {
    public double getStartAmount() {
        return startAmount;
    }

    public void setStartAmount(double startAmount) {
        this.startAmount = startAmount;
    }

    private double startAmount;
    private double endAmount;
    private int quantityRequest;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count = 0;

    public int getQuantityRequest() {
        return quantityRequest;
    }

    public void setQuantityRequest(int quantityRequest) {
        this.quantityRequest = quantityRequest;
    }

    public double getEndAmount() {
        return endAmount;
    }

    public void setEndAmount(double endAmount) {
        this.endAmount = endAmount;
    }


    public double getStartAmountAmount() {
        return startAmount;
    }

    public void setAmount(double amount) {
        this.startAmount = amount;
    }

    public double doRefuel(double amountBye) throws InterruptedException {

        for (int i = 0; i < amountBye; i++) {
            Thread.sleep(30);
            System.out.print("|");
        }
        setEndAmount(getStartAmountAmount() - amountBye);
        return getEndAmount();
    }


}
