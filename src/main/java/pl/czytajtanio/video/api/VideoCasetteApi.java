package pl.czytajtanio.video.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.czytajtanio.video.dao.entity.VideoCassette;
import pl.czytajtanio.video.manager.VideoCassetteManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/cassetts")
public class VideoCasetteApi {

    private VideoCassetteManager videoCassetteManager;

    @Autowired
    public VideoCasetteApi(VideoCassetteManager videoCassetteManager) {
        this.videoCassetteManager = videoCassetteManager;
    }

    @GetMapping("/all")
    public Iterable<VideoCassette> getAll() {
        return videoCassetteManager.findAll();
    }

    @GetMapping
    public Optional<VideoCassette> getById(@RequestParam Long id) {
        return videoCassetteManager.findById(id);
    }

    @PostMapping
    public VideoCassette addVideo(@RequestBody VideoCassette videoCassette) {
       return videoCassetteManager.save(videoCassette);
    }

    @PutMapping
    public VideoCassette updateVideo(@RequestBody VideoCassette videoCassette) {
        return videoCassetteManager.save(videoCassette);
    }

    @DeleteMapping
    public void deleteVideo(@RequestParam Long id) {
        videoCassetteManager.deleteById(id);
    }



}
