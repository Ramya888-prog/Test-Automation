package com.vedha.polymorph;

public class MainPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefinePoly define = new DefinePoly();
		int a = define.add(23, 32);
		System.out.println(a);

		int b = define.add(234, 234, 123);
		System.out.println(b);

		float f = define.add(123, 234, 34.65f);
		System.out.println(f);

	}

}
