package jp.co.sss.practice.p03.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p03.q02.form.FavoriteForm;

@Controller
public class Practice0302Controller {
	@RequestMapping(path = "/favorite/input")
	public String favoriteInput() {
		return "practice03/02/favorite_input";
	}

	@RequestMapping(path = "/favorite/result", method = RequestMethod.POST)
	public String sendPost(FavoriteForm favoriteForm) {
		System.out.println("==パラメータを受け取りました \n"
				+ "==果物 :" + favoriteForm.getFruit()
				+ "\n==スナック:" + favoriteForm.getSnack()
				+ "\n==スイーツ:" + favoriteForm.getSweet()
				+ "\n==おかず :" + favoriteForm.getSidedish());
		return "practice03/02/favorite_result";
	}
}
