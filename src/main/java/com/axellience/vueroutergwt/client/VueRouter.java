package com.axellience.vueroutergwt.client;

import com.axellience.vuegwt.client.VueComponent;
import com.axellience.vuegwt.client.jsnative.types.JsArray;
import com.axellience.vuegwt.client.options.VueComponentOptions;
import com.axellience.vueroutergwt.client.functions.AfterEach;
import com.axellience.vueroutergwt.client.functions.Callback;
import com.axellience.vueroutergwt.client.functions.NavigationGuard;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Adrien Baron
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class VueRouter
{
    private VueComponent app;
    private String mode;
    private Route currentRoute;

    public VueRouter(RouterOptions options)
    {

    }

    public VueComponent getApp()
    {
        return app;
    }

    public RouterMode getMode()
    {
        return RouterMode.fromValue(this.mode);
    }

    public void setMode(RouterMode mode)
    {
        this.mode = mode.getValue();
    }

    public Route getCurrentRoute()
    {
        return currentRoute;
    }

    public native void beforeEach(NavigationGuard guard);

    public native void beforeResolve(NavigationGuard guard);

    public native void afterEach(AfterEach afterEach);

    public native void push(String location, Callback onComplete, Callback onAbort);

    public native void replace(String location, Callback onComplete, Callback onAbort);

    public native void go(int n);

    public native void back();

    public native void forward();

    public native JsArray<VueComponentOptions> getMatchedComponents(String to);

    public native void onReady(Callback callback, Callback errorCallback);

    public native void onError(Callback callback);

    public native void addRoutes(JsArray<RouteConfig> routes);

    public native ResolveResult resolve(String to, Route current, boolean append);
}
