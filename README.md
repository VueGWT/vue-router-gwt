# Vue Router GWT

A JsInterop wrapper for [Vue Router](https://github.com/vuejs/vue-router) and [Vue GWT](https://axellience.github.io/vue-gwt/).

This wrapper allows you to use [Vue Router](https://github.com/vuejs/vue-router) in [Vue GWT](https://axellience.github.io/vue-gwt/) apps.

## How to Set It Up

Make sure you have [set up your Vue GWT project](https://axellience.github.io/vue-gwt/project-setup.html).

Then follow these steps:

**✅ Clone This Repo And Install Locally**

For now there is no Maven repository.

You must clone the source on your computer and mvn install them:

```bash
git clone https://github.com/Axellience/vue-router-gwt.git
cd vue-router-gwt
mvn clean install
```

**✅ Add the Maven Dependency**

```xml
<properties>
    ...
    <vue-router-gwt.version>0.1-SNAPSHOT</vue-router-gwt.version>
    ...
</properties>

<dependencies>
    ...
    <dependency>
        <groupId>com.axellience</groupId>
        <artifactId>vue-router-gwt</artifactId>
        <version>${vue-router-gwt.version}</version>
    </dependency>
    ...
</dependencies>
```

**✅ Add Vue Router JS Dependency to Your `index.html`**

```html
<script src="https://unpkg.com/vue-router/dist/vue-router.js"></script>
```

## How to Use It

Let's see a simple example.
We have an application with a `RootComponent` and we want to set up routing for two Components: `FooComponent` and `BarComponent`.

### Foo and Bar Components

**`FooComponent`**

```java
@Component
public class FooComponent extends VueComponent {
    @Override
    public void created() {}
}
```

```html
<div>Hello from Foo!</div>
```

**`BarComponent`**

```java
@Component
public class BarComponent extends VueComponent {
    @Override
    public void created() {}
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
@Component
public class RootComponent extends VueComponent{
    @Override
    public void created() {}

    @Override
    public void customizeOptions(VueComponentOptions componentOptions)
    {
        // We first create an object to hold our Router options
        RouterOptions routerOptions = new RouterOptions();
        
        // We add the routes to our options by passing
        // their path and the class from the Component to Instantiate on them
        routerOptions
            .addRoute(new RouteConfig("/foo", FooComponent.class))
            .addRoute(new RouteConfig("/bar", BarComponent.class));

        // We the create our router
        VueRouter vueRouter = new VueRouter(routerOptions);
        
        // And set it on our Component options
        componentOptions.set("router", vueRouter);
    }
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