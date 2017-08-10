package online.dinghuiye.api.entity;

/**
 * 导入过程中的事务形式
 *
 * @author Strangeen
 * on 2017/8/7
 */
public enum TransactionMode {

    /**
     * 单条事务
     *  每一条要导入的数据在导入过程中各自保持原子性，即本条数据验证或导入失败不会影响其他数据的导入，<br>
     *  但如果本条数据验证失败就不会执行下一步（存储）
     */
    SINGLETON,
    /*
     * 整体事务
     *  所有要导入的数据在整个导入过程中整体保持原子性，<br>
     *  如果验证过程中有至少一条数据失败，整体均不进行下一步（存储），
     *  如果存储中有至少一条数据存储失败，整体均不会被存储
     */
    MULTIPLE

}
