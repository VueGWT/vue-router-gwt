# Vue Router GWT

A JsInterop wrapper for [Vue Router](https://github.com/vuejs/vue-router) to use in [Vue GWT](https://axellience.github.io/vue-gwt/).

This wrapper allows you to use [Vue Router](https://github.com/vuejs/vue-router) in [Vue GWT](https://axellience.github.io/vue-gwt/) apps.

## How to Set It Up

Make sure you have [set up your Vue GWT project](https://axellience.github.io/vue-gwt/project-setup.html).

Then follow these steps:

**✅ Add the Maven Dependency**

```xml
<project>
    <dependencies>
        ...
        <dependency>
            <groupId>com.axellience</groupId>
            <artifactId>vue-router-gwt</artifactId>
            <version>1.0-beta-2</version>
        </dependency>
    </dependencies>
</project>
```

**✅ Add the GWT dependency**

Add this in your app `.gwt.xml` file:

```xml
<inherits name='com.axellience.vueroutergwt.VueRouterGwt'/>
```

**✅ Call VueRouter.init()**

This will inject the javascript of VueRouter in your page.
You should do it right under your `Vue.init()`.

```java
Vue.init();
VueRouter.init();
```

If you already have the VueRouter javascript included in your page by another way, you don't have to call `VueRouter.init()`.

## How to Use It

Let's see a simple example.
We have an application with a `RootComponent` and we want to set up routing for two Components: `FooComponent` and `BarComponent`.

### Foo and Bar Components

**`FooComponent`**

```java
@Component
public class FooComponent extends VueComponent {
}
```

```html
<div>Hello from Foo!</div>
```

**`BarComponent`**

```java
@Component
public class BarComponent extends VueComponent {
}
```

```html
<div>Hello from Bar!</div>
```

### RootComponent

Ok this Component is going to be a little more interesting.

```html
<div>
    <h1>Hello App!</h1>
    <p>
        <router-link to="/foo">Go to Foo</router-link>
        <router-link to="/bar">Go to Bar</router-link>
    </p>
    <router-view></router-view>
</div>
```

`router-link` Components above in the template will be replaced by `a` elements at runtime.
`router-view` will contain the Component for the active route (either `FooComponent` or `BarComponent`).

Let's see how we declare our routes:

```java
// First, we declare a class to configure the routing and register it on some component options
public class RoutesConfig implements CustomizeOptions {
    @Override
    public void customizeOptions(VueComponentOptions componentOptions)
    {
        // We first create an object to hold our Router options
        RouterOptions routerOptions = new RouterOptions();
        
        // We add the routes to our options by passing
        // their path and the Constructor of the Component we want to display on them
        routerOptions
            .addRoute("/foo", FooComponent.class)
            .addRoute("/bar", BarComponent.class);

        // We the create our router
        VueRouter vueRouter = new VueRouter(routerOptions);
        
        // And set it on our Component options
        componentOptions.set("router", vueRouter);
    }
}
```

```java
// Then we bind this class to our RootComponent so it customize it's options
@Component(customizeOptions = RoutesConfig.class)
public class RootComponent extends VueComponent {
}
```

Easy, right?

If you want more documentation on the API you can checkout the [official Vue Router documentation](https://router.vuejs.org/).

## Who Made This?

<p align="center">
    Vue GWT is developed by the awesome people at<br/>
    <a href="https://www.genmymodel.com" target="_blank">
        <img src="https://axellience.github.io/vue-gwt/resources/images/GenMyModel-Logo-Black.png" alt="GenMyModel" height="50"/>
    </a>
</p>