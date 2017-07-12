package com.axellience.vueroutergwt.client;

import jsinterop.annotations.JsProperty;

/**
 * @author Adrien Baron
 */
public class ResolveResult
{
    @JsProperty private Location location;
    @JsProperty private Route route;
    @JsProperty private String href;

    public Location getLocation()
    {
        return location;
    }

    public Route getRoute()
    {
        return route;
    }

    public String getHref()
    {
        return href;
    }
}
