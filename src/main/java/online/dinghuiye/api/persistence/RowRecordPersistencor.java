package online.dinghuiye.api.persistence;


import online.dinghuiye.api.entity.RowRecord;

import java.util.List;
import java.util.Observer;

/**
 * Created by Strangeen on 2017/8/4.
 */
public interface RowRecordPersistencor {

    void persist(List<RowRecord> rowRecordList, Observer processObserver);

    void persist(List<RowRecord> rowRecordList);

    void persist(RowRecord rowRecord);
}
