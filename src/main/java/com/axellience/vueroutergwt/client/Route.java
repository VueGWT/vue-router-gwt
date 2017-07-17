package com.axellience.vueroutergwt.client;

import com.axellience.vuegwt.client.jsnative.jstypes.JsArray;
import com.axellience.vuegwt.client.jsnative.jstypes.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Adrien Baron
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public final class Route extends JsObject
{
    @JsProperty private String name;
    @JsProperty private String path;
    @JsProperty private String hash;
    @JsProperty private JsObject<String> query;
    @JsProperty private JsObject<String> params;
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
    public final JsObject<String> getQuery()
    {
        return query;
    }

    @JsOverlay
    public final Route setQuery(JsObject<String> query)
    {
        this.query = query;
        return this;
    }

    @JsOverlay
    public final Route setQueryParameter(String key, String value)
    {
        if (this.query == null)
            this.query = new JsObject<>();

        this.query.set(key, value);
        return this;
    }

    @JsOverlay
    public final JsObject<String> getParams()
    {
        return params;
    }

    @JsOverlay
    public final Route setParams(JsObject<String> params)
    {
        this.params = params;
        return this;
    }

    @JsOverlay
    public final Route setParam(String key, String value)
    {
        if (this.params == null)
            this.params = new JsObject<>();

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
