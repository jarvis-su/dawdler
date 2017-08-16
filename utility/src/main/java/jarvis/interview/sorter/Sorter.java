package jarvis.interview.sorter;

import java.util.Comparator;

/**
 * 下面按照策略模式给出一个排序系统，实现了冒泡、归并和快速排序。
 */
public interface Sorter {

    /**
     * 排序
     * @param list 待排序的数组
     */
    public <T extends Comparable<T>> void sort(T[] list);

    /**
     * 排序
     * @param list 待排序的数组
     * @param comp 比较两个对象的比较器
     */
    public <T> void sort(T[] list, Comparator<T> comp);
}
