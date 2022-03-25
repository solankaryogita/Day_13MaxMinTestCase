package com.Bridgelabz.Generic;

public class MaximumTest {
		Float x, y, z;
	
	public MaximumTest(Float x, Float y, Float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Float maximum() {
		return MaximumTest.maximum(x, y, z);
	}
	
	public static Float maximum(Float x, Float y, Float z) {
		Float max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	
	public static Float testMaximum(Float x, Float y, Float z) {
		Float max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;
	}
	
	public static void printMax(Float x, Float y, Float z, Float max) {
		System.out.println(x +" "+ y +" "+ z + "\nMaximum no is : "+ max);
	}
	
	public static void main(String[] args) {
		Float xFlt = 4.4f, yFlt = 6.6f, zFlt = 7.7f;
		
		MaximumTest.testMaximum(xFlt, yFlt, zFlt);
		new MaximumTest(xFlt, yFlt, zFlt).maximum();
	}
}
