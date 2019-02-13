package com.yudong80.reactivejava.chapter01;

import io.reactivex.Observable;

public class FirstExample {	
	public void emit() {
		Observable<String> hello = Observable.just("Hello", "RxJava2!!");
		hello.subscribe(System.out::println);
		hello.subscribe(System.out::print);
	}

	public static void main(String args[]) { 
		FirstExample demo = new FirstExample();
		demo.emit();
	}	
}