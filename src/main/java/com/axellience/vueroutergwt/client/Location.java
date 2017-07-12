package com.axellience.vueroutergwt.client;

import jsinterop.annotations.JsProperty;

/**
 * @author Adrien Baron
 */
public class Location
{
    @JsProperty private String name;
    @JsProperty private String path;
    @JsProperty private String hash;
    @JsProperty private Dictionary<String> query;
    @JsProperty private Dictionary<String> params;
    @JsProperty private boolean append;
    @JsProperty private boolean replace;

    public Location(String name, String path)
    {
        this.name = name;
        this.path = path;
    }

    public String getName()
    {
        return name;
    }

    public Location setName(String name)
    {
        this.name = name;
        return this;
    }

    public String getPath()
    {
        return path;
    }

    public Location setPath(String path)
    {
        this.path = path;
        return this;
    }

    public String getHash()
    {
        return hash;
    }

    public Location setHash(String hash)
    {
        this.hash = hash;
        return this;
    }

    public Dictionary<String> getQuery()
    {
        return query;
    }

    public Location setQueryField(String queryFieldName, String queryFieldValue)
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

    public Location setParam(String name, String value)
    {
        if (this.params == null)
            this.params = new Dictionary<>();

        this.params.put(name, value);
        return this;
    }

    public boolean isAppend()
    {
        return append;
    }

    public Location setAppend(boolean append)
    {
        this.append = append;
        return this;
    }

    public boolean isReplace()
    {
        return replace;
    }

    public Location setReplace(boolean replace)
    {
        this.replace = replace;
        return this;
    }
}
