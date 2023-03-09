package fr.insy2s.gestionincubateur.annotation;


import fr.insy2s.gestionincubateur.annotation.validator.PasswordConstraintsValidator;
import jakarta.validation.Constraint;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordConstraintsValidator.class)
public @interface Password {

    String message() default "Password should be valid ";

    Class[] groups() default {};

    Class[] payload() default {};
}
