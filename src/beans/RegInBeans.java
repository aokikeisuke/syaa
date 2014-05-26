package beans;

import java.util.ArrayList;

public class RegInBeans {
  
	  public static ArrayList<String> errorMessage(String lastname,String firstname,String lsubname,
			                                       String fsubname,String birthday,String place, String hobby,   String word){
		  ArrayList<String> list = new ArrayList<String>();
		  if(lastname.length() > 30 || firstname.length() > 30){
			  String error1 = "      !!\"姓\"・\"名\"       の入力文字数はそれぞれ３０文字までです";
			  list.add(error1);
		  }
		  if(lsubname.length() > 30 || fsubname.length() > 30){
			  String error2 = "!!\"フリガナ（性）\"・\"フリガナ（名）\"の入力文字数はそれぞれ３０文字までです";
			  list.add(error2);
		  }
		  if(place.length() > 200){
			  String error3 = "!!\"最寄り駅\"        の入力文字数は２００文字までです";
			  list.add(error3);
		  }
		  if(hobby.length() > 200){
			  String error4 = "!!\"趣味\"         の入力文字数は２００文字までです";
			  list.add(error4);
		  }
		  if(word.length() > 200){
			  String error5 = "!!\"一言お願いします\"     の入力文字数は２００文字までです";
			  list.add(error5);
		  }
		  
		  return list;
	  }

}
