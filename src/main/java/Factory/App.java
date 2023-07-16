package Factory;

public class App {
    public static void main(String[] args) {
        Furniture kitchenFurniture = Furniture.createFurniture(FurnitureType.KITCHEN);
        Furniture diningFurniture = Furniture.createFurniture(FurnitureType.DINING);
        kitchenFurniture.makeFurniture();
        diningFurniture.makeFurniture();
    }
}
