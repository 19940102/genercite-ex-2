import java.util.List;

public interface IMetier <T,U>{
    void add(T o);
    List <T> getALL();
    T getById(U id);
    void deleteByID(U id);



}
