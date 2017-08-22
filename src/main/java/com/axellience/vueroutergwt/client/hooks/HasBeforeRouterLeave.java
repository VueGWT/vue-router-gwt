package com.axellience.vueroutergwt.client.hooks;

import com.axellience.vuegwt.jsr69.component.annotations.HookMethod;
import com.axellience.vueroutergwt.client.Route;
import com.axellience.vueroutergwt.client.functions.Next;
import jsinterop.annotations.JsMethod;

/**
 * @author Adrien Baron
 */
public interface HasBeforeRouterLeave
{
    @JsMethod
    @HookMethod
    void beforeRouteLeave(Route to, Route from, Next next);
}
