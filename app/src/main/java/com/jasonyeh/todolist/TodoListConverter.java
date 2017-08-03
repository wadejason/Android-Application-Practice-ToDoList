package com.jasonyeh.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.jasonyeh.todolist.models.Todo;

import java.util.List;

/**
 * Created by jasonyeh on 8/3/17.
 */

public class TodoListConverter {

    private Context context;
    private List<Todo> data;

    public TodoListConverter(@NonNull Context context, List<Todo> data) {
        this.context = context;
        this.data = data;
    }

    public View getView(int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.main_list_item, null);
        Todo todo = data.get(position);

        ((TextView) view.findViewById(R.id.main_list_item_text)).setText(todo.text);
        return view;
    }
}