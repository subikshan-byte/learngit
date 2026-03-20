package ecomerce.Newbuy.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ecomerce.Newbuy.model.ImageModel;
import ecomerce.Newbuy.repository.ImageRepository;

import java.io.File;
import java.io.IOException;

@Service
public class ImageService {

    @Value("${file.upload-dir}")
    private String uploadDir;

    private final ImageRepository repo;

    public ImageService(ImageRepository repo) {
        this.repo = repo;
    }
    public String uploadImage(MultipartFile file) throws IOException {

    // ✅ FIX: force correct project path
    String uploadPath = System.getProperty("user.dir") + "/" + uploadDir;

    // create folder if not exists
    File directory = new File(uploadPath);
    if (!directory.exists()) {
        directory.mkdirs();
    }

    // ✅ create unique file name (VERY IMPORTANT)
    String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();

    // file path
    String filePath = uploadPath + fileName;

    // save file
    file.transferTo(new File(filePath));

    // save to DB
    ImageModel image = new ImageModel();
    image.setFileName(fileName);
    image.setFilePath(filePath);

    repo.save(image);

    return "Image uploaded successfully at: " + filePath;
}
}