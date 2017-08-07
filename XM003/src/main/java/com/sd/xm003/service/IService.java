package com.sd.xm003.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by KF03 on 2017/7/22.
 */
@Service
public interface IService<T>{
    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);


//    //TODO 其他...
}
