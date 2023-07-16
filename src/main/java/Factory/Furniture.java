package Factory;

abstract class Furniture {
    abstract void makeFurniture();
    public static Furniture createFurniture(FurnitureType type){
        if (type == FurnitureType.KITCHEN){
            System.out.println("make Kitchen");
            return new Kitchen();
        }if (type == FurnitureType.DINING){
            System.out.println("make Dining");
            return  new Dining();
        }
        return null;
    }
}
