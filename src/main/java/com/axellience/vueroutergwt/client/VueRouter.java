package com.axellience.vueroutergwt.client;

import com.axellience.vuegwt.client.component.VueComponent;
import com.axellience.vuegwt.client.jsnative.jstypes.JsArray;
import com.axellience.vuegwt.client.component.options.VueComponentOptions;
import com.axellience.vueroutergwt.client.functions.AfterEach;
import com.axellience.vueroutergwt.client.functions.Callback;
import com.axellience.vueroutergwt.client.functions.NavigationGuard;
import jsinterop.annotations.JsOverlay;
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

    @JsOverlay
    public final VueComponent getApp()
    {
        return app;
    }

    @JsOverlay
    public final RouterMode getMode()
    {
        return RouterMode.fromValue(this.mode);
    }

    @JsOverlay
    public final void setMode(RouterMode mode)
    {
        this.mode = mode.getValue();
    }

    @JsOverlay
    public final Route getCurrentRoute()
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
