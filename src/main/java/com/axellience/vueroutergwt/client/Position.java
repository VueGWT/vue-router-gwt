package com.axellience.vueroutergwt.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Adrien Baron
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public final class Position {

  @JsProperty
  private int x;
  @JsProperty
  private int y;

  @JsOverlay
  public static Position of(int x, int y) {
    return new Position().setX(x).setY(y);
  }

  @JsOverlay
  public final int getX() {
    return x;
  }

  @JsOverlay
  public final Position setX(int x) {
    this.x = x;
    return this;
  }

  @JsOverlay
  public final int getY() {
    return y;
  }

  @JsOverlay
  public final Position setY(int y) {
    this.y = y;
    return this;
  }
}
