package com.example.ontap_dethithu;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class congnhanadater extends BaseAdapter {
    private final Context context;
    private final ArrayList<congnhan> list;

    public congnhanadater(Context context, ArrayList<congnhan> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        view = inflater.inflate(R.layout.item,viewGroup,false);
        TextView ht = view.findViewById(R.id.ten);
        TextView lg = view.findViewById(R.id.luong);
        ht.setText(list.get(i).getHoten());
        lg.setText(list.get(i).getLuong());
        return view;
    }
}
