package com.nt.factory;

import com.nt.impl.Circle;
import com.nt.impl.Rectangle;
import com.nt.impl.Square;
import com.nt.inter.Shape;

public class ShapeFactory {
	
	
	   //use getShape method to get object of type shape 
	   public static Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	         
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      
	      return null;
	   }

}
