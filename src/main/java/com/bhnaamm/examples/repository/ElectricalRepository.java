package com.bhnaamm.examples.repository;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ElectricalRepository extends CarRepository{
}
