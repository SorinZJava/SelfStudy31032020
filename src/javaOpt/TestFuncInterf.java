package javaOpt;

import java.util.function.Function;

public class TestFuncInterf {
	
	 public static void main(String[] args) {
		 	//@FunctionalInterface
		 @Annotationuri(author = "", date = "", reviewers = { "" })
	        Function<String, Integer> func = x -> x.length();

	        Integer apply = func.apply("mkyong");   // 6

	        System.out.println(apply);

	    }

	}

