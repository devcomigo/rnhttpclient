package com.rnhttpclientlibrary;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;

public class HttpClientModule extends ReactContextBaseJavaModule {
    HttpClientModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "HttpClient";
    }

    @ReactMethod
    public void add(int a, int b, Promise promise) {
        promise.resolve(a + b);
    }
}