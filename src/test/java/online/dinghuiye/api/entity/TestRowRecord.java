package online.dinghuiye.api.entity;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Strangeen
 * on 2017/08/10
 */
public class TestRowRecord {

    @Test
    public void testGetterSetterStringKey() {

        RowRecord rr = new RowRecord();
        rr.set("test", "test");
        Assert.assertEquals("test", rr.get("test"));

    }

    @Test
    public void testGetterSetterClassKey() {

        RowRecord rr = new RowRecord();
        rr.set(RowRecord.class, rr);
        Assert.assertEquals(rr, rr.get(RowRecord.class));

    }

    @Test
    public void testResultStatus() {

        RowRecord rr = new RowRecord();
        rr.setResult(new RowRecordHandleResult(ResultStatus.NOATTEPT, null));
        Assert.assertEquals(ResultStatus.NOATTEPT, rr.getResult().getResult());

    }

    @Test
    public void testResultMsg() {

        RowRecordHandleResult res = new RowRecordHandleResult(ResultStatus.NOATTEPT, "test");
        RowRecordHandleResult res2 = res.setMsg("test1");
        Assert.assertEquals("test1", res2.getMsg());

    }

}
