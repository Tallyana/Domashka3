public abstract class WheeledTransport implements Transport{
//реализован абстрактный класс,завязанный(имплементир) на Интерфейс Транспорт
   private final String modelName;
    private final int wheelsCount;
    //созданы приватные неизменяемые поля

    protected WheeledTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    } //конструктор наследования
      //геттеры
    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
     //абстрактный метод в абстрактном классе.
    public abstract  void updateType();
}
