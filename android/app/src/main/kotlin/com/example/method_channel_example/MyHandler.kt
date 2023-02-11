package com.example.method_channel_example

import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel

import io.flutter.plugin.common.MethodChannel.MethodCallHandler


class MyHandler : MethodCallHandler {
    override fun onMethodCall(call: MethodCall, result: MethodChannel.Result) {
        if (call.method === "my_method") {
            print(myMethod())
            // Handle method call here
        } else {
            print("other")
            // Handle other calls here
        }
    }

    fun myMethod(): String {
        return "Hello World!"
    }
}