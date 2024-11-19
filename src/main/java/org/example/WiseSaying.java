package org.example;

import java.io.Serializable;

public class WiseSaying implements Serializable {
    private int id = 0;
    private String content;
    private String author;

    public WiseSaying(){

    }

    public WiseSaying(int id, String content, String author){
        this.id = id;
        this.content = content;
        this.author = author;
    }

//    public void setId(int id){
//        this.id = id;
//    }

    public void setContent(String content){
        this.content = content;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getId(){
        return id;
    }

    public String getContent(){
        return content;
    }

    public String getAuthor(){
        return author;
    }
}