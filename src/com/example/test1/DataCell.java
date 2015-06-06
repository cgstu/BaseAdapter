package com.example.test1;

public class DataCell {
	private int icon;
	private String text;
	public int getIcon() {
		return icon;
	}
	public void setIcon(int icon) {
		this.icon = icon;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public DataCell(int icon,String text){
		this.setIcon(icon);
		this.setText(text);
	}
}
