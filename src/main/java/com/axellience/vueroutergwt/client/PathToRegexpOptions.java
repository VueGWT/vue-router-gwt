package com.axellience.vueroutergwt.client;

import jsinterop.annotations.JsProperty;

/**
 * @author Adrien Baron
 */
public class PathToRegexpOptions
{
    @JsProperty private boolean sensitive;
    @JsProperty private boolean strict;
    @JsProperty private boolean end;

    public PathToRegexpOptions(boolean sensitive, boolean strict, boolean end)
    {
        this.sensitive = sensitive;
        this.strict = strict;
        this.end = end;
    }

    public boolean isSensitive()
    {
        return sensitive;
    }

    public void setSensitive(boolean sensitive)
    {
        this.sensitive = sensitive;
    }

    public boolean isStrict()
    {
        return strict;
    }

    public void setStrict(boolean strict)
    {
        this.strict = strict;
    }

    public boolean isEnd()
    {
        return end;
    }

    public void setEnd(boolean end)
    {
        this.end = end;
    }
}
