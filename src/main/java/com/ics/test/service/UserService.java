package com.ics.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ics.test.dto.DepartmentDTO;
import com.ics.test.dto.ResponseDTO;
import com.ics.test.dto.UserDTO;
import com.ics.test.entity.User;
import com.ics.test.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * this is used to register the new user
	 * 
	 * @param userData
	 * @author Vyom Gangwar
	 **/

	public ResponseEntity<String> register(User userdata) {
//		User newUser=mapper.map(userdata, User.class);
		User newUser = new User(userdata.getId(), userdata.getFirstName(), userdata.getLastName(), userdata.getEmail(),
				userdata.getDepartmentId());
		repository.save(newUser);
		return ResponseEntity.ok("user saved" + newUser);
	}

	/**
	 * this function is used to find the list of user and list of department. we use
	 * restTemplate for communication between department microservice
	 * 
	 * @param Integer id
	 * @author Vyom Gangwar
	 * @return response object
	 * 
	 * 
	 **/
	public ResponseEntity<?> list(Integer id) {
		ResponseDTO response = new ResponseDTO();
		/**
		 * The RestTemplate will return a response object containing the data received
		 * from the target microservice, which you can then parse and process.
		 **/

		User user = repository.findById(id).get();
		UserDTO userdataDTO = new UserDTO(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail());
		response.setUserDTO(userdataDTO);
		String url = "http://localhost:8080/department/list/" + user.getDepartmentId();
		String url2="http://localhost:8080/user/open";
		/***
		 * the main difference between getForObject() and getForEntity() is the type of
		 * data returned. getForObject() returns the resource directly, while
		 * getForEntity() returns a ResponseEntity object that includes the resource and
		 * status code
		 * 
		 * ResponseEntity<DepartmentDTO> res=restTemplate.getForEntity(url,
		 * DepartmentDTO.class); System.out.println(res);
		 **/
		DepartmentDTO responseEntity = restTemplate.getForObject(url, DepartmentDTO.class);

		response.setDepartmentDTO(responseEntity);
		return ResponseEntity.ok(response);
	}

}
