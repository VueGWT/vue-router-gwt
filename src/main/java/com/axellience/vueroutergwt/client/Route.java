package com.axellience.vueroutergwt.client;

import com.axellience.vuegwt.client.jsnative.jstypes.JsArray;
import jsinterop.annotations.JsProperty;

/**
 * @author Adrien Baron
 */
public class Route
{
    @JsProperty private String name;
    @JsProperty private String path;
    @JsProperty private String hash;
    @JsProperty private Dictionary<String> query;
    @JsProperty private Dictionary<String> params;
    @JsProperty private String fullPath;
    @JsProperty private JsArray<RouteRecord> matched;
    @JsProperty private String redirectedFrom;
    @JsProperty private Object meta;

    public Route(String name, String path)
    {
        this.name = name;
        this.path = path;
    }

    public String getName()
    {
        return name;
    }

    public Route setName(String name)
    {
        this.name = name;
        return this;
    }

    public String getPath()
    {
        return path;
    }

    public Route setPath(String path)
    {
        this.path = path;
        return this;
    }

    public String getHash()
    {
        return hash;
    }

    public Route setHash(String hash)
    {
        this.hash = hash;
        return this;
    }

    public Dictionary<String> getQuery()
    {
        return query;
    }

    public Route setQueryField(String queryFieldName, String queryFieldValue)
    {
        if (this.query == null)
            this.query = new Dictionary<>();

        this.query.put(queryFieldName, queryFieldValue);

        return this;
    }

    public Dictionary<String> getParams()
    {
        return params;
    }

    public Route setParam(String name, String value)
    {
        if (this.params == null)
            this.params = new Dictionary<>();

        this.params.put(name, value);
        return this;
    }

    public String getFullPath()
    {
        return fullPath;
    }

    public Route setFullPath(String fullPath)
    {
        this.fullPath = fullPath;
        return this;
    }

    public JsArray<RouteRecord> getMatched()
    {
        return matched;
    }

    public Route addMatched(RouteRecord matched)
    {
        if (this.matched == null)
            this.matched = new JsArray<>();

        this.matched.push(matched);
        return this;
    }

    public String getRedirectedFrom()
    {
        return redirectedFrom;
    }

    public Route setRedirectedFrom(String redirectedFrom)
    {
        this.redirectedFrom = redirectedFrom;
        return this;
    }

    public Object getMeta()
    {
        return meta;
    }

    public Route setMeta(Object meta)
    {
        this.meta = meta;
        return this;
    }
}
