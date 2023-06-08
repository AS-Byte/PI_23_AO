package com.pidevesprit.marcheimmobilierbackend.Services.Interfaces;

import java.util.List;

import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.React;

public interface IReactService {
	List<React> getAllReact();
	React getReact(Long reactId);
	React addReact(React rc);
	void deleteReact(Long reactId);
	React updateReact(React rc);
}
