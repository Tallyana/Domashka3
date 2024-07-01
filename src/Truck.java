public class Truck extends MotorTransport implements Transport{
   //наследуем от абстрактного класса и завязаны на интерфейс Транспорт
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    //методы от суперкласса-оверрид
     @Override
    public void checkEngine() {
        System.out.println("Снимаем покрышку,проверяем двигатель");
    }

    @Override
    public void updateType() {
        System.out.println("Меняем покрышку у грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service(){
        updateType();
        checkEngine();
        checkTrailer();
    }
}


