package pl.czytajtanio.video.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.czytajtanio.video.dao.entity.VideoCassette;

@Repository
public interface VideoCassetteRepo extends CrudRepository<VideoCassette, Long> {
}
