package com.github.wayv.builder.annotations;

public @interface ClassMethod {
    String name() default "";
    String description();
    boolean depreciated() default false;
}
