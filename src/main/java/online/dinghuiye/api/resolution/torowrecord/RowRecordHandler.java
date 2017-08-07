package online.dinghuiye.api.resolution.torowrecord;

import online.dinghuiye.api.entity.RowRecord;

import java.util.List;
import java.util.Map;

/**
 * Created by Strangeen on 2017/6/27.
 */
public interface RowRecordHandler {

    /**
     * 将excel数据convert，解析pojo，存入rowRocord
     * @param rowRecordList 仅包含excel数据的rowRecord的list
     * @param pojos 数据对应的pojo
     * @return rowRecord的list
     */
    List<RowRecord> handle(List<RowRecord> rowRecordList, Class<?>... pojos);

    /**
     * 将excel数据convert，解析pojo，存入rowRocord
     * @param rowRecord 仅包含excel数据的rowRecord
     * @param pojos 数据对应的pojo
     * @return rowRecord
     */
    RowRecord handle(RowRecord rowRecord, Class<?>... pojos);


    /**
     * convert前创建rowRocord
     * @param excelRowData
     * @return
     */
    RowRecord rowRecordCreate(Map<String, String> excelRowData, Integer row);


}
