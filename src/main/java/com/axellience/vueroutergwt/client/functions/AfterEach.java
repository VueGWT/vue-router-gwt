package com.axellience.vueroutergwt.client.functions;

import com.axellience.vueroutergwt.client.Route;
import jsinterop.annotations.JsFunction;

/**
 * @author Adrien Baron
 */
@FunctionalInterface
@JsFunction
public interface AfterEach
{
    Object afterEach(Route to, Route from);
}
