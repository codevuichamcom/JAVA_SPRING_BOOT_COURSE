package com.codevui.todoapp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {

    public static List<Todo> listTodos = new CopyOnWriteArrayList<>();

    public void add(Todo todo) {
        listTodos.add(todo);
    }

    public List<Todo> getAll() {
        return listTodos;
    }

    public void delete(int id) {
        for (Todo todo : listTodos) {
            if (todo.getId() == id) {
                listTodos.remove(todo);
                break;
            }
        }
    }

    public void toggleTodo(int id) {
        for (Todo todo : listTodos) {
            if (todo.getId() == id) {
                todo.setCompleted(!todo.isCompleted());
                break;
            }
        }
    }

}
