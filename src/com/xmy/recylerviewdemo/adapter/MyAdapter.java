package com.xmy.recylerviewdemo.adapter;

import java.util.List;

import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xmy.recylerviewdemo.R;
import com.xmy.recylerviewdemo.bean.MyItemBean;
import com.xmy.recylerviewdemo.listener.MyItemClickListener;
import com.xmy.recylerviewdemo.listener.MyItemLongClickListener;
import com.xmy.recylerviewdemo.viewholder.MyViewHolder;

public class MyAdapter extends Adapter<MyViewHolder> {

	private List<MyItemBean> mData;
	private MyItemClickListener mItemClickListener;
	private MyItemLongClickListener mItemLongClickListener;
	
	public MyAdapter(List<MyItemBean> data){
		this.mData = data;
	}
	
	@Override
	public int getItemCount() {
		return mData.size();
	}

	
	@Override
	public void onBindViewHolder(MyViewHolder holder, int position) {
		MyItemBean bean = mData.get(position);
		holder.tv.setText(bean.tv);
	}

	@Override
	public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent,false);
		MyViewHolder vh = new MyViewHolder(itemView,mItemClickListener,mItemLongClickListener);
		return vh;
	}

	/**
	 * ÉèÖÃItemµã»÷¼àÌý
	 * @param listener
	 */
	public void setOnItemClickListener(MyItemClickListener listener){
		this.mItemClickListener = listener;
	}
	
	public void setOnItemLongClickListener(MyItemLongClickListener listener){
		this.mItemLongClickListener = listener;
	}
}
