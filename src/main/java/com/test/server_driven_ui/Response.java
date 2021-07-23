package com.test.server_driven_ui;

public class Response {
    private final Object layout;
    private final Object layoutData;

    public Response(Object layout, Object layoutData) {
        super();
        this.layout = layout;
        this.layoutData = layoutData;
    }

    public Object getLayout() {
        return layout;
    }

    public Object getLayoutData() {
        return layoutData;
    }
}
