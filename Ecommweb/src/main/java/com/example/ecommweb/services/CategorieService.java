package com.example.ecommweb.services;

import com.example.ecommweb.model.Categorie;
import java.util.List;
import java.util.Optional;

public interface CategorieService {
    Categorie createCategorie(Categorie categorie);
    List<Categorie> getAllCategories();
    Optional<Categorie> getCategorie(Long id);
    Categorie updateCategorie(Long id, Categorie categorie);
    void deleteCategorie(Long id);
}
