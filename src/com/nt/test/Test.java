package com.nt.test;

import com.nt.factory.ShapeFactory;
import com.nt.inter.Shape;

public class Test {
	
	public static void main(String[] args) {
		
		ShapeFactory factory=null;
		Shape shape1=null,shape2=null;
		
		factory=new ShapeFactory();
		//shape1=ShapeFactory.getShape("CIRCLE");
		//shape1.drow();
		
		shape1=ShapeFactory.getShape("RECTANGLE");
		shape1.drow();
		System.out.println(shape1.getClass().getName());
		shape2=ShapeFactory.getShape("SQUARE");
		shape2.drow();
		System.out.println(shape2.getClass().getName());
		
		
	}

}
