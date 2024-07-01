public class Bicycle extends WheeledTransport implements Transport{

    public Bicycle(String modelName,int wheelsCount){
        super(modelName,wheelsCount);
    }

    @Override
    public void updateType() {

    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда ");
    }


    @Override
    public void service() {
        updateType();

    }
}