package com.codevui.todoapp;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Todo {
    private int id;
    private String title;
    private boolean completed;
}
