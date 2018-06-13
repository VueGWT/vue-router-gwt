package com.axellience.vueroutergwt.client.functions;

import com.axellience.vueroutergwt.client.Position;
import com.axellience.vueroutergwt.client.Route;
import jsinterop.annotations.JsFunction;

/**
 * @author Adrien Baron
 */
@FunctionalInterface
@JsFunction
public interface ScrollBehavior {

  Object scrollBehavior(Route to, Route from, Position savedPosition);
}
