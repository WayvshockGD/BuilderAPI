package com.github.wayv.builder.api;

import com.github.wayv.builder.interfaces.IContext;
import com.github.wayv.builder.stores.ApiStoreBuilder;

public class ApiConstructor {

    public ApiStoreBuilder<Object> stores;

    public ApiConstructor() {
        this.stores = new ApiStoreBuilder<>(60);
    }

    public void runApiMethod(IContext ctx) {}
}
