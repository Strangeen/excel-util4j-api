package online.dinghuiye.api.validation;

import online.dinghuiye.api.annotation.validate.Validate;

import java.lang.reflect.Field;

/**
 * 验证器接口，自定义验证注解{@link Validate}的实现类都需要实现该接口
 *
 * @author Strangeen on 2017/08/15
 */
public interface Validator {

    /**
     * 自定义验证对象类，对象属性注解有{@Validate}的属性将被应用检验
     *
     * @param fieldValue 属性的值
     * @param field 属性Field
     * @param obj 被检验的对象
     * @param <T> 被检验对象类型
     * @return true - 验证成功<br>
     *         false - 验证失败，系统会将field与{@Validate#message()}建立映射到错误集中
     */
    <T> boolean validate(Object fieldValue, Field field, T obj);
}
