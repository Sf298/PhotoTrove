package com.sf298.phototrove.repository;

import com.sf298.phototrove.model.Change;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChangesRepository extends JpaRepository<Change, Long> {

    List<Change> findAllByPhotoId(long photoId);

}
