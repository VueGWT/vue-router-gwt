package com.axellience.vueroutergwt.client;

import com.axellience.vuegwt.client.Vue;
import com.axellience.vuegwt.client.component.options.VueComponentOptions;
import com.axellience.vuegwt.client.jsnative.jstypes.JsArray;
import com.axellience.vuegwt.client.vue.VueConstructor;
import com.axellience.vueroutergwt.client.functions.NavigationGuard;
import com.axellience.vueroutergwt.client.functions.RedirectOption;
import jsinterop.annotations.JsProperty;

/**
 * @author Adrien Baron
 */
public class RouteConfig
{
    @JsProperty private String path;
    @JsProperty private String name;
    @JsProperty private Object component;
    @JsProperty private Dictionary<Object> components;
    @JsProperty private Object redirect;
    @JsProperty private Object alias;
    @JsProperty private JsArray<RouteConfig> children;
    @JsProperty private Object meta;
    @JsProperty private NavigationGuard beforeEnter;
    @JsProperty private Object props;
    @JsProperty private boolean caseSensitive;
    @JsProperty private PathToRegexpOptions pathToRegexpOptions;

    public RouteConfig(String path)
    {
        this.path = path;
    }

    public RouteConfig(String path, VueConstructor<? extends Vue> vueConstructor)
    {
        this(path);
        this.setComponent(vueConstructor);
    }

    public String getPath()
    {
        return path;
    }

    public RouteConfig setPath(String path)
    {
        this.path = path;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public RouteConfig setName(String name)
    {
        this.name = name;
        return this;
    }

    public Object getComponent()
    {
        return component;
    }

    public RouteConfig setComponent(VueComponentOptions<? extends Vue> componentDefinition)
    {
        this.component = componentDefinition;
        return this;
    }

    public RouteConfig setComponent(VueConstructor<? extends Vue> componentDefinition)
    {
        this.component = componentDefinition;
        return this;
    }

    public Dictionary<Object> getComponents()
    {
        return components;
    }

    public RouteConfig addComponent(String name,
        VueComponentOptions<? extends Vue> componentDefinition)
    {
        if (this.components == null)
            this.components = new Dictionary<>();

        this.components.put(name, componentDefinition);
        return this;
    }

    public RouteConfig addComponent(String name,
        VueConstructor<? extends Vue> vueConstructor)
    {
        if (this.components == null)
            this.components = new Dictionary<>();

        this.components.put(name, vueConstructor);
        return this;
    }

    public Object getRedirect()
    {
        return redirect;
    }

    public void setRedirect(String redirect)
    {
        this.redirect = redirect;
    }

    public void setRedirect(RedirectOption redirect)
    {
        this.redirect = redirect;
    }

    public Object getAlias()
    {
        return alias;
    }

    public void setAlias(Object alias)
    {
        this.alias = alias;
    }

    public JsArray<RouteConfig> getChildren()
    {
        return children;
    }

    public void setChildren(JsArray<RouteConfig> children)
    {
        this.children = children;
    }

    public Object getMeta()
    {
        return meta;
    }

    public void setMeta(Object meta)
    {
        this.meta = meta;
    }

    public NavigationGuard getBeforeEnter()
    {
        return beforeEnter;
    }

    public void setBeforeEnter(NavigationGuard beforeEnter)
    {
        this.beforeEnter = beforeEnter;
    }

    public Object getProps()
    {
        return props;
    }

    public void setProps(Object props)
    {
        this.props = props;
    }

    public boolean isCaseSensitive()
    {
        return caseSensitive;
    }

    public void setCaseSensitive(boolean caseSensitive)
    {
        this.caseSensitive = caseSensitive;
    }

    public PathToRegexpOptions getPathToRegexpOptions()
    {
        return pathToRegexpOptions;
    }

    public void setPathToRegexpOptions(PathToRegexpOptions pathToRegexpOptions)
    {
        this.pathToRegexpOptions = pathToRegexpOptions;
    }
}
