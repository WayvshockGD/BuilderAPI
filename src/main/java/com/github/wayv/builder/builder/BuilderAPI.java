package com.github.wayv.builder.builder;

import com.github.wayv.builder.api.ApiConstructor;
import com.github.wayv.builder.interfaces.IContext;

public class BuilderAPI extends ApiConstructor {
    BuilderAPI() {
        super();
    }

    @Override
    public void runApiMethod(IContext ctx) {
        ctx.send("Running builder api...");
    }
}
