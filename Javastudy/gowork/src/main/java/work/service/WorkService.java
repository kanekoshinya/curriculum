package work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.entity.WorkEntity;
import work.repository.WorkRepository;

@Service
public class WorkService {
	@Autowired WorkRepository workRepository;
	public void save(String name,String attendance,String leave) {
		WorkEntity workEntity = new WorkEntity();
		workEntity.setName(name);
//		workEntity.setData(data);
		workEntity.setAttendance(attendance);
		workEntity.setLeave(leave);
		workRepository.save(workEntity);
  }



}
