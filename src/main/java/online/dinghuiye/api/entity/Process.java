package online.dinghuiye.api.entity;

import java.util.Observable;

/**
 * 进度对象
 *
 * @author Strangeen on 2017/8/6
 *
 * @author Strangeen on 2017/9/3
 * @version 2.1.0
 */
public class Process extends Observable {

    private Long excuted;
    private Long total;
    private ProcessNode node;

    public Process(Long total) {
        this.excuted = 0L;
        this.total = total;
    }

    public Long getExcuted() {
        return excuted;
    }

    public void setExcuted(Long excuted) {
        this.excuted = excuted;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ProcessNode getNode() {
        return node;
    }

    public void setNode(ProcessNode node) {
        this.node = node;
    }

    /**
     * 获取进度
     *
     * @return 进度百分比，没有格式化小数位
     */
    public Double getProcess() {
        return Double.valueOf(excuted) / total * 100;
    }

    /**
     * 更新进度
     *
     * @param increment 增量
     */
    public void updateProcess(long increment) {
        this.setExcuted(excuted + increment);
        this.change();
    }


    public void change() {
        setChanged();
        notifyObservers(this);
    }
}
