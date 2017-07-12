package com.axellience.vueroutergwt.client;

import jsinterop.annotations.JsProperty;

/**
 * @author Adrien Baron
 */
public class Position
{
    @JsProperty private int x;
    @JsProperty private int y;

    public Position(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}
