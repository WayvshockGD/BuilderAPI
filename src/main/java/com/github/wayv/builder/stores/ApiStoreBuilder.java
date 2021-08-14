package com.github.wayv.builder.stores;

import com.github.wayv.builder.annotations.ClassMethod;
import com.github.wayv.builder.annotations.ClassPlacer;
import com.github.wayv.builder.exceptions.ExceptionBuilder;

import java.util.HashMap;

public class ApiStoreBuilder<V> {

    public Number max;
    public HashMap<String, V> map;

    @ClassPlacer(isEnabled=true)
    public ApiStoreBuilder(Number maxStores) {
        this.max = maxStores;
        this.map = new HashMap<String, V>();
    }

    @ClassMethod(name="setValue", description="Places a value inside the map.")
    public void setValue(String name, V value) throws Exception {
        if (value == null) {
            throw ExceptionBuilder.init("Value in method 'setValue()' is null");
        }

        this.map.put(name, value);
    }

    @ClassMethod(name="getValue", description="Gets a value from the map.")
    public void getValue(String key) throws Exception {
        if (key == null) {
            throw ExceptionBuilder.init("Key in method 'getValue()' is null.");
        }

        this.map.get(key);
    }
}
