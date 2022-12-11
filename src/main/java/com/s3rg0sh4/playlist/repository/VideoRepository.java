package com.s3rg0sh4.playlist.repository;

import com.s3rg0sh4.playlist.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {

}
