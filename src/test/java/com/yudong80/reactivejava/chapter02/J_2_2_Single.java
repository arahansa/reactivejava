package com.yudong80.reactivejava.chapter02;

import com.yudong80.reactivejava.common.Order;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import org.junit.Test;

public class J_2_2_Single {

    @Test
    public void 싱글이란_무엇인가() {
        // first() 메서드를 호출하여 Single 객체 생성하기
        String[] colors = {"Red", "Blue", "Gold"};
        Observable.fromArray(colors)
                .first("default value")
                .subscribe(System.out::println);

        // empty Observable에서 Single 객체 생성하기
        Observable.empty()
                .single("default value")
                .subscribe(System.out::println);

        //take() 함수에서 Single 객체 생성하기
        Observable.just(new Order("ORD-1"), new Order("ORD-2"))
                .take(1)
                .single(new Order("default order"))
                .subscribe(System.out::println);
    }

    @Test
    public void 에러케이스() {
        Single<String> source = Observable.just("Hello Single", "Error").single("default item");
        source.subscribe(System.out::println);
    }
}
