package com.gmrodrigues.ooozereports.core.model;

public class ReportModel
{
    private final long id;
    private final String content;

    public ReportModel(long id, String content)
    {
        this.id = id;
        this.content = content;
    }

    public long getId()
    {
        return id;
    }

    public String getContent()
    {
        return content;
    }
}
