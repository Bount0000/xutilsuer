package com.example.lenovo.xutilsuer;

/**
 * Created by lenovo on 2017/8/29.
 */

public class MyBean {
    private String title;
    private String pic;

    @Override
    public String toString() {
        return "MyBean{" +
                "title='" + title + '\'' +
                ", pic='" + pic + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public MyBean() {

    }

    public MyBean(String title, String pic) {

        this.title = title;
        this.pic = pic;
    }
}
