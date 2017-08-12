package online.dinghuiye.api.persistence;

import online.dinghuiye.api.entity.RowRecord;

import java.util.List;

/**
 * 持久化前对数据进行修正，如：密码MD5加密等
 *
 * @author Strangeen
 * on 2017/08/11
 */
public interface RowRecordPerPersistentRepairer {

    void repaire(List<RowRecord> rowRecordList);
}
