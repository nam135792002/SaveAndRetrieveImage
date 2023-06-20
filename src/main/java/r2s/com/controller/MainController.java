package r2s.com.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import r2s.com.dto.UserDTO;
import r2s.com.models.User;
import r2s.com.service.UserService;

@Controller
public class MainController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String viewIndex() {
		return "index";
	}
	
	@RequestMapping("/new")
	public String userRegister() {
		return "user_form";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("newUser") User user, 
							@RequestParam("fileUpload") CommonsMultipartFile fileUpload) throws IOException {
		user.setFileName(fileUpload.getOriginalFilename());
		user.setData(fileUpload.getBytes());
		userService.save(user);
		return "redirect:/";
	}
	
	@RequestMapping("/lists")
	public ModelAndView listUser() {
	    ModelAndView mv = new ModelAndView("list");
	    List<User> listUser = userService.findAll();
	    List<UserDTO> listUserDTO = new ArrayList<>();
	    for (User user : listUser) {
	    	UserDTO userDTO = new UserDTO();
	        userDTO.setId(user.getId());
	        userDTO.setUserName(user.getUserName());
	        userDTO.setPassWord(user.getPassWord());
	        userDTO.setFileName(user.getFileName());
	        userDTO.setData(user.getData());
	        listUserDTO.add(userDTO);
		}
	    for (UserDTO userDTO : listUserDTO) {
	        byte[] encodeBase64 = Base64.getEncoder().encode(userDTO.getData());
	        String base64Encoded = new String(encodeBase64, StandardCharsets.UTF_8);
	        userDTO.setBase64Image(base64Encoded);
	    }

	    mv.addObject("listUserDTOs", listUserDTO);
	    return mv;
	}

}
