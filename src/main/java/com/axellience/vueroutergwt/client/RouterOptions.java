package com.axellience.vueroutergwt.client;

import com.axellience.vuegwt.client.jsnative.jstypes.JsArray;
import com.axellience.vueroutergwt.client.functions.ParseQuery;
import com.axellience.vueroutergwt.client.functions.ScrollBehavior;
import com.axellience.vueroutergwt.client.functions.StringifyQuery;
import jsinterop.annotations.JsProperty;

/**
 * @author Adrien Baron
 */
public class RouterOptions
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

    public JsArray<RouteConfig> getRoutes()
    {
        return routes;
    }

    public RouterOptions addRoute(RouteConfig route)
    {
        if (this.routes == null)
            this.routes = new JsArray<>();

        this.routes.push(route);
        return this;
    }

    public String getMode()
    {
        return mode;
    }

    public RouterOptions setMode(RouterMode mode)
    {
        this.mode = mode.getValue();
        return this;
    }

    public boolean isFallback()
    {
        return fallback;
    }

    public RouterOptions setFallback(boolean fallback)
    {
        this.fallback = fallback;
        return this;
    }

    public String getBase()
    {
        return base;
    }

    public RouterOptions setBase(String base)
    {
        this.base = base;
        return this;
    }

    public String getLinkActiveClass()
    {
        return linkActiveClass;
    }

    public RouterOptions setLinkActiveClass(String linkActiveClass)
    {
        this.linkActiveClass = linkActiveClass;
        return this;
    }

    public String getLinkExactActiveClass()
    {
        return linkExactActiveClass;
    }

    public RouterOptions setLinkExactActiveClass(String linkExactActiveClass)
    {
        this.linkExactActiveClass = linkExactActiveClass;
        return this;
    }

    public ParseQuery getParseQuery()
    {
        return parseQuery;
    }

    public RouterOptions setParseQuery(ParseQuery parseQuery)
    {
        this.parseQuery = parseQuery;
        return this;
    }

    public StringifyQuery getStringifyQuery()
    {
        return stringifyQuery;
    }

    public RouterOptions setStringifyQuery(StringifyQuery stringifyQuery)
    {
        this.stringifyQuery = stringifyQuery;
        return this;
    }

    public ScrollBehavior getScrollBehavior()
    {
        return scrollBehavior;
    }

    public RouterOptions setScrollBehavior(ScrollBehavior scrollBehavior)
    {
        this.scrollBehavior = scrollBehavior;
        return this;
    }
}
