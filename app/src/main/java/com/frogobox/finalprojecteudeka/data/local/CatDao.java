package com.frogobox.finalprojecteudeka.data.local;

import com.frogobox.finalprojecteudeka.model.Cat;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * FinalProjectEudeka
 * Copyright (C) 15/03/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Line     : bullbee117
 * Phone    : 081357108568
 * Majors   : D3 Teknik Informatika 2016
 * Campus   : Telkom University
 * -----------------------------------------
 * id.amirisback.frogobox
 */
@Dao
public interface CatDao {
    @Query("SELECT * FROM all_cat")
    List<Cat> getCats();

    @Insert
    void insertCatData(List<Cat> data);
}
