package com.yudong80.reactivejava.chapter02;

import com.yudong80.reactivejava.common.CommonUtils;
import io.reactivex.Observable;
import org.junit.Test;

/**
 * @author Lucas Choi
 */
public class J_02_배열옵저버블 {

    @Test
    public void 배열옵저버블() {
        Integer[] arr = {100, 200, 300};
        Observable<Integer> source = Observable.fromArray(arr);
        source.subscribe(System.out::println);
    }
}
