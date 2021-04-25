package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.dao.ILandDao;
import com.cg.fms.dto.Land;

@Service
	public class LandServiceImpl implements LandService {


		@Autowired
		ILandDao ldao;

	@Override
	public Optional<Land> getLand(String surveyNumber) {
		return ldao.findById(surveyNumber);
	}

	@Override
	public Land addLand(Land land) {
		ldao.save(land);
		return null;
	}

	@Override
	public Land updateLand(Land land) {
		ldao.save(land);
		return null;
	}

	@Override
	public Land removeLandDetails(String surveyNumber) {
		ldao.deleteById(surveyNumber);
		return null;
	}

	@Override
	public List<Land> getAllLands() {
		return ldao.findAll();
	}

	}

