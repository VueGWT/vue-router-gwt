package com.axellience.vueroutergwt.client;

import com.axellience.vuegwt.core.client.VueGWT;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.axellience.vuegwt.core.client.vue.VueComponentFactory;
import com.axellience.vuegwt.core.client.vue.VueJsConstructor;
import com.axellience.vueroutergwt.client.functions.ParseQuery;
import com.axellience.vueroutergwt.client.functions.ScrollBehavior;
import com.axellience.vueroutergwt.client.functions.StringifyQuery;
import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Adrien Baron
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public final class RouterOptions
{
    @JsProperty private JsArray<RouteConfig> routes;
    @JsProperty private String mode;
    @JsProperty private boolean fallback;
    @JsProperty private String base;
    @JsProperty private String linkActiveClass;
    @JsProperty private String linkExactActiveClass;
    @JsProperty private ParseQuery parseQuery;
    @JsProperty private StringifyQuery stringifyQuery;
    @JsProperty private ScrollBehavior scrollBehavior;

    @JsOverlay
    public final JsArray<RouteConfig> getRoutes()
    {
        return routes;
    }

    @JsOverlay
    public final RouterOptions setRoutes(JsArray<RouteConfig> routes)
    {
        this.routes = routes;
        return this;
    }

    @JsOverlay
    public final RouterOptions addRoute(RouteConfig route)
    {
        if (this.routes == null)
            this.routes = new JsArray<>();

        this.routes.push(route);
        return this;
    }

    @JsOverlay
    public final <T extends IsVueComponent> RouterOptions addRoute(String path,
        Class<T> componentClass)
    {
        this.addRoute(path, VueGWT.getVueComponentFactory(componentClass));
        return this;
    }

    @JsOverlay
    public final <T extends IsVueComponent> RouterOptions addRoute(String path,
        VueComponentFactory<T> componentFactory)
    {
        this.addRoute(path, componentFactory.getJsConstructor());
        return this;
    }

    @JsOverlay
    public final <T extends IsVueComponent> RouterOptions addRoute(String path,
        VueJsConstructor<T> componentJsConstructor)
    {
        this.addRoute(RouteConfig.of(path, componentJsConstructor));
        return this;
    }

    @JsOverlay
    public final String getMode()
    {
        return mode;
    }

    @JsOverlay
    public final RouterOptions setMode(RouterMode mode)
    {
        this.mode = mode.getValue();
        return this;
    }

    @JsOverlay
    public final RouterOptions setMode(String mode)
    {
        this.mode = mode;
        return this;
    }

    @JsOverlay
    public final boolean isFallback()
    {
        return fallback;
    }

    @JsOverlay
    public final RouterOptions setFallback(boolean fallback)
    {
        this.fallback = fallback;
        return this;
    }

    @JsOverlay
    public final String getBase()
    {
        return base;
    }

    @JsOverlay
    public final RouterOptions setBase(String base)
    {
        this.base = base;
        return this;
    }

    @JsOverlay
    public final String getLinkActiveClass()
    {
        return linkActiveClass;
    }

    @JsOverlay
    public final RouterOptions setLinkActiveClass(String linkActiveClass)
    {
        this.linkActiveClass = linkActiveClass;
        return this;
    }

    @JsOverlay
    public final String getLinkExactActiveClass()
    {
        return linkExactActiveClass;
    }

    @JsOverlay
    public final RouterOptions setLinkExactActiveClass(String linkExactActiveClass)
    {
        this.linkExactActiveClass = linkExactActiveClass;
        return this;
    }

    @JsOverlay
    public final ParseQuery getParseQuery()
    {
        return parseQuery;
    }

    @JsOverlay
    public final RouterOptions setParseQuery(ParseQuery parseQuery)
    {
        this.parseQuery = parseQuery;
        return this;
    }

    @JsOverlay
    public final StringifyQuery getStringifyQuery()
    {
        return stringifyQuery;
    }

    @JsOverlay
    public final RouterOptions setStringifyQuery(StringifyQuery stringifyQuery)
    {
        this.stringifyQuery = stringifyQuery;
        return this;
    }

    @JsOverlay
    public final ScrollBehavior getScrollBehavior()
    {
        return scrollBehavior;
    }

    @JsOverlay
    public final RouterOptions setScrollBehavior(ScrollBehavior scrollBehavior)
    {
        this.scrollBehavior = scrollBehavior;
        return this;
    }
}
