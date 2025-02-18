package Annotation.AdvancedLevel.CacheResultAnnotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.METHOD) // Can be applied only on methods
public @interface CacheResult {
}
