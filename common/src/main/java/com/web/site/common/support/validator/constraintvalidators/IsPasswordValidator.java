package com.web.site.common.support.validator.constraintvalidators;

import com.web.site.common.support.validator.ValidatorUtil;
import com.web.site.common.support.validator.constraints.IsMobile;
import com.web.site.common.support.validator.constraints.IsPassword;
import org.apache.commons.lang.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/10/25 11:24
 * @Modified By:
 */
public class IsPasswordValidator implements ConstraintValidator<IsPassword, String> {

    private boolean required = false;

    //初始化方法
    @Override
    public void initialize(IsPassword constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    //校验方法
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (required == false) {
            return ValidatorUtil.isPassword(value);
        } else {
            if (StringUtils.isEmpty(value)) {
                return true;
            }
            return ValidatorUtil.isPassword(value);
        }
    }
}
