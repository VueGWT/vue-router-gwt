package com.axellience.vueroutergwt.client;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Adrien Baron
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public final class PathToRegexpOptions {

  @JsProperty
  private boolean sensitive;
  @JsProperty
  private boolean strict;
  @JsProperty
  private boolean end;

  @JsOverlay
  public static PathToRegexpOptions of(boolean sensitive, boolean strict, boolean end) {
    return new PathToRegexpOptions().setSensitive(sensitive).setStrict(strict).setEnd(end);
  }

  @JsOverlay
  public final boolean isSensitive() {
    return sensitive;
  }

  @JsOverlay
  public final PathToRegexpOptions setSensitive(boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

  @JsOverlay
  public final boolean isStrict() {
    return strict;
  }

  @JsOverlay
  public final PathToRegexpOptions setStrict(boolean strict) {
    this.strict = strict;
    return this;
  }

  @JsOverlay
  public final boolean isEnd() {
    return end;
  }

  @JsOverlay
  public final PathToRegexpOptions setEnd(boolean end) {
    this.end = end;
    return this;
  }
}
