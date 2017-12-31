package com.band.mapChat.service;

import com.band.mapChat.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public abstract class BaseService<T> implements IBaseService<T>{

    @Autowired
    BaseRepository<T,Long> baseRepository;

    @Override
    public List<T> getList() {
        return baseRepository.findAll();
    }

    @Override
    public Page<T> getPageList(Pageable pageable) {
        return baseRepository.findAll(pageable);
    }

    @Override
    public T save(T t) {
        return baseRepository.save(t);
    }


    @Override
    public void delete(Long id) {
        baseRepository.delete(id);
    }


    @Override
    public void delete(T t) {
        baseRepository.delete(t);
    }

}

