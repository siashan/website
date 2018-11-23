package com.web.site.common.orm;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/11/21 10:04
 * @Modified By:
 */
public class Table implements Serializable {
    private long total;
    private List rows;

    public Table (){}

    public Table(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
