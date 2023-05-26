
// Создание интерфейса iCalculable 
public interface iCalculable {
    iCalculable sum(Calculator arg);
    iCalculable multi(Calculator arg);
    iCalculable division(Calculator arg);
    double getA();
    double getB();
}
