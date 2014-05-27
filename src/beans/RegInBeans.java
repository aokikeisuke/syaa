package beans;

import java.util.ArrayList;

public class RegInBeans {
	private String lastname;
	private String firstname;
	private String lsubname;
	private String fsubname;
	private String place;
	private String hobby;
	private String word;
	
	
  
	  public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public void setLsubname(String lsubname) {
		this.lsubname = lsubname;
	}



	public void setFsubname(String fsubname) {
		this.fsubname = fsubname;
	}


	public void setPlace(String place) {
		this.place = place;
	}



	public void setHobby(String hobby) {
		this.hobby = hobby;
	}



	public void setWord(String word) {
		this.word = word;
	}



	public  ArrayList<String> checkStrLength(){
		
		
		  ArrayList<String> list = new ArrayList<String>();
		  
		  if(this.lastname.length() > 30 || this.firstname.length() > 30){
			  String error1 = "      !!\"姓\"・\"名\"       の入力文字数はそれぞれ３０文字までです";
			  list.add(error1);
		  }
		  if(this.lsubname.length() > 30 || this.fsubname.length() > 30){
			  String error2 = "!!\"フリガナ（性）\"・\"フリガナ（名）\"の入力文字数はそれぞれ３０文字までです";
			  list.add(error2);
		  }
		  if(place.length() > 100){
			  String error3 = "!!\"最寄り駅\"        の入力文字数は１００文字までです";
			  list.add(error3);
		  }
		  if(hobby.length() > 100){
			  String error4 = "!!\"趣味\"         の入力文字数は１００文字までです";
			  list.add(error4);
		  }
		  if(word.length() > 100){
			  String error5 = "!!\"一言お願いします\"     の入力文字数は１００文字までです";
			  list.add(error5);
		  }
		  
		  return list;
	  }

}
