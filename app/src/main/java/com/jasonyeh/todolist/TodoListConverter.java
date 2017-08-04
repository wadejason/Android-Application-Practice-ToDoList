package com.jasonyeh.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jasonyeh.todolist.models.Todo;

import java.util.List;

/**
 * Created by jasonyeh on 8/3/17.
 */

public class TodoListConverter extends BaseAdapter{

    private Context context;
    private List<Todo> data;

    public TodoListConverter(@NonNull Context context, @NonNull List<Todo> data) {
        this.context = context;
        this.data = data;
    }

    // list裡面有多少數據
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    // 數據轉介面
    // convertView: 介面回收
    // getView -> UI thread
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        ViewHolder vh;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.main_list_item, parent, false);

            vh = new ViewHolder();
            // we only find once
            vh.todoText = (TextView) convertView.findViewById(R.id.main_list_item_text);
            // cache the view holder
            convertView.setTag(vh);
        } else {
            // convertView is not null, which means it contains a cached view holder
            vh = (ViewHolder) convertView.getTag();
        }

        Todo todo = data.get(position);
        vh.todoText.setText(todo.text);
        return convertView;

//        // findViewById is time consuming
//        ((TextView) convertView.findViewById(R.id.main_list_item_text)).setText(todo.text);
//        return convertView;

//        View view = LayoutInflater.from(context).inflate(R.layout.main_list_item, parent ,false);
//        Todo todo = data.get(position);
//
//        ((TextView) view.findViewById(R.id.main_list_item_text)).setText(todo.text);
//        return view;
    }

//    public View getView(int position) {
//        View view = LayoutInflater.from(context).inflate(R.layout.main_list_item, null);
//        Todo todo = data.get(position);
//
//        ((TextView) view.findViewById(R.id.main_list_item_text)).setText(todo.text);
//        return view;
//    }
    private static class ViewHolder {
        TextView todoText;
    }
}


