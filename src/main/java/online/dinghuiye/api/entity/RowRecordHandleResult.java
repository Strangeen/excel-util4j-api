package online.dinghuiye.api.entity;

/**
 * {@link RowRecord}的解析和检查结果
 *
 * @author Strangeen
 * on 2017/06/26
 */
public class RowRecordHandleResult {

	private ResultStatus result;

	// 当前实现：多条消息以";"分隔
	private String msg;

	public RowRecordHandleResult(ResultStatus result, String msg) {
		this.result = result;
		this.msg = msg;
	}

	public ResultStatus getResult() {
		return result;
	}

	public RowRecordHandleResult setResult(ResultStatus result) {
		this.result = result;
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public RowRecordHandleResult setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	@Override
	public String toString() {
		return "RowRecordHandleResult{" +
				"result=" + result +
				", msg='" + msg + '\'' +
				'}';
	}
}
