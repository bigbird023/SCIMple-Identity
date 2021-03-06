package edu.psu.swe.scim.server.provider.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import edu.psu.swe.scim.server.provider.extensions.ProcessingExtension;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Inherited
@Repeatable(ProcessingExtensions.class)
public @interface ScimProcessingExtension {
  
  Class<? extends ProcessingExtension >[] value();
}
