package com.axellience.vueroutergwt.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

import static com.axellience.vuegwt.client.tools.JsUtils.map;

/**
 * @author Adrien Baron
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public final class Location
{
    @JsProperty private String name;
    @JsProperty private String path;
    @JsProperty private String hash;
    @JsProperty private JsPropertyMap<String> query;
    @JsProperty private JsPropertyMap<String> params;
    @JsProperty private boolean append;
    @JsProperty private boolean replace;

    @JsOverlay
    public final String getName()
    {
        return name;
    }

    @JsOverlay
    public final Location setName(String name)
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
    public final Location setPath(String path)
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
    public final Location setHash(String hash)
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
    public final Location setQuery(JsPropertyMap<String> query)
    {
        this.query = query;
        return this;
    }

    @JsOverlay
    public final Location setQueryParameter(String key, String value)
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
    public final Location setParams(JsPropertyMap<String> params)
    {
        this.params = params;
        return this;
    }

    @JsOverlay
    public final Location setParam(String key, String value)
    {
        if (this.params == null)
            this.params = map();

        this.params.set(key, value);
        return this;
    }

    @JsOverlay
    public final boolean isAppend()
    {
        return append;
    }

    @JsOverlay
    public final Location setAppend(boolean append)
    {
        this.append = append;
        return this;
    }

    @JsOverlay
    public final boolean isReplace()
    {
        return replace;
    }

    @JsOverlay
    public final Location setReplace(boolean replace)
    {
        this.replace = replace;
        return this;
    }
}
