package online.dinghuiye.api.persistence;


import online.dinghuiye.api.entity.RowRecord;
import online.dinghuiye.api.entity.TransactionMode;

import java.util.List;
import java.util.Observer;

/**
 * pojo对象持久化接口
 *
 * @author Strangeen
 * on 2017/8/4
 */
public interface RowRecordPersistencor {

    /**
     * 带进度观察者的持久化方法
     * @param rowRecordList {@link RowRecord}带持久化集合
     * @param processObserver 进度观察者
     */
    void persist(List<RowRecord> rowRecordList, TransactionMode mode, Observer processObserver);

    /**
     * 持久化方法
     * @param rowRecordList {@link RowRecord}带持久化集合
     * @param mode 事务形式，参见{@link TransactionMode}
     */
    void persist(List<RowRecord> rowRecordList, TransactionMode mode);

    //void persist(RowRecord rowRecord);
}
