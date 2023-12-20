package com.serkanyilmaz.week11;

import java.io.Serializable;
import java.util.Date;

public class Note implements Serializable {
    private String header;
    private Date date;
    private String filePath;

    public String getHeader() {
        return header;
    }

    public Date getDate() {
        return date;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
