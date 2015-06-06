package com.example.test1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	private Context context;
	public MyAdapter(Context context){
		this.context=context;
	}
	public Context getContext() {
		return context;
	}
	DataCell data[]=new DataCell[]{
			new DataCell(R.drawable.img1, "demo1"),
			new DataCell(R.drawable.img2, "demo2"),
			new DataCell(R.drawable.img3, "demo3")
	};
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public DataCell getItem(int position) {
		// TODO Auto-generated method stub
		return data[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LinearLayout layout=null;
		if(convertView!=null){
			layout=(LinearLayout) convertView;
		}
		else {
			layout=(LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.list_cell, null);
		}
		DataCell tempDataCell=data[position];
		ImageView imageView=(ImageView) layout.findViewById(R.id.imageView1);
		TextView textView=(TextView) layout.findViewById(R.id.textView1);
		imageView.setImageResource(tempDataCell.getIcon());
		textView.setText(tempDataCell.getText());
		return layout;
	}

}
