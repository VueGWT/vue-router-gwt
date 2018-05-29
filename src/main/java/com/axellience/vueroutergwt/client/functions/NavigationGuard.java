package com.axellience.vueroutergwt.client.functions;

import com.axellience.vueroutergwt.client.Route;
import jsinterop.annotations.JsFunction;

/**
 * @author Adrien Baron
 */
@FunctionalInterface
@JsFunction
public interface NavigationGuard
{
    void guard(Route to, Route from, Next next);
}
