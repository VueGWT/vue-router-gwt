package com.axellience.vueroutergwt.client.functions;

import com.axellience.vueroutergwt.client.Route;
import jsinterop.annotations.JsFunction;

/**
 * @author Adrien Baron
 */
@FunctionalInterface
@JsFunction
public interface RedirectOption
{
    // Can return Location or String
    Object redirectTo(Route route);
}
