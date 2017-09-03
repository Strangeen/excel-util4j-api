package online.dinghuiye.api.persistence;

import online.dinghuiye.api.entity.Process;
import online.dinghuiye.api.entity.RowRecord;

import java.util.List;

/**
 * 持久化前对数据进行修正，如：密码MD5加密等
 *
 * @author Strangeen on 2017/08/11
 *
 * @author Strangeen on 2017/9/3
 * @version 2.1.0
 */
public interface RowRecordPerPersistentRepairer {

    /**
     * 对即将持久化的{@lind RowRecord}集合类型修正
     *
     * @param rowRecordList {@lind RowRecord}集合
     * @param process 进度对象<br>
     *                如果希望更精确的展示进度，可以操作该对象方法{@link Process#updateProcess(long)}，传入进度增量即可<br>
     *                谨慎操作进度，如果操作错误程序会在持久化前修正，但是可能导致进度展示出现错误
     */
    void repaire(List<RowRecord> rowRecordList, Process process);
}
