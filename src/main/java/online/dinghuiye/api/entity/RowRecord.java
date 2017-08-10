package online.dinghuiye.api.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>核心类</p>
 * <p>保存excel源数据、解析后的pojo实例、解析结果</p>
 *
 * @author Strangeen
 * on 2017/6/26
 */
public class RowRecord {

    /**
     * excel行号
     */
    private int rowNo;
    /**
     * 解析结果
     */
    private RowRecordHandleResult result;

    /**
     * excel源数据 Map&lt;表头名称, 单元格值&gt;
     */
    private Map<String, Object> excelRecordMap;
    /**
     * pojo实例 Map&lt;pojo class, pojo实例&gt;
     */
    private Map<Class<?>, Object> pojoRecordMap;

    public RowRecordHandleResult getResult() {
        return result;
    }

    public void setResult(RowRecordHandleResult result) {
        this.result = result;
    }

    public int getRowNo() {
        return rowNo;
    }

    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    public Map<String, Object> getExcelRecordMap() {
        return excelRecordMap;
    }

    public void setExcelRecordMap(Map<String, Object> excelRecordMap) {
        this.excelRecordMap = excelRecordMap;
    }

    public Map<Class<?>, Object> getPojoRecordMap() {
        return pojoRecordMap;
    }

    public void setPojoRecordMap(Map<Class<?>, Object> pojoRecordMap) {
        this.pojoRecordMap = pojoRecordMap;
    }

    /**
     * 写入源数据map
     *
     * @param key 表头名称
     * @param value 单元格值
     * @return map中对应key原有的值，如果没有值则返回null
     */
    public Object set(String key, Object value) {
        if (excelRecordMap == null) excelRecordMap = new HashMap<>();
        Object lastValue = excelRecordMap.get(key);
        excelRecordMap.put(key, value);
        return lastValue;
    }

    public Object get(String key) {
        if (excelRecordMap != null)
            return excelRecordMap.get(key);
        return null;
    }

    /**
     * 写入pojo实例map
     *
     * @param pojo pojo class
     * @param obj 实例对象
     * @return map中对应key原有的值，如果没有值则返回null
     */
    public Object set(Class<?> pojo, Object obj) {
        if (pojoRecordMap == null) pojoRecordMap = new HashMap<>();
        Object lastValue = pojoRecordMap.get(pojo);
        pojoRecordMap.put(pojo, obj);
        return lastValue;
    }

    @SuppressWarnings("unchecked")
    public <T> T get(Class<T> pojo) {
        if (pojoRecordMap != null)
            return (T) pojoRecordMap.get(pojo);
        return null;
    }

    @Override
    public String toString() {
        return "RowRecord{" +
                "rowNo=" + rowNo +
                ", result=" + result +
                ", excelRecordMap=" + excelRecordMap +
                ", pojoRecordMap=" + pojoRecordMap +
                '}';
    }
}