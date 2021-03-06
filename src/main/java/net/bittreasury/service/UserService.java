package net.bittreasury.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.bittreasury.entity.User;
import net.bittreasury.repository.UserRepository;

public interface UserService {
	
	List<User> getUsersByTeamId(Integer teamId);
	
}
