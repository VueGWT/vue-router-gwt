package com.axellience.vueroutergwt.client;

/**
 * @author Adrien Baron
 */
public enum RouterMode
{
    HASH("hash"), HISTORY("history"), ABSTRACT("abstract");

    String value;

    RouterMode(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }

    public static RouterMode fromValue(String value)
    {
        if ("hash".equals(value))
            return RouterMode.HASH;
        if ("history".equals(value))
            return RouterMode.HISTORY;
        if ("abstract".equals(value))
            return RouterMode.ABSTRACT;

        return null;
    }
}
