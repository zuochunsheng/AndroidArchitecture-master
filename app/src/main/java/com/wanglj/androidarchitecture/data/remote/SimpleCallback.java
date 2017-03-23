package com.wanglj.androidarchitecture.data.remote;

/**
 * Created by wanglj on 16/7/4.
 * ui调用网络请求回调的简单的接口
 */

public interface SimpleCallback<T> {
    void onStart();
    void onNext(T t);
    void onComplete();
}
