package work.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import work.entity.WorkEntity;

public interface WorkRepository extends JpaRepository<WorkEntity, Integer>{

}