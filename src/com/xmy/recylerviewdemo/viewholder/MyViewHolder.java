package com.xmy.recylerviewdemo.viewholder;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.xmy.recylerviewdemo.R;
import com.xmy.recylerviewdemo.listener.MyItemClickListener;
import com.xmy.recylerviewdemo.listener.MyItemLongClickListener;

public class MyViewHolder extends ViewHolder implements OnClickListener,OnLongClickListener{

	public ImageView iv;
	public TextView tv;
	private MyItemClickListener mListener;
	private MyItemLongClickListener mLongClickListener;
	
	public MyViewHolder(View arg0,MyItemClickListener listener,MyItemLongClickListener longClickListener) {
		super(arg0);
		iv = (ImageView)arg0.findViewById(R.id.item_iv);
		tv = (TextView)arg0.findViewById(R.id.item_tv);
		this.mListener = listener;
		this.mLongClickListener = longClickListener;
		arg0.setOnClickListener(this);
		arg0.setOnLongClickListener(this);
	}

	/**
	 * µã»÷¼àÌý
	 */
	@Override
	public void onClick(View v) {
		if(mListener != null){
			mListener.onItemClick(v,getPosition());
		}
	}

	/**
	 * ³¤°´¼àÌý
	 */
	@Override
	public boolean onLongClick(View arg0) {
		if(mLongClickListener != null){
			mLongClickListener.onItemLongClick(arg0, getPosition());
		}
		return true;
	}

}
