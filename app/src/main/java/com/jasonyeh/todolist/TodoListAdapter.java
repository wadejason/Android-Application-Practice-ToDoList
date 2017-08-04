package com.jasonyeh.todolist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jasonyeh.todolist.models.Todo;

import java.util.List;

/**
 * Created by jasonyeh on 8/4/17.
 */

public class TodoListAdapter extends RecyclerView.Adapter{

    private List<Todo> data;

    public TodoListAdapter(@NonNull List<Todo> data) {
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_list_item, parent, false);
        return new TodoListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Todo todo = data.get(position);
        ((TodoListViewHolder) holder).todoText.setText(todo.text);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
