package com.s3rg0sh4.playlist.service;

import com.s3rg0sh4.playlist.model.Video;
import com.s3rg0sh4.playlist.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoRepository videoRepository;

    @Override
    public Video saveVideo(Video video) {
        return videoRepository.save(video);
    }

    @Override
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    @Override
    public Optional<Video> getVideoById(int id) {
        return videoRepository.findById(id);
    }

    @Override
    public void removeVideoById(int id) {
        videoRepository.deleteById(id);
    }


}
