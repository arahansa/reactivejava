package com.yudong80.reactivejava.chapter02;

import io.reactivex.Maybe;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class J_2_3_Maybe {

    @Test
    public void 값이_있는경우() {
        Maybe<List<String>> month_maybe = Maybe.create(emitter -> {
            try {
                String[] monthArray = { "1월", "2월", "3월" };

                List<String> months = Arrays.asList(monthArray);
                if (months != null && !months.isEmpty()) {
                    emitter.onSuccess(months);
                } else {
                    emitter.onComplete();
                }
            } catch (Exception e) {
                emitter.onError(e);
            }
        });
        month_maybe.subscribe(s->System.out.println(s));
    }

    @Test
    public void 값이_없는경우() {
        Maybe<Integer> emptySource = Maybe.empty();

        emptySource.subscribe(
                s-> System.out.println("Process 2 received:" + s),
                Throwable::printStackTrace,
                () -> System.out.println("Process 2 done!"));
    }

    @Test
    public void 값이_있는_경우() {
        Maybe<Integer> month_maybe = Maybe.create(emitter -> {
            try {
                emitter.onSuccess(1);
            } catch (Exception e) {
                emitter.onError(e);
            }
        });

        month_maybe.subscribe(
                s -> System.out.println("Process 2 received:" + s),
                Throwable::printStackTrace,
                () -> System.out.println("Process 2 done!"));
    }
}
