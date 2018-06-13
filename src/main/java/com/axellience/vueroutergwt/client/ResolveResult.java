package com.axellience.vueroutergwt.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Adrien Baron
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public final class ResolveResult {

  @JsProperty
  private Location location;
  @JsProperty
  private Route route;
  @JsProperty
  private String href;

  @JsOverlay
  public final Location getLocation() {
    return location;
  }

  @JsOverlay
  public final ResolveResult setLocation(Location location) {
    this.location = location;
    return this;
  }

  @JsOverlay
  public final Route getRoute() {
    return route;
  }

  @JsOverlay
  public final ResolveResult setRoute(Route route) {
    this.route = route;
    return this;
  }

  @JsOverlay
  public final String getHref() {
    return href;
  }

  @JsOverlay
  public final ResolveResult setHref(String href) {
    this.href = href;
    return this;
  }
}
