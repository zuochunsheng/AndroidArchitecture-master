package com.wanglj.androidarchitecture.utils;

import android.text.TextUtils;

/**
 * Created by wanglj on 16/6/29.
 * 验证输入框辅助类
 */

public class Validator {

    public Validator() {

    }

    public boolean validUsername(String username) {
        return !TextUtils.isEmpty(username);
    }

    public boolean validPassword(String password) {
        return !TextUtils.isEmpty(password);
    }
}
