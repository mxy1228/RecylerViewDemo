package com.xmy.recylerviewdemo.layoutmanager;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public class MyLayoutManager extends LinearLayoutManager {

	public MyLayoutManager(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void onMeasure(Recycler recycler, State state, int widthSpec,
			int heightSpec) {
		View view = recycler.getViewForPosition(0);
		if(view != null){
			measureChild(view, widthSpec, heightSpec);
			int measuredWidth = MeasureSpec.getSize(widthSpec);
			int measuredHeight = view.getMeasuredHeight();
			setMeasuredDimension(measuredWidth, measuredHeight);
		}
	}
}
