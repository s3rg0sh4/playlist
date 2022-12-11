package com.s3rg0sh4.playlist.controller;

import com.s3rg0sh4.playlist.model.Video;
import com.s3rg0sh4.playlist.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @PostMapping("/add")
    public String add(@RequestBody Video video) {
        videoService.saveVideo(video);
        return video.toString();
    }

    @GetMapping("/list")
    public List<Video> list() {
        return  videoService.getAllVideos();
    }

//    @GetMapping("/get")
//    public String get(@RequestParam int id) {
//        Optional<Video> video = videoService.getVideoById(id);
//        if (video.isEmpty()) {
//            return "Video not found";
//        } else {
//            return video.get().toString();
//        }
//    }

    @DeleteMapping("delete")
    public String delete(@RequestParam int id) {
        videoService.removeVideoById(id);
        return "Video deleted";
    }
}
