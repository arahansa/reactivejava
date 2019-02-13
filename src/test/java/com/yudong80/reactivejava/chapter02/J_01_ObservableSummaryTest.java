package com.yudong80.reactivejava.chapter02;

import io.reactivex.Observable;
import org.junit.Test;

public class J_01_ObservableSummaryTest {

    /**
     * 옵저버블은 간단히 생성할 때
     */
    @Test
    public void just() {
        Observable.just("Hello World").subscribe(System.out::println);
        Observable.just(1,2,3,4,5,6).subscribe(System.out::print);
    }
}