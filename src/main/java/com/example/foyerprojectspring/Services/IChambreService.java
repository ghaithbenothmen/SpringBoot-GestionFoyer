package com.example.foyerprojectspring.Services;

import com.example.foyerprojectspring.Entities.Chambre;
import com.example.foyerprojectspring.Entities.TypeChambre;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IChambreService {
    Chambre addChambre(Chambre chambre);

    Chambre getChambreById(long idChambre);

    Chambre updateChambre(Chambre chambre);

    void deleteChambre(Chambre chambre);

    List<Chambre> getAllChambre();

    void deleteChambreById(long idChambre);

    List<Chambre> findAllByTypeChambre(TypeChambre typeChambre);

    Chambre findByNumeroChambre(Long numeroChambre);
}
