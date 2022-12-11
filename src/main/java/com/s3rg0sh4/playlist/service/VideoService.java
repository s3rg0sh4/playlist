package com.s3rg0sh4.playlist.service;

import com.s3rg0sh4.playlist.model.Video;

import java.util.List;
import java.util.Optional;

public interface VideoService {
    public Video saveVideo(Video video);
    public List<Video> getAllVideos();
    public Optional<Video> getVideoById(int id);
    public void removeVideoById(int id);
}
