package com.example.ecommweb.ImplServices;

import com.example.ecommweb.model.Categorie;
import com.example.ecommweb.repositories.CategorieRepositorie;
import com.example.ecommweb.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieImplService implements CategorieService {

    @Autowired
    private CategorieRepositorie categorieRepositorie;

    @Override
    public Categorie createCategorie(Categorie categorie) {
        return categorieRepositorie.save(categorie);
    }

    @Override
    public List<Categorie> getAllCategories() {
        return categorieRepositorie.findAll();
    }

    @Override
    public Optional<Categorie> getCategorie(Long id) {
        return categorieRepositorie.findById(id);
    }

    @Override
    public Categorie updateCategorie(Long id, Categorie newCategorieData) {
        return categorieRepositorie.findById(id)
                .map(categorie -> {
                    categorie.setNomcategorie(newCategorieData.getNomcategorie());
                    categorie.setImagecategorie(newCategorieData.getImagecategorie());
                    return categorieRepositorie.save(categorie);
                })
                .orElseGet(() -> {
                    newCategorieData.setId(id);
                    return categorieRepositorie.save(newCategorieData);
                });
    }

    @Override
    public void deleteCategorie(Long id) {
        categorieRepositorie.deleteById(id);
    }
}
