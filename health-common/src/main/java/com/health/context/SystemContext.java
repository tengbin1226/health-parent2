package com.health.context;

/**
 * 分页配置
 */
public class SystemContext {

    //定义当前页码和每页显示的记录数的局部变量
    private static ThreadLocal<Integer> pageNumThreadLocal = new ThreadLocal<Integer>();
    private static ThreadLocal<Integer> pageSizeThreadLocal = new ThreadLocal<Integer>();
    
    public static void setPageNum(Integer pageNum) {
        if (pageNum == null || pageNum <= 0) {
            pageNumThreadLocal.set(Constants.DEFAULT_pageNum);
        } else {
            pageNumThreadLocal.set(pageNum);
        }
    }

    public static Integer getPageNum() {
        return pageNumThreadLocal.get();
    }

    public static void setPageSize(Integer pageSize) {
        if (pageSize == null || pageSize <= 0) {
            pageSizeThreadLocal.set(Constants.DEFAULT_pageSize);
        } else {
            pageSizeThreadLocal.set(pageSize);
        }
    }

    public static Integer getPageSize() {
        return pageSizeThreadLocal.get();
    }

}
