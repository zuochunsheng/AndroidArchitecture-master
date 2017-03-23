package com.wanglj.androidarchitecture.module.base;

/**
 * Created by wanglj on 16/7/4.
 * 有网络请求的ui 可以实现此接口
 */

public interface BaseLoadView<T> {
    void showLoading();
    void hideLoading();
}
