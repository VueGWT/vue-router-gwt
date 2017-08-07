package com.axellience.vueroutergwt.client;

import com.axellience.vuegwt.client.VueGWT;
import com.axellience.vuegwt.client.component.VueComponent;
import com.axellience.vuegwt.client.jsnative.jstypes.JsArray;
import com.axellience.vuegwt.client.jsnative.jstypes.JsObject;
import com.axellience.vuegwt.client.vue.VueJsConstructor;
import com.axellience.vuegwt.client.vue.VueFactory;
import com.axellience.vueroutergwt.client.functions.NavigationGuard;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Adrien Baron
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public final class RouteConfig extends JsObject
{
    @JsProperty private String path;
    @JsProperty private String name;
    @JsProperty private Object component;
    @JsProperty private JsObject components;
    @JsProperty private Object redirect;
    @JsProperty private Object alias;
    @JsProperty private JsArray<RouteConfig> children;
    @JsProperty private Object meta;
    @JsProperty private NavigationGuard beforeEnter;
    @JsProperty private Object props;
    @JsProperty private boolean caseSensitive;
    @JsProperty private PathToRegexpOptions pathToRegexpOptions;

    @JsOverlay
    public static <T extends VueComponent> RouteConfig of(String path, Class<T> componentClass)
    {
        return of(path, VueGWT.getFactory(componentClass));
    }

    @JsOverlay
    public static <T extends VueComponent> RouteConfig of(String path,
        VueFactory<T> componentFactory)
    {
        return of(path, componentFactory.getJsConstructor());
    }

    @JsOverlay
    public static <T extends VueComponent> RouteConfig of(String path,
        VueJsConstructor<T> componentJsConstructor)
    {
        return new RouteConfig().setPath(path).setComponent(componentJsConstructor);
    }

    @JsOverlay
    public static <T extends VueComponent> RouteConfig of(String name, String path,
        Class<T> componentClass)
    {
        return of(path, componentClass).setName(name);
    }

    @JsOverlay
    public static <T extends VueComponent> RouteConfig of(String name, String path,
        VueFactory<T> componentFactory)
    {
        return of(path, componentFactory).setName(name);
    }

    @JsOverlay
    public static <T extends VueComponent> RouteConfig of(String name, String path,
        VueJsConstructor<T> componentJsConstructor)
    {
        return of(path, componentJsConstructor).setName(name);
    }

    @JsOverlay
    public final String getPath()
    {
        return path;
    }

    @JsOverlay
    public final RouteConfig setPath(String path)
    {
        this.path = path;
        return this;
    }

    @JsOverlay
    public final String getName()
    {
        return name;
    }

    @JsOverlay
    public final RouteConfig setName(String name)
    {
        this.name = name;
        return this;
    }

    @JsOverlay
    public final Object getComponent()
    {
        return component;
    }

    @JsOverlay
    public final RouteConfig setComponent(Object component)
    {
        this.component = component;
        return this;
    }

    @JsOverlay
    public final JsObject getComponents()
    {
        return components;
    }

    @JsOverlay
    public final RouteConfig setComponents(JsObject components)
    {
        this.components = components;
        return this;
    }

    @JsOverlay
    public final <T extends VueComponent> RouteConfig addComponent(String id,
        Class<T> componentClass)
    {
        return this.addComponent(id, VueGWT.getFactory(componentClass));
    }

    @JsOverlay
    public final <T extends VueComponent> RouteConfig addComponent(String id,
        VueFactory<T> componentFactory)
    {
        return this.addComponent(id, componentFactory.getJsConstructor());
    }

    @JsOverlay
    public final <T extends VueComponent> RouteConfig addComponent(String id,
        VueJsConstructor<T> componentJsConstructor)
    {
        if (this.components == null)
            this.components = new JsObject();

        this.components.set(id, componentJsConstructor);
        return this;
    }

    @JsOverlay
    public final Object getRedirect()
    {
        return redirect;
    }

    @JsOverlay
    public final RouteConfig setRedirect(Object redirect)
    {
        this.redirect = redirect;
        return this;
    }

    @JsOverlay
    public final Object getAlias()
    {
        return alias;
    }

    @JsOverlay
    public final RouteConfig setAlias(Object alias)
    {
        this.alias = alias;
        return this;
    }

    @JsOverlay
    public final JsArray<RouteConfig> getChildren()
    {
        return children;
    }

    @JsOverlay
    public final RouteConfig setChildren(JsArray<RouteConfig> children)
    {
        this.children = children;
        return this;
    }

    @JsOverlay
    public final RouteConfig addChild(RouteConfig child)
    {
        if (this.children == null)
            this.children = new JsArray<>();

        this.children.push(child);
        return this;
    }

    @JsOverlay
    public final Object getMeta()
    {
        return meta;
    }

    @JsOverlay
    public final RouteConfig setMeta(Object meta)
    {
        this.meta = meta;
        return this;
    }

    @JsOverlay
    public final NavigationGuard getBeforeEnter()
    {
        return beforeEnter;
    }

    @JsOverlay
    public final RouteConfig setBeforeEnter(NavigationGuard beforeEnter)
    {
        this.beforeEnter = beforeEnter;
        return this;
    }

    @JsOverlay
    public final Object getProps()
    {
        return props;
    }

    @JsOverlay
    public final RouteConfig setProps(Object props)
    {
        this.props = props;
        return this;
    }

    @JsOverlay
    public final boolean isCaseSensitive()
    {
        return caseSensitive;
    }

    @JsOverlay
    public final RouteConfig setCaseSensitive(boolean caseSensitive)
    {
        this.caseSensitive = caseSensitive;
        return this;
    }

    @JsOverlay
    public final PathToRegexpOptions getPathToRegexpOptions()
    {
        return pathToRegexpOptions;
    }

    @JsOverlay
    public final RouteConfig setPathToRegexpOptions(PathToRegexpOptions pathToRegexpOptions)
    {
        this.pathToRegexpOptions = pathToRegexpOptions;
        return this;
    }
}
