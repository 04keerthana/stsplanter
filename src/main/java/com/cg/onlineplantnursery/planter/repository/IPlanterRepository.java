package com.cg.onlineplantnursery.planter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.cg.onlineplantnursery.planter.entity.Planter;

public interface IPlanterRepository extends JpaRepositoryImplementation<Planter, Integer> {

	List<Planter> getPlanterByTypesOfPlanters(String typesOfPlanters);

//	List<Planter> getPlanterByName(String plantName);

}
