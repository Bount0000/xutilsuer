package com.example.lenovo.xutilsuer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by lenovo on 2017/8/29.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<MyBean> list;

    public MyAdapter(Context context, List<MyBean> list) {
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
         view= LayoutInflater.from(context).inflate(R.layout.item,null);
         TextView tv= view.findViewById(R.id.tv);
         ImageView iv= view.findViewById(R.id.iv);
         tv.setText(list.get(i).getTitle());
         ImageLoader.getInstance().displayImage(list.get(i).getPic(),iv);
        return view;
    }
}
