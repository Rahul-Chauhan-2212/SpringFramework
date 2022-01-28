package com.spring.framework.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spEL")
public class SpEL {
	
	@Value("#{3+4}")
	private int X;
	
	//@Value("#{T(java.lang.Math).sqrt(15)}")
	@Value("#{T(java.lang.Math).PI}")
	private double Y;
	
	public SpEL() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SpEL(int x, double y) {
		super();
		X = x;
		Y = y;
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public double getY() {
		return Y;
	}
	public void setY(double y) {
		Y = y;
	}
	@Override
	public String toString() {
		return "SpEL [X=" + X + ", Y=" + Y + "]";
	}
	
	

}
