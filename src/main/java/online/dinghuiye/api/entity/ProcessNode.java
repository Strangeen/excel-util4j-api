package online.dinghuiye.api.entity;

/**
 * 导入过程的节点枚举
 *
 * @author Strangeen on 2017/09/03
 * @version 2.1.0
 */
public enum ProcessNode {

    RESOLUTION, // 导入处于解析阶段
    VALIDATION, // 导入处于验证阶段
    REPAIRATION, // 导入处于修正阶段
    PERSISTENCE // 导入处于持久化阶段
}
