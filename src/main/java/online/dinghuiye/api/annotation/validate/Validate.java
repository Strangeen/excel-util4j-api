package online.dinghuiye.api.annotation.validate;

import online.dinghuiye.api.validation.Validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解hibernate validator无法完成的复杂的字段验证，如：关联验证，数据库验证
 *
 * @author Strangeen on 2017/08/15
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Validate {

    Class<? extends Validator> validator();

    String message() default "验证不通过";

}
