package com.sf298.phototrove.service.impl;

import com.sf298.phototrove.model.Change;
import com.sf298.phototrove.repository.ChangesRepository;
import com.sf298.phototrove.service.ChangesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChangesServiceImpl implements ChangesService {

    private ChangesRepository changesRepository;

    @Autowired
    public ChangesServiceImpl(ChangesRepository changesRepository) {
        this.changesRepository = changesRepository;
    }

    @Override
    public List<Change> findAll() {
        return changesRepository.findAll();
    }

    @Override
    public List<Change> findAllByPhotoId(long photoId) {
        return changesRepository.findAllByPhotoId(photoId);
    }

}
