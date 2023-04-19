package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//you can change where can annotation belong to 
//restricting the placecment of it

//if there is only 1 parameter we want to specify
//we don't need to wrap it in {}
@Target({ElementType.METHOD, ElementType.TYPE})

//we can change where is the annotication saved or not saved at all
@Retention(RetentionPolicy.RUNTIME)
public @interface Good {
    //annotation can only has instance variables
    //but NO method

    //we don't need to pass any parameter into 
    //our annotation if there is a default value
    String value() default "hello";
}
