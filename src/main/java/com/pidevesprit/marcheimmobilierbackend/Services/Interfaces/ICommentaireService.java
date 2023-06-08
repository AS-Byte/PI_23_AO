package com.pidevesprit.marcheimmobilierbackend.Services.Interfaces;

import java.util.List;

import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.Commentaire;



public interface ICommentaireService {
	List<Commentaire> getAllCommentaire();
	Commentaire getCommentaire(Long commentaireId);
	Commentaire addCommentaire(Commentaire cm);
	void deleteCommentaire(Long commentaireId);
	Commentaire updateCommentaire(Commentaire cm);
}
