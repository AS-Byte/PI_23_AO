package com.pidevesprit.marcheimmobilierbackend.Services.Interfaces;

import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.Annonce;
import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.RDV;

import java.util.List;

public interface IAnnonceService {
    Annonce addAnnonce(Annonce anc);
    Annonce updateAnnonce(Annonce anc);

    void deleteAnnonce(Annonce anc);
    void deleteAnnonce(Long id);
    List<Annonce> findAllAnnonce();
    Annonce findAnnonceyId(Long id);
}
