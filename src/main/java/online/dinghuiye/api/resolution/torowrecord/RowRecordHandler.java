package online.dinghuiye.api.resolution.torowrecord;

import online.dinghuiye.api.entity.ResultStatus;
import online.dinghuiye.api.entity.RowRecord;

import java.util.List;
import java.util.Map;

/**
 * 解析excel源数据接口，包括数据转换，pojo实例创建
 *
 * @author Strangeen
 * on 2017/6/27
 */
public interface RowRecordHandler {

    /**
     * 将excel数据convert，解析pojo，存入rowRocord
     *
     * @param rowRecordList 仅包含excel数据的rowRecord的list
     * @param pojos 数据对应的pojo
     * @return true - 所有RowRecord解析成功{@link ResultStatus#SUCCESS}<br>
     *         false - 至少有一个RowRecord解析失败{@link ResultStatus}
     */
    boolean handle(List<RowRecord> rowRecordList, Class<?>... pojos);

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
     * convert前创建rowRocord
     *
     * @param excelRowData excel每行的数据Map
     * @return {@link RowRecord}对象
     */
    RowRecord rowRecordCreate(Map<String, Object> excelRowData, Integer row);
    //RowRecord rowRecordCreate(Map<String, String> excelRowData, Integer row);
}
