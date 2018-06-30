package com.star.learningrxjavaconditionoperators;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "RxJava";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Observable
//                .just(1, 2, 3, 4, 5)
//                .all(integer -> integer <= 10)
//                .subscribe(aBoolean -> Log.d(TAG, "result is "+ aBoolean));
//
//        Observable
//                .interval(1, TimeUnit.SECONDS)
//                .takeWhile(along -> along <= 10)
//                .subscribe(new Observer<Long>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "开始采用subscribe连接");
//                    }
//
//                    @Override
//                    public void onNext(Long aLong) {
//                        Log.d(TAG, "对Next事件" + aLong + "作出响应"  );
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.d(TAG, "对Error事件作出响应");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d(TAG, "对Complete事件作出响应");
//                    }
//                });
//
//        Observable
//                .interval(1, TimeUnit.SECONDS)
//                .skipWhile(along -> along <= 10)
//                .subscribe(new Observer<Long>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "开始采用subscribe连接");
//                    }
//
//                    @Override
//                    public void onNext(Long aLong) {
//                        Log.d(TAG, "对Next事件" + aLong + "作出响应"  );
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.d(TAG, "对Error事件作出响应");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d(TAG, "对Complete事件作出响应");
//                    }
//                });
//
//        Observable
//                .interval(1, TimeUnit.SECONDS)
//                .takeUntil(along -> along > 10)
//                .subscribe(new Observer<Long>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "开始采用subscribe连接");
//                    }
//
//                    @Override
//                    public void onNext(Long aLong) {
//                        Log.d(TAG, "对Next事件" + aLong + "作出响应"  );
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.d(TAG, "对Error事件作出响应");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d(TAG, "对Complete事件作出响应");
//                    }
//                });
//
//        Observable
//                .interval(1, TimeUnit.SECONDS)
//                .takeUntil(Observable.timer(5, TimeUnit.SECONDS))
//                .subscribe(new Observer<Long>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "开始采用subscribe连接");
//                    }
//
//                    @Override
//                    public void onNext(Long aLong) {
//                        Log.d(TAG, "对Next事件" + aLong + "作出响应"  );
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.d(TAG, "对Error事件作出响应");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d(TAG, "对Complete事件作出响应");
//                    }
//                });
//
//        Observable
//                .interval(1, TimeUnit.SECONDS)
//                .skipUntil(Observable.timer(5, TimeUnit.SECONDS))
//                .subscribe(new Observer<Long>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        Log.d(TAG, "开始采用subscribe连接");
//                    }
//
//                    @Override
//                    public void onNext(Long aLong) {
//                        Log.d(TAG, "对Next事件" + aLong + "作出响应"  );
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.d(TAG, "对Error事件作出响应");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d(TAG, "对Complete事件作出响应");
//                    }
//                });
//
//        Observable
//                .sequenceEqual(Observable.just(1, 2, 3), Observable.just(1, 2, 3))
//                .subscribe(aBoolean -> Log.d(TAG, "2个Observable是否相同: " + aBoolean));
//
//        Observable
//                .just(1, 2, 3, 4, 5)
//                .contains(3)
//                .subscribe(aBoolean -> Log.d(TAG, "result is "+ aBoolean));
//
//        Observable
//                .just(1, 2, 3, 4, 5)
//                .isEmpty()
//                .subscribe(aBoolean -> Log.d(TAG, "result is "+ aBoolean));
//
//        List<ObservableSource<Integer>> observableSources = new ArrayList<>();
//
//        observableSources.add(
//                Observable
//                        .just(1, 2, 3)
//                        .delay(1, TimeUnit.SECONDS));
//        observableSources.add(
//                Observable
//                        .just(4, 5, 6));
//
//        Observable
//                .amb(observableSources)
//                .subscribe(integer -> Log.d(TAG, "接收到了事件 " + integer));

        Observable
                .create((ObservableOnSubscribe<Integer>) Emitter::onComplete)
                .defaultIfEmpty(10)
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d(TAG, "开始采用subscribe连接");
                    }

                    @Override
                    public void onNext(Integer integer) {
                        Log.d(TAG, "对Next事件" + integer + "作出响应"  );
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "对Error事件作出响应");
                    }

                    @Override
                    public void onComplete() {
                        Log.d(TAG, "对Complete事件作出响应");
                    }
                });

    }
}
