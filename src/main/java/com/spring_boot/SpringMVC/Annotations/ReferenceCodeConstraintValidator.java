package com.spring_boot.SpringMVC.Annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ReferenceCodeConstraintValidator implements ConstraintValidator<ReferenceCode,String> {
    private String prefix="";
    @Override
    public void initialize(ReferenceCode refCode) {
        prefix=refCode.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
      if(code!=null){
          if(code.startsWith(prefix)){
              return true;
          }
          return false;
      }
      return true;
    }
}
