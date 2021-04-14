package com.itheima._12自定义泛型接口;

public interface Date<E> {
    void add(E stu);
    void delete(E stu);
    void update(E stu);
    E query(int id);
}
