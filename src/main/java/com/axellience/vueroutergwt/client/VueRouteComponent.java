package com.axellience.vueroutergwt.client;

import com.axellience.vuegwt.client.tools.JsTools;

/**
 * @author Adrien Baron
 */
public interface VueRouteComponent
{
    default Route getRoute() {
        return JsTools.get(this, "$route");
    }

    default VueRouter getRouter() {
        return JsTools.get(this, "$router");
    }
}
