package ro.teamnet.zth.api.annotation;

/**
 * Created by Beatrice.Chiriac on 7/12/2017.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target(FIELD)
@Retention(RUNTIME)

public @interface Column {
    String name() default "";
}
