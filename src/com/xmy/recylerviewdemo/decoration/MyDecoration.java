package com.xmy.recylerviewdemo.decoration;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;

public class MyDecoration extends ItemDecoration {

	private static final int[] ATTRS = new int[]{
        android.R.attr.listDivider
	};
	
	private Drawable mDivider;
	
	public MyDecoration(Context ctx){
		final TypedArray a = ctx.obtainStyledAttributes(ATTRS);
		mDivider = a.getDrawable(0);
	}
	
	@Override
	public void onDraw(Canvas c, RecyclerView parent, State state) {
		int top = parent.getPaddingTop();
		int bottom = parent.getHeight() - parent.getPaddingBottom();
		int childCount = parent.getChildCount();
		for(int i=0;i < childCount;i++){
			View child = parent.getChildAt(i);
			RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)child.getLayoutParams();
			int left = child.getRight() + layoutParams.rightMargin;
			int right = left + mDivider.getIntrinsicWidth();
			mDivider.setBounds(left, top, right, bottom);
			mDivider.draw(c);
		}
	}
	
	@Override
	public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
			State state) {
		outRect.set(0, 0, mDivider.getIntrinsicWidth(), 0);
	}
	
}
