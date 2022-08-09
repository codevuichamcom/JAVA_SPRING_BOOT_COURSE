package com.codevui.todoapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    public static int increase = 0;

    @Autowired
    TodoRepository todoRepository;

    public void addTodo(String title) {
        Todo todo = Todo.builder().id(++increase).title(title).completed(false).build();
        todoRepository.add(todo);
    }

    public List<Todo> getAllTodo() {
        return todoRepository.getAll();
    }

    public void deleteTodo(int id) {
        todoRepository.delete(id);
    }

    public void toggleTodo(int id) {
        todoRepository.toggleTodo(id);
    }

}
