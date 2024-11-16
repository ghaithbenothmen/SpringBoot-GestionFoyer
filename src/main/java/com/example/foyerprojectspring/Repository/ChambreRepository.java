package com.example.foyerprojectspring.Repository;

import com.example.foyerprojectspring.Entities.Chambre;
import com.example.foyerprojectspring.Entities.Reservation;
import com.example.foyerprojectspring.Entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {

    List<Chambre> findAllByTypeC(TypeChambre type);

    Chambre findChambreByNumeroChambre(Long numeroChambre);
}
