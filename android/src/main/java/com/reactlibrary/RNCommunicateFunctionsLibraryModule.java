
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class RNCommunicateFunctionsLibraryModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNCommunicateFunctionsLibraryModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNCommunicateFunctionsLibrary";
  }

  @ReactMethod
  public void show(String message) {
    message = "hello" + message;   
  }

  @ReactMethod
  public void CallbackShow(int number1, int number2,Callback successCallback) {
    try {      
      successCallback.invoke((number1 * number2));
    } catch (Exception e) {
      
    }
  }
  @ReactMethod
  public void PromiseShow(int number1,Callback successCallback) {
    try {      
      for(int i=0i<100;i++)
      {
        int Random = (int)(Math.random()*100);
        if (Random == number1)
        {
           promise.resolve('Matched');
        }
     }      
    } catch (Exception e) {
       
    }
  }

}