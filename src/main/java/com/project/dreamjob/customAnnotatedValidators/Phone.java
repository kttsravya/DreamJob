package com.project.dreamjob.customAnnotatedValidators;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

// to create custom validation need to perform two steps
// step 1: create an custom annotation that conforms with jsr 303 specs(so we wrote the following code)
//step 2: and write the validator class that implements constraintValidator<k,v>

@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {
 
     
    String message() default "enter valid phone number";
     
    Class<?>[] groups() default {};
     
    Class<? extends Payload>[] payload() default {};
      
}
