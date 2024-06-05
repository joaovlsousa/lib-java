package lib.interfaces;

public interface CRUD<T> {
    public void create(T object);
    public T get(String title);
    public void list();
    public boolean delete(T object);
}
