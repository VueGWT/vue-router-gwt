package com.axellience.vueroutergwt.client;

import com.axellience.vuegwt.client.jsnative.jstypes.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Adrien Baron
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public final class Location extends JsObject
{
    @JsProperty private String name;
    @JsProperty private String path;
    @JsProperty private String hash;
    @JsProperty private JsObject<String> query;
    @JsProperty private JsObject<String> params;
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
    public final JsObject<String> getQuery()
    {
        return query;
    }

    @JsOverlay
    public final Location setQuery(JsObject<String> query)
    {
        this.query = query;
        return this;
    }

    @JsOverlay
    public final Location setQueryParameter(String key, String value)
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
    public final Location setParams(JsObject<String> params)
    {
        this.params = params;
        return this;
    }

    @JsOverlay
    public final Location setParam(String key, String value)
    {
        if (this.params == null)
            this.params = new JsObject<>();

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
