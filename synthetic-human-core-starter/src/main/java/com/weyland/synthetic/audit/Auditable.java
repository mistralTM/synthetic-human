package com.weyland.synthetic.audit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)  // Аннотация применяется к методам
@Retention(RetentionPolicy.RUNTIME)  // Доступна в runtime через reflection
public @interface Auditable {
}