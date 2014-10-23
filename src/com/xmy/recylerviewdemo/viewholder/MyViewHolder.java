package com.xmy.recylerviewdemo.viewholder;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.xmy.recylerviewdemo.R;

public class MyViewHolder extends ViewHolder {

	public ImageView iv;
	public TextView tv;
	
	public MyViewHolder(View arg0) {
		super(arg0);
		iv = (ImageView)arg0.findViewById(R.id.item_iv);
		tv = (TextView)arg0.findViewById(R.id.item_tv);
	}

}
