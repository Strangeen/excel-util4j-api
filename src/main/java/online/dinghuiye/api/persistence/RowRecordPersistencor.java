package online.dinghuiye.api.persistence;


import online.dinghuiye.api.entity.Process;
import online.dinghuiye.api.entity.RowRecord;
import online.dinghuiye.api.entity.TransactionMode;

import java.util.List;

/**
 * pojo对象持久化接口
 *
 * @author Strangeen on 2017/8/4
 *
 * @author Strangeen on 2017/9/3
 * @version 2.1.0
 */
public interface RowRecordPersistencor {

    /**
     * 带进度观察者的持久化方法
     * @param rowRecordList {@link RowRecord}带持久化集合
     * @param process 进度对象
     */
    void persist(List<RowRecord> rowRecordList, TransactionMode mode, Process process);

    /**
     * 持久化方法
     * @param rowRecordList {@link RowRecord}带持久化集合
     * @param mode 事务形式，参见{@link TransactionMode}
     */
    void persist(List<RowRecord> rowRecordList, TransactionMode mode);

    //void persist(RowRecord rowRecord);
}
