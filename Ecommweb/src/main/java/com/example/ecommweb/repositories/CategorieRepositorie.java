package com.example.ecommweb.repositories;
import com.example.ecommweb.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepositorie extends JpaRepository<Categorie,Long> {
}
