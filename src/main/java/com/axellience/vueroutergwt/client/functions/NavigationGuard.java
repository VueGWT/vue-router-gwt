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
    Object guard(Route to, Route from, Next next);
}
