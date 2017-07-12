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
}
