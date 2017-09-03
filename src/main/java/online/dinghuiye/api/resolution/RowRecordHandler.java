package online.dinghuiye.api.resolution;

import online.dinghuiye.api.entity.Process;
import online.dinghuiye.api.entity.ResultStatus;
import online.dinghuiye.api.entity.RowRecord;

import java.util.List;
import java.util.Map;

/**
 * 解析excel源数据接口，包括数据转换，pojo实例创建
 *
 * @author Strangeen on 2017/6/27
 *
 * @author Strangeen on 2017/9/3
 * @version 2.1.0
 */
public interface RowRecordHandler {

    /**
     * 将excel数据convert，解析pojo，存入rowRocord
     *
     * @param rowRecordList 仅包含excel数据的rowRecord的list
     * @param process 进度对象
     * @param pojos 数据对应的pojo，
     *              值得注意的是：如果pojo并没有数据，并不能将pojo对象引用指向null，而是pojo对象中的属性均为null
     * @return true - 所有RowRecord解析成功{@link ResultStatus#SUCCESS}<br>
     *         false - 至少有一个RowRecord解析失败{@link ResultStatus}
     */
    boolean handle(List<RowRecord> rowRecordList, Process process, Class<?>... pojos);

    /**
     * 将excel数据convert，解析pojo，存入rowRocord
     *
     * @param rowRecord 仅包含excel数据的rowRecord
     * @param pojos 数据对应的pojo
     * @return true - 所有RowRecord解析成功{@link ResultStatus#SUCCESS}<br>
     *         false - 至少有一个RowRecord解析失败{@link ResultStatus}
     */
    boolean handle(RowRecord rowRecord, Class<?>... pojos);


    /**
     * 创建{@link RowRecord}，初始化基础数据
     *
     * @param excelRowData excel行数据
     * @param row excel行号
     * @return {@link RowRecord}对象
     */
    RowRecord rowRecordCreate(Map<String, Object> excelRowData, Integer row);
}
