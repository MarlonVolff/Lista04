package br.edu.up.Controllers;

public abstract class Controller<T> {
    public abstract void add(T entity);
    public abstract void update(T entity);
    public abstract void delete(T entity);
    public abstract T get(int id);
}