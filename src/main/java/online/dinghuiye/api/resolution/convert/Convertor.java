package online.dinghuiye.api.resolution.convert;

import java.lang.reflect.Field;
import java.util.Map;
import online.dinghuiye.api.annotation.convert.Convert;

/**
 * 转换器接口，自定义转换注解{@link Convert}的实现类都需要实现该接口
 *
 * @author Strangeen
 * on 2017/6/27
 */
public interface Convertor {

    /**
     * 将excel元数据转换为对应pojo属性类型的值
     * @param obj 需要转换的值，如果是excel元数据则为String
     * @param field pojo属性字段
     * @param excelRecordMap excel元数据map<表头名称, 单元格值>（预留参数）
     * @return 转换后的值
     */
    Object convert(Object obj, Field field, Map<String, Object> excelRecordMap);

    //<T> T getInstance();
}
