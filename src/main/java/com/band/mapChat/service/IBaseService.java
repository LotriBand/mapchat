package com.band.mapChat.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBaseService<T> {

    List<T> getList();

    T save(T t);

    void delete(Long id);

    void delete(T t);

    Page<T> getPageList(Pageable pageable);



}
