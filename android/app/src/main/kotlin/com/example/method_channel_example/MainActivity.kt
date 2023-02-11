package com.example.method_channel_example

import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel


class MainActivity : FlutterActivity() {

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)

        flutterEngine.dartExecutor.let {
            MethodChannel(it.binaryMessenger, "my_channel").setMethodCallHandler(MyHandler())
        }
    }
}
