package com.viniciuszanoli.hrworker.repositories;

import com.viniciuszanoli.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
