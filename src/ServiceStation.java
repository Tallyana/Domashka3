public class ServiceStation {


    //создан метод с массивом
    public void check(Transport... transports) {
        for ( Transport t : transports) {
           t.service();
        }
    }

}
