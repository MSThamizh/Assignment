package com.thoughtfocus.arrays;

public class Tester {
public static void main(String[] args) {
	ProgLanguages prolanguage=new ProgLanguages();

	prolanguage.save("C");
	prolanguage.save("C++");
	prolanguage.save("Java");
	prolanguage.save("Python");
	prolanguage.save("PHP");
	prolanguage.save("Dart");
	prolanguage.save("Haskell");
	prolanguage.save("Rust");
	prolanguage.save("SQL");
	prolanguage.save("Ruby");
	prolanguage.save("Swift");
	prolanguage.save("Lua");
	prolanguage.save("MATLAB");
	
	prolanguage.printall();
	String delete= prolanguage.delete("MATLAB");
	String delete1= prolanguage.delete("Haskell");
	System.out.println(delete);
	System.out.println(delete1);
	
	prolanguage.printall();
	
}
}