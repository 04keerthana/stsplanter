package com.cg.onlineplantnursery.planter.service;

import java.util.List;

import com.cg.onlineplantnursery.exception.PlanterIdNotFoundException;
import com.cg.onlineplantnursery.planter.entity.Planter;

public interface IPlanterService {

	public Planter addPlanter(Planter planter);

	public Planter updatePlanter(int planterId) throws PlanterIdNotFoundException;

	public Planter deletePlanter(int planterId) throws PlanterIdNotFoundException;

	public Planter viewPlanter(int planterId) throws PlanterIdNotFoundException;

	public Planter viewPlanterShape(int planterShape) throws PlanterIdNotFoundException;

	public List<Planter> viewAllPlanters() throws PlanterIdNotFoundException;

	public List<Planter> viewAllPlanters(double minCost, double maxCost) throws PlanterIdNotFoundException;
	
//	public List<Planter> getPlanterByName(String plantName) throws PlanterIdNotFoundException;
	
	public List<Planter> getPlanterByTypesOfPlanters(String typesOfPlanters) throws PlanterIdNotFoundException;

	


}
