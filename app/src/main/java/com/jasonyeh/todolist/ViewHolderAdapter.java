package com.jasonyeh.todolist;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by jasonyeh on 8/4/17.
 */

public abstract class ViewHolderAdapter extends BaseAdapter {

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if (convertView == null) {
            vh = onCreateViewHolder(parent, position);
            convertView = vh.view;
            vh.view.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        onBindViewHolder(vh, position);
        return convertView;
    }

    // 只定義不實現
    protected abstract ViewHolder onCreateViewHolder(ViewGroup parent, int position);
    // 數據和介面的關係，也是指定義不實現
    protected abstract void onBindViewHolder(ViewHolder viewHolder, int position);

    public static abstract class ViewHolder {
        protected View view;
        public ViewHolder(@NonNull View view) {
            this.view = view;
        }
    }
}
