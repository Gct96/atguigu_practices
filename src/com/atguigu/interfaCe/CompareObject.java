package com.atguigu.interfaCe;
/**
 * 返回值是0代表相等，若为正数代表当前对象大，若为负数，
 * 代表当前对象小
 * @author KeyboardHero
 *
 */
public interface CompareObject {
	public int compareTo(Object o);
}
