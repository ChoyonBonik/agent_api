package com.example.testapi;

import java.util.List;

public class ApiResponse<T> {
    private List<T> data;

    public ApiResponse(List<T> data) {
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}