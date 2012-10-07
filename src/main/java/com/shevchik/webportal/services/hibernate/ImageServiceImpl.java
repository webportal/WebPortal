package com.shevchik.webportal.services.hibernate;

import com.shevchik.webportal.domain.Image;
import com.shevchik.webportal.domain.Item;
import com.shevchik.webportal.repository.ImageRepository;
import com.shevchik.webportal.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/7/12
 * Time: 9:18 AM
 */

@Service("imageService")
@Repository
@Transactional
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public void addImage(Image image) {
        imageRepository.save(image);
    }

    @Override
    public void deleteImage(Image image) {
        imageRepository.delete(image);
    }

    @Override
    public Image findById(int id) {
        return imageRepository.findOne(id);
    }

    @Override
    public List<Image> getImagesForItem(Item item) {
        return imageRepository.getImagesForItem(item);
    }
}
