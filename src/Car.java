public class Car extends  MotorTransport implements Transport{
    public Car(String modelName,int wheelsCount) {
        super(modelName,wheelsCount);
    }
    //Класс Кар наследуется от Абстрактного Мотортранспорт и  завязан на интерфейс Транспорт и онструктор от суперкласса

    //Методы от суперклассов.
    @Override
    public void updateType() {
        for(int i=1;i <= getWheelsCount();i++){
            System.out.println("Меняем " + i + " покрышку у " +getModelName());
        }
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у " + getModelName());
    }
    @Override
    public void service(){
        updateType();
        checkEngine();
    }
}
