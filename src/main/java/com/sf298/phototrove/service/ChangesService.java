package com.sf298.phototrove.service;

import com.sf298.phototrove.model.Change;

import java.util.List;

public interface ChangesService {

    List<Change> findAll();

    List<Change> findAllByPhotoId(long photoId);

}
