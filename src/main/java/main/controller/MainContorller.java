package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import main.service.MainService;

@Controller
@RequiredArgsConstructor
public class MainContorller {

	private final MainService service;
	
	// 메인 페이지로 이동하기
	@RequestMapping("")
	public String mainPage(){
		return "common/main";
	}
	
	
	
}
