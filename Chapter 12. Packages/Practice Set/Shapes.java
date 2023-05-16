package com.codewithharry.shape;
class Rectangle{
	double l,b;
	void setDimensions(double l,double b){
		this.l = l;
		this.b = b;
	}
	double getLength(){
		return l;
	}
	double getBreadth(){
		return b;
	}
	double surfaceArea(){
		return getLength()*getBreadth();
	}

}

class Square extends Rectangle{
	void setDimensions(double s){
		this.l = s;
		this.b = s;
	}
}

class Circle extends Rectangle{
	private double r;
	void setRadius(double r){
		this.r = r;
	}
	double getRadius(){
		return r;
	}
	@Override
	double surfaceArea(){
		return Math.PI*getRadius()*getRadius();
	}
}

class Cylinder extends Circle{
	private double h;
	void setHeight(double h){
		this.h = h;
	}
	double getHeight(){
		return h;
	}
	double volume(){
		return surfaceArea()*getHeight();
	}
}

class Sphere extends Circle{
	@Override
	double surfaceArea(){
		return 4*Math.PI*getRadius()*getRadius();
	}
	double volume(){
		return 4*Math.PI*Math.pow(getRadius(),3)/3;
	}
}