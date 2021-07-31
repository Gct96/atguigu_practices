package com.atguigu.interfaCe;

public class ComparableCircle extends Circle implements CompareObject {
	public ComparableCircle(double radius) {
		super(radius);
	}
	@Override
	public int compareTo(Object o) {
		if(this==o) {
			return 0;
		}
		if(o instanceof ComparableCircle) {
			ComparableCircle c=(ComparableCircle) o;
			return this.getRadius().compareTo(c.getRadius());
		}else
			return 0;	
	}

}
