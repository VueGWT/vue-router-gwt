package com.axellience.vueroutergwt.client;

import com.axellience.vuegwt.client.Vue;
import com.axellience.vuegwt.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.client.jsnative.html.HTMLDocument;
import com.axellience.vuegwt.client.jsnative.html.HTMLElement;
import com.axellience.vuegwt.client.jsnative.jstypes.JsArray;
import com.axellience.vuegwt.client.jsnative.jstypes.JsObject;
import com.axellience.vuegwt.client.tools.JsTools;
import com.axellience.vueroutergwt.client.functions.AfterEach;
import com.axellience.vueroutergwt.client.functions.Callback;
import com.axellience.vueroutergwt.client.functions.NavigationGuard;
import com.axellience.vueroutergwt.client.resources.VueRouterResources;
import com.google.gwt.core.client.GWT;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Adrien Baron
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class VueRouter extends JsObject
{
    @JsProperty private Vue app;
    @JsProperty private String mode;
    @JsProperty private Route currentRoute;

    @JsOverlay
    public static void init()
    {
        if (isVueRouterInjected())
            return;

        HTMLDocument document = HTMLDocument.get();

        HTMLElement scriptElement = document.createElement("script");
        VueRouterResources resources = GWT.create(VueRouterResources.class);
        scriptElement.innerHTML = resources.vueRouterScript().getText();
        document.body.appendChild(scriptElement);
    }

    @JsOverlay
    private static boolean isVueRouterInjected()
    {
        return JsTools.getWindow().get("VueRouter") != null;
    }

    public VueRouter(RouterOptions options)
    {

    }

    @JsOverlay
    public final Vue getApp()
    {
        return app;
    }

    @JsOverlay
    public final RouterMode getMode()
    {
        return RouterMode.fromValue(this.mode);
    }

    @JsOverlay
    public final Route getCurrentRoute()
    {
        return currentRoute;
    }

    public native void beforeEach(NavigationGuard guard);

    public native void beforeResolve(NavigationGuard guard);

    public native void afterEach(AfterEach afterEach);

    public native void push(String location);

    public native void push(String location, Callback onComplete);

    public native void push(String location, Callback onComplete, Callback onAbort);

    public native void push(Location location);

    public native void push(Location location, Callback onComplete);

    public native void push(Location location, Callback onComplete, Callback onAbort);

    public native void replace(String location);

    public native void replace(String location, Callback onComplete);

    public native void replace(String location, Callback onComplete, Callback onAbort);

    public native void replace(Location location);

    public native void replace(Location location, Callback onComplete);

    public native void replace(Location location, Callback onComplete, Callback onAbort);

    public native void go(int n);

    public native void back();

    public native void forward();

    public native JsArray<VueComponentOptions> getMatchedComponents(String to);

    public native void onReady(Callback callback);

    public native void onReady(Callback callback, Callback errorCallback);

    public native void onError(Callback callback);

    public native void addRoutes(JsArray<RouteConfig> routes);

    public native ResolveResult resolve(String to);

    public native ResolveResult resolve(String to, Route current);

    public native ResolveResult resolve(String to, Route current, boolean append);
}
