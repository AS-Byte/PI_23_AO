package com.pidevesprit.marcheimmobilierbackend.Services.Interfaces;

import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.Banque;
import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.Contrat;
import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.Tranche;
import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.TypePayement;

import java.util.Date;
import java.util.List;

public interface ITrancheService {

    //CRUD

    Tranche addTrancheEtAffecterAContrat(Long idContrat,Tranche tranche);
    Tranche updateTranche(Tranche tranche);
    void deleteTranche(Tranche tranche);
    void deleteTrancheById(Long id);
    List<Tranche> getAllTranches();
    Tranche getTrancheById(Long id);


    //Fonctions Avancées


    //Updating tranche aprés validation du payement
    Tranche updateTrancheAfterPayement(Long refpayement, Long idEcheance, Banque bank, TypePayement modePayement);






}
