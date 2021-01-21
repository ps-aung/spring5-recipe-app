package psa.springframework.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import psa.springframework.domain.Recipe;
import psa.springframework.repositories.RecipeRepository;

import java.io.IOException;

@Slf4j
@Service
public class ImageServiceImpl implements ImageService{
    private final RecipeRepository recipeRepository;

    public ImageServiceImpl( RecipeRepository recipeService) {

        this.recipeRepository = recipeService;
    }

    @Override
    public void saveImageFile(Long recipeId, MultipartFile imageFile) {

        try {
            Recipe recipe = recipeRepository.findById(recipeId).get();

            Byte[] bytesObject = new Byte[imageFile.getBytes().length];
            int i=0;
            for (byte b : imageFile.getBytes()){
                bytesObject[i++] = b;
            }
            recipe.setImage(bytesObject);
            recipeRepository.save(recipe);
        }catch (IOException e){

            log.error("Error occured"+e);
            e.printStackTrace();
        }
    }
}
