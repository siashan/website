package com.web.site.common.support.validator.constraints;

import com.web.site.common.support.validator.constraintvalidators.IsMobileValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 手机号校验
 *
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/10/25 11:15
 * @Modified By:
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(
        validatedBy = {IsMobileValidator.class}
)
public @interface IsMobile {
    boolean required() default true;//是否校验

    String message() default "手机号格式错误"; // 约束注解验证时的输出消息

    Class<?>[] groups() default { };// 约束注解在验证时所属的组别

    Class<? extends Payload>[] payload() default { };// 约束注解的有效负载
}
