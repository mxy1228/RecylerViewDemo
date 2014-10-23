package com.xmy.recylerviewdemo.viewholder;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.xmy.recylerviewdemo.R;
import com.xmy.recylerviewdemo.listener.MyItemClickListener;

public class MyViewHolder extends ViewHolder implements OnClickListener{

	public ImageView iv;
	public TextView tv;
	private MyItemClickListener mListener;
	
	public MyViewHolder(View arg0,MyItemClickListener listener) {
		super(arg0);
		iv = (ImageView)arg0.findViewById(R.id.item_iv);
		tv = (TextView)arg0.findViewById(R.id.item_tv);
		this.mListener = listener;
		arg0.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(mListener != null){
			mListener.onItemClick(v,getPosition());
		}
	}

}
