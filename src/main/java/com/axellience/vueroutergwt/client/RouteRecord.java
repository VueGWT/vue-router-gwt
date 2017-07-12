package com.axellience.vueroutergwt.client;

import com.axellience.vuegwt.client.VueComponent;
import com.axellience.vueroutergwt.client.functions.RedirectOption;
import com.google.gwt.regexp.shared.RegExp;
import jsinterop.annotations.JsProperty;

/**
 * @author Adrien Baron
 */
public class RouteRecord
{
    @JsProperty public String path;
    @JsProperty public RegExp regex;
    @JsProperty public Dictionary<Object> components;
    @JsProperty public Dictionary<VueComponent> instances;
    @JsProperty public String name;
    @JsProperty public RouteRecord parent;
    @JsProperty public RedirectOption redirect;
    @JsProperty public String matchAs;
    @JsProperty public Object meta;
    @JsProperty public Object props;
}
