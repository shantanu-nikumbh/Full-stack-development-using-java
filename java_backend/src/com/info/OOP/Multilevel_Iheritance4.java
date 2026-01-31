package com.info.OOP;

class ProgrammingLanguage {
    void type() {
        System.out.println("This is a programming language");
    }
}

class Java extends ProgrammingLanguage {
    void feature() {
        System.out.println("Java is object oriented");
    }
}

class AdvancedJava extends Java {
    void use() {
        System.out.println("Used for web and enterprise applications");
    }
}

public class Multilevel_Iheritance4 {
	 public static void main(String[] args) {
	        AdvancedJava obj = new AdvancedJava();
	        obj.type();
	        obj.feature();
	        obj.use();
	    }
}
