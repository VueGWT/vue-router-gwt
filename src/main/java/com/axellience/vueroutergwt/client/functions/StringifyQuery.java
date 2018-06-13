package com.axellience.vueroutergwt.client.functions;

import jsinterop.annotations.JsFunction;

/**
 * @author Adrien Baron
 */
@FunctionalInterface
@JsFunction
public interface StringifyQuery {

  String stringifyQuery(Object query);
}
