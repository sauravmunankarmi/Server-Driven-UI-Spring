package com.test.server_driven_ui;

public class ExampleLayout {
    private String type;
    private String layout_width;
    private String layout_height;
    private String text;

    public ExampleLayout(String type, String layout_width, String layout_height, String text) {
        this.type = type;
        this.layout_width = layout_width;
        this.layout_height = layout_height;
        this.text = text;
    }

    public ExampleLayout() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLayout_width() {
        return layout_width;
    }

    public void setLayout_width(String layout_width) {
        this.layout_width = layout_width;
    }

    public String getLayout_height() {
        return layout_height;
    }

    public void setLayout_height(String layout_height) {
        this.layout_height = layout_height;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}


