package com.axellience.vueroutergwt.client;

import jsinterop.base.JsPropertyMap;

/**
 * @author Adrien Baron
 */
public interface VueRouteComponent
{
    default Route getRoute()
    {
        return (Route) ((JsPropertyMap) this).get("$route");
    }

    default VueRouter getRouter()
    {
        return (VueRouter) ((JsPropertyMap) this).get("$router");
    }
}
