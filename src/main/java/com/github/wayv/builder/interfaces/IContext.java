package com.github.wayv.builder.interfaces;

import com.github.wayv.builder.stores.StoreBuilder;

public interface IContext {
    Number getBuildTime();
    String getBarTime();
    StoreBuilder getStoreBuilder();
    public default void send(String content) {
        System.out.println(content);
    }
}
