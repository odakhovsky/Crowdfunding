package com.crowd.dao;


import com.crowd.entity.Donate;

import java.util.List;

public interface DonateDAO {

    void insert(Donate donate);

    List<Donate> selectAll();

    Donate findById(int id);

    void delete(Donate donate);

    void update(Donate donate);
}