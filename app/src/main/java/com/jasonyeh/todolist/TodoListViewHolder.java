package com.jasonyeh.todolist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jasonyeh on 8/4/17.
 */

public class TodoListViewHolder extends RecyclerView.ViewHolder {


    TextView todoText;

    public TodoListViewHolder(@NonNull View itemView) {
        super(itemView);

        todoText = (TextView) itemView.findViewById(R.id.main_list_item_text);
    }
}
