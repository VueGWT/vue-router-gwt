package com.axellience.vueroutergwt.client.functions;

import jsinterop.annotations.JsFunction;

/**
 * @author Adrien Baron
 */
@JsFunction
@FunctionalInterface
public interface Next {

  void next(Object result);
}
