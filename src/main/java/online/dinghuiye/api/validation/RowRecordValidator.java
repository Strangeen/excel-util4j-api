package online.dinghuiye.api.validation;

import online.dinghuiye.api.entity.Process;
import online.dinghuiye.api.entity.ResultStatus;
import online.dinghuiye.api.entity.RowRecord;

import java.util.List;

/**
 * <p>{@link RowRecord}验证接口</p>
 * <p>验证不通过需要改变rowRecord的状态</p>
 *
 * @author Strangeen on 2017/8/3
 *
 * @author Strangeen on 2017/9/3
 * @version 2.1.0
 */
public interface RowRecordValidator {

    /**
     * 验证{@link RowRecord}集合
     *
     * @param rowRecordList {@link RowRecord}集合
     * @param process 进度对象
     * @return true - 所有RowRecord验证成功{@link ResultStatus#SUCCESS}<br>
     *         false - 至少有一个RowRecord验证失败{@link ResultStatus}
     */
    boolean valid(List<RowRecord> rowRecordList, Process process);

    /**
     * 验证{@link RowRecord}个体
     *
     * @param rowRecord {@link RowRecord}
     * @return true - 所有RowRecord验证成功{@link ResultStatus#SUCCESS}<br>
     *         false - 至少有一个RowRecord验证失败{@link ResultStatus}
     */
    boolean valid(RowRecord rowRecord);

}
