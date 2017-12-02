package com.axellience.vueroutergwt.client;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

import static com.axellience.vuegwt.core.client.tools.JsUtils.map;

/**
 * @author Adrien Baron
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public final class Route
{
    @JsProperty private String name;
    @JsProperty private String path;
    @JsProperty private String hash;
    @JsProperty private JsPropertyMap<String> query;
    @JsProperty private JsPropertyMap<String> params;
    @JsProperty private String fullPath;
    @JsProperty private JsArray<RouteRecord> matched;
    @JsProperty private String redirectedFrom;
    @JsProperty private Object meta;

    @JsOverlay
    public static Route of(String name, String path)
    {
        return new Route().setName(name).setPath(path);
    }

    @JsOverlay
    public final String getName()
    {
        return name;
    }

    @JsOverlay
    public final Route setName(String name)
    {
        this.name = name;
        return this;
    }

    @JsOverlay
    public final String getPath()
    {
        return path;
    }

    @JsOverlay
    public final Route setPath(String path)
    {
        this.path = path;
        return this;
    }

    @JsOverlay
    public final String getHash()
    {
        return hash;
    }

    @JsOverlay
    public final Route setHash(String hash)
    {
        this.hash = hash;
        return this;
    }

    @JsOverlay
    public final JsPropertyMap<String> getQuery()
    {
        return query;
    }

    @JsOverlay
    public final Route setQuery(JsPropertyMap<String> query)
    {
        this.query = query;
        return this;
    }

    @JsOverlay
    public final Route setQueryParameter(String key, String value)
    {
        if (this.query == null)
            this.query = map();

        this.query.set(key, value);
        return this;
    }

    @JsOverlay
    public final JsPropertyMap<String> getParams()
    {
        return params;
    }

    @JsOverlay
    public final Route setParams(JsPropertyMap<String> params)
    {
        this.params = params;
        return this;
    }

    @JsOverlay
    public final Route setParam(String key, String value)
    {
        if (this.params == null)
            this.params = map();

        this.params.set(key, value);
        return this;
    }

    @JsOverlay
    public final String getFullPath()
    {
        return fullPath;
    }

    @JsOverlay
    public final Route setFullPath(String fullPath)
    {
        this.fullPath = fullPath;
        return this;
    }

    @JsOverlay
    public final JsArray<RouteRecord> getMatched()
    {
        return matched;
    }

    @JsOverlay
    public final Route setMatched(JsArray<RouteRecord> matched)
    {
        this.matched = matched;
        return this;
    }

    @JsOverlay
    public final String getRedirectedFrom()
    {
        return redirectedFrom;
    }

    @JsOverlay
    public final Route setRedirectedFrom(String redirectedFrom)
    {
        this.redirectedFrom = redirectedFrom;
        return this;
    }

    @JsOverlay
    public final Object getMeta()
    {
        return meta;
    }

    @JsOverlay
    public final Route setMeta(Object meta)
    {
        this.meta = meta;
        return this;
    }
}
