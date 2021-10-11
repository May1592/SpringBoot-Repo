package com.tripathi.validator;

import com.tripathi.bean.Taskform;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
@EnableWebMvc
public class TaskformValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return aClass== Taskform.class;
    }

    @Override
    public void validate(Object o, Errors errors) {
        Taskform taskform = (Taskform) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"taskId","NotEmpty.Taskform.taskId");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"taskTitle","NotEmpty.Taskform.taskTitle");
    }
}
