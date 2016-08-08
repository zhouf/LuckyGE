package com.example.lenovo.luckyge.activity;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by lenovo on 2016/8/5.
 */
public class WebAppInterface {
    Context mContext;

    public WebAppInterface(Context c) {

        mContext = c;
    }
    /** Show a toast from the web page */
    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }
}
