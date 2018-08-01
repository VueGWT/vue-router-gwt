package com.axellience.vueroutergwt.client;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vueroutergwt.client.functions.RedirectOption;
import elemental2.core.JsRegExp;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

/**
 * @author Adrien Baron
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public final class RouteRecord {

  @JsProperty
  private String path;
  @JsProperty
  private JsRegExp regex;
  @JsProperty
  private JsPropertyMap components;
  @JsProperty
  private JsPropertyMap<Vue> instances;
  @JsProperty
  private String name;
  @JsProperty
  private RouteRecord parent;
  @JsProperty
  private RedirectOption redirect;
  @JsProperty
  private String matchAs;
  @JsProperty
  private Object meta;
  @JsProperty
  private Object props;

  @JsOverlay
  public final String getPath() {
    return path;
  }

  @JsOverlay
  public final RouteRecord setPath(String path) {
    this.path = path;
    return this;
  }

  @JsOverlay
  public final JsRegExp getRegex() {
    return regex;
  }

  @JsOverlay
  public final RouteRecord setRegex(JsRegExp regex) {
    this.regex = regex;
    return this;
  }

  @JsOverlay
  public final JsPropertyMap getComponents() {
    return components;
  }

  @JsOverlay
  public final RouteRecord setComponents(JsPropertyMap components) {
    this.components = components;
    return this;
  }

  @JsOverlay
  public final JsPropertyMap<Vue> getInstances() {
    return instances;
  }

  @JsOverlay
  public final RouteRecord setInstances(JsPropertyMap<Vue> instances) {
    this.instances = instances;
    return this;
  }

  @JsOverlay
  public final String getName() {
    return name;
  }

  @JsOverlay
  public final RouteRecord setName(String name) {
    this.name = name;
    return this;
  }

  @JsOverlay
  public final RouteRecord getParent() {
    return parent;
  }

  @JsOverlay
  public final RouteRecord setParent(RouteRecord parent) {
    this.parent = parent;
    return this;
  }

  @JsOverlay
  public final RedirectOption getRedirect() {
    return redirect;
  }

  @JsOverlay
  public final RouteRecord setRedirect(RedirectOption redirect) {
    this.redirect = redirect;
    return this;
  }

  @JsOverlay
  public final String getMatchAs() {
    return matchAs;
  }

  @JsOverlay
  public final RouteRecord setMatchAs(String matchAs) {
    this.matchAs = matchAs;
    return this;
  }

  @JsOverlay
  public final Object getMeta() {
    return meta;
  }

  @JsOverlay
  public final RouteRecord setMeta(Object meta) {
    this.meta = meta;
    return this;
  }

  @JsOverlay
  public final Object getProps() {
    return props;
  }

  @JsOverlay
  public final RouteRecord setProps(Object props) {
    this.props = props;
    return this;
  }
}
