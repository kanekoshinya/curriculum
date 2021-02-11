package schoo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schoo1.repository.UserListRepository;

@Service
public class UserListService {
  @Autowired
  UserListRepository userListRepository;
}
