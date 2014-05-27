package beans;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RegInBeansTest {

	@Test
	public void 入力がすべてのフォームで制限いっぱいの３０文字＿返るエラー１つ() {
		//フォームに入力される文字列が３０文字と仮定
		StringBuilder str = new StringBuilder();
		for(int i = 0 ; i < 30 ; i++){
			str.append("あ");
		}
		
		//オブジェクトのパラメータに文字列をセット
		RegInBeans regben = new RegInBeans();
		String msg = new String(str);
		regben.setLastname(msg);
		regben.setFirstname(msg);
		regben.setLsubname(msg);
		regben.setFsubname(msg);
		regben.setPlace(msg);
		regben.setHobby(msg);
		regben.setWord(msg);
		
		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
		ArrayList<String> list = regben.checkStrLength();
		
		//エラーメッセージの数が正しいかをチェック
		int expected = 0;
		int actual = list.size();
		assertThat(actual, is(expected));
	}
    @Test
	public void lastnameの文字数のみ３１文字以上＿返るエラー１つ() {
    	//フォームに入力される文字列が３０文字と仮定
		StringBuilder str = new StringBuilder();
		for(int i = 0 ; i < 30 ; i++){
			str.append("あ");
		}
		
		//フォームに入力される文字列が３１文字と仮定
		StringBuilder lastname = new StringBuilder();
		for(int i = 0 ; i < 31 ; i++){
			lastname.append("あ");
		}
		
		//オブジェクトのパラメータに文字列をセット
		RegInBeans regben = new RegInBeans();
		String msg = new String(str);
		String lastnameNum = new String(lastname);
		regben.setLastname(lastnameNum);
		regben.setFirstname(msg);
		regben.setLsubname(msg);
		regben.setFsubname(msg);
		regben.setPlace(msg);
		regben.setHobby(msg);
		regben.setWord(msg);
		
		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
		ArrayList<String> list = regben.checkStrLength();
		
		//エラーメッセージの数が正しいかをチェック
		int expected = 1;
		int actual = list.size();
		assertThat(actual, is(expected));
	}
    
    
    @Test
	public void firstnameの文字数のみ３１文字以上＿返るエラー１つ() {
    	//フォームに入力される文字列が３０文字と仮定
		StringBuilder str = new StringBuilder();
		for(int i = 0 ; i < 30 ; i++){
			str.append("あ");
		}
		
		//フォームに入力される文字列が３１文字と仮定
		StringBuilder firstname = new StringBuilder();
		for(int i = 0 ; i < 31 ; i++){
			firstname.append("あ");
		}
		
		//オブジェクトのパラメータに文字列をセット
		RegInBeans regben = new RegInBeans();
		String msg = new String(str);
		String firstnameNum = new String(firstname);
		regben.setLastname(msg);
		regben.setFirstname(firstnameNum);
		regben.setLsubname(msg);
		regben.setFsubname(msg);
		regben.setPlace(msg);
		regben.setHobby(msg);
		regben.setWord(msg);
		
		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
		ArrayList<String> list = regben.checkStrLength();
		
		//エラーメッセージの数が正しいかをチェック
		int expected = 1;
		int actual = list.size();
		assertThat(actual, is(expected));
	}
    
    @Test
   	public void lsubnameの文字数のみ３１文字以上＿返るエラー１つ() {
       	//フォームに入力される文字列が３０文字と仮定
   		StringBuilder str = new StringBuilder();
   		for(int i = 0 ; i < 30 ; i++){
   			str.append("あ");
   		}
   		
   		//フォームに入力される文字列が３１文字と仮定
   		StringBuilder lsubname = new StringBuilder();
   		for(int i = 0 ; i < 31 ; i++){
   			lsubname.append("あ");
   		}
   		
   		//オブジェクトのパラメータに文字列をセット
   		RegInBeans regben = new RegInBeans();
   		String msg = new String(str);
   		String lsubnameNum = new String(lsubname);
   		regben.setLastname(msg);
   		regben.setFirstname(msg);
   		regben.setLsubname(lsubnameNum);
   		regben.setFsubname(msg);
   		regben.setPlace(msg);
   		regben.setHobby(msg);
   		regben.setWord(msg);
   		
   		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
   		ArrayList<String> list = regben.checkStrLength();
   		
   		//エラーメッセージの数が正しいかをチェック
   		int expected = 1;
   		int actual = list.size();
   		assertThat(actual, is(expected));
   	}
    
    @Test
   	public void fsubnameの文字数のみ３１文字以上＿返るエラー１つ() {
       	//フォームに入力される文字列が３０文字と仮定
   		StringBuilder str = new StringBuilder();
   		for(int i = 0 ; i < 30 ; i++){
   			str.append("あ");
   		}
   		
   		//フォームに入力される文字列が３１文字と仮定
   		StringBuilder fsubname = new StringBuilder();
   		for(int i = 0 ; i < 31 ; i++){
   			fsubname.append("あ");
   		}
   		
   		//オブジェクトのパラメータに文字列をセット
   		RegInBeans regben = new RegInBeans();
   		String msg = new String(str);
   		String fsubnameNum = new String(fsubname);
   		regben.setLastname(msg);
   		regben.setFirstname(msg);
   		regben.setLsubname(msg);
   		regben.setFsubname(fsubnameNum);
   		regben.setPlace(msg);
   		regben.setHobby(msg);
   		regben.setWord(msg);
   		
   		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
   		ArrayList<String> list = regben.checkStrLength();
   		
   		//エラーメッセージの数が正しいかをチェック
   		int expected = 1;
   		int actual = list.size();
   		assertThat(actual, is(expected));
   	}
    
    @Test
   	public void placeの文字数のみ１０１文字以上＿返るエラー１つ() {
       	//フォームに入力される文字列が３０文字と仮定
   		StringBuilder str = new StringBuilder();
   		for(int i = 0 ; i < 30 ; i++){
   			str.append("あ");
   		}
   		
   		//フォームに入力される文字列が１０１文字と仮定
   		StringBuilder place = new StringBuilder();
   		for(int i = 0 ; i < 101 ; i++){
   			place.append("あ");
   		}
   		
   		//オブジェクトのパラメータに文字列をセット
   		RegInBeans regben = new RegInBeans();
   		String msg = new String(str);
   		String placeNum = new String(place);
   		regben.setLastname(msg);
   		regben.setFirstname(msg);
   		regben.setLsubname(msg);
   		regben.setFsubname(msg);
   		regben.setPlace(placeNum);
   		regben.setHobby(msg);
   		regben.setWord(msg);
   		
   		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
   		ArrayList<String> list = regben.checkStrLength();
   		
   		//エラーメッセージの数が正しいかをチェック
   		int expected = 1;
   		int actual = list.size();
   		assertThat(actual, is(expected));
   	}
    
    
    @Test
   	public void hobbyの文字数のみ１０１文字以上＿返るエラー１つ() {
       	//フォームに入力される文字列が３０文字と仮定
   		StringBuilder str = new StringBuilder();
   		for(int i = 0 ; i < 30 ; i++){
   			str.append("あ");
   		}
   		
   		//フォームに入力される文字列が１０１文字と仮定
   		StringBuilder hobby = new StringBuilder();
   		for(int i = 0 ; i < 101 ; i++){
   			hobby.append("あ");
   		}
   		
   		//オブジェクトのパラメータに文字列をセット
   		RegInBeans regben = new RegInBeans();
   		String msg = new String(str);
   		String hobbyNum = new String(hobby);
   		regben.setLastname(msg);
   		regben.setFirstname(msg);
   		regben.setLsubname(msg);
   		regben.setFsubname(msg);
   		regben.setPlace(msg);
   		regben.setHobby(hobbyNum);
   		regben.setWord(msg);
   		
   		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
   		ArrayList<String> list = regben.checkStrLength();
   		
   		//エラーメッセージの数が正しいかをチェック
   		int expected = 1;
   		int actual = list.size();
   		assertThat(actual, is(expected));
   	}
    
    @Test
   	public void wordの文字数のみ１０１文字以上＿返るエラー１つ() {
       	//フォームに入力される文字列が３０文字と仮定
   		StringBuilder str = new StringBuilder();
   		for(int i = 0 ; i < 30 ; i++){
   			str.append("あ");
   		}
   		
   		//フォームに入力される文字列が１０１文字と仮定
   		StringBuilder word = new StringBuilder();
   		for(int i = 0 ; i < 101 ; i++){
   			word.append("あ");
   		}
   		
   		//オブジェクトのパラメータに文字列をセット
   		RegInBeans regben = new RegInBeans();
   		String msg = new String(str);
   		String wordNum = new String(word);
   		regben.setLastname(msg);
   		regben.setFirstname(msg);
   		regben.setLsubname(msg);
   		regben.setFsubname(msg);
   		regben.setPlace(msg);
   		regben.setHobby(msg);
   		regben.setWord(wordNum);
   		
   		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
   		ArrayList<String> list = regben.checkStrLength();
   		
   		//エラーメッセージの数が正しいかをチェック
   		int expected = 1;
   		int actual = list.size();
   		assertThat(actual, is(expected));
   	}
    
    @Test
   	public void lastnameの文字数が３０文字他は１文字＿返るエラーなし() {
       	//フォームに入力される文字列が１文字と仮定
   		StringBuilder str = new StringBuilder();
   		for(int i = 0 ; i < 1 ; i++){
   			str.append("あ");
   		}
   		
   		//フォームに入力される文字列が３０文字と仮定
   		StringBuilder lastname = new StringBuilder();
   		for(int i = 0 ; i < 30 ; i++){
   			lastname.append("あ");
   		}
   		
   		//オブジェクトのパラメータに文字列をセット
   		RegInBeans regben = new RegInBeans();
   		String msg = new String(str);
   		String lastnameNum = new String(lastname);
   		regben.setLastname(lastnameNum);
   		regben.setFirstname(msg);
   		regben.setLsubname(msg);
   		regben.setFsubname(msg);
   		regben.setPlace(msg);
   		regben.setHobby(msg);
   		regben.setWord(msg);
   		
   		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
   		ArrayList<String> list = regben.checkStrLength();
   		
   		//エラーメッセージの数が正しいかをチェック
   		int expected = 0;
   		int actual = list.size();
   		assertThat(actual, is(expected));
   	}
    
    @Test
   	public void firstnameの文字数が３０文字他は１文字＿返るエラーなし() {
       	//フォームに入力される文字列が１文字と仮定
   		StringBuilder str = new StringBuilder();
   		for(int i = 0 ; i < 1 ; i++){
   			str.append("あ");
   		}
   		
   		//フォームに入力される文字列が３０文字と仮定
   		StringBuilder firstname = new StringBuilder();
   		for(int i = 0 ; i < 30 ; i++){
   			firstname.append("あ");
   		}
   		
   		//オブジェクトのパラメータに文字列をセット
   		RegInBeans regben = new RegInBeans();
   		String msg = new String(str);
   		String firstnameNum = new String(firstname);
   		regben.setLastname(msg);
   		regben.setFirstname(firstnameNum);
   		regben.setLsubname(msg);
   		regben.setFsubname(msg);
   		regben.setPlace(msg);
   		regben.setHobby(msg);
   		regben.setWord(msg);
   		
   		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
   		ArrayList<String> list = regben.checkStrLength();
   		
   		//エラーメッセージの数が正しいかをチェック
   		int expected = 0;
   		int actual = list.size();
   		assertThat(actual, is(expected));
   	}
    
    @Test
   	public void lsubnameの文字数が３０文字他は１文字＿返るエラーなし() {
       	//フォームに入力される文字列が１文字と仮定
   		StringBuilder str = new StringBuilder();
   		for(int i = 0 ; i < 1 ; i++){
   			str.append("あ");
   		}
   		
   		//フォームに入力される文字列が３０文字と仮定
   		StringBuilder lsubname = new StringBuilder();
   		for(int i = 0 ; i < 30 ; i++){
   			lsubname.append("あ");
   		}
   		
   		//オブジェクトのパラメータに文字列をセット
   		RegInBeans regben = new RegInBeans();
   		String msg = new String(str);
   		String lsubnameNum = new String(lsubname);
   		regben.setLastname(msg);
   		regben.setFirstname(msg);
   		regben.setLsubname(lsubnameNum);
   		regben.setFsubname(msg);
   		regben.setPlace(msg);
   		regben.setHobby(msg);
   		regben.setWord(msg);
   		
   		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
   		ArrayList<String> list = regben.checkStrLength();
   		
   		//エラーメッセージの数が正しいかをチェック
   		int expected = 0;
   		int actual = list.size();
   		assertThat(actual, is(expected));
   	}
    
    
    @Test
   	public void fsubnameの文字数が３０文字他は１文字＿返るエラーなし() {
       	//フォームに入力される文字列が１文字と仮定
   		StringBuilder str = new StringBuilder();
   		for(int i = 0 ; i < 1 ; i++){
   			str.append("あ");
   		}
   		
   		//フォームに入力される文字列が３０文字と仮定
   		StringBuilder fsubname = new StringBuilder();
   		for(int i = 0 ; i < 30 ; i++){
   			fsubname.append("あ");
   		}
   		
   		//オブジェクトのパラメータに文字列をセット
   		RegInBeans regben = new RegInBeans();
   		String msg = new String(str);
   		String fsubnameNum = new String(fsubname);
   		regben.setLastname(msg);
   		regben.setFirstname(msg);
   		regben.setLsubname(msg);
   		regben.setFsubname(fsubnameNum);
   		regben.setPlace(msg);
   		regben.setHobby(msg);
   		regben.setWord(msg);
   		
   		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
   		ArrayList<String> list = regben.checkStrLength();
   		
   		//エラーメッセージの数が正しいかをチェック
   		int expected = 0;
   		int actual = list.size();
   		assertThat(actual, is(expected));
   	}
    
    @Test
   	public void placeの文字数が３０文字他は１文字＿返るエラーなし() {
       	//フォームに入力される文字列が１文字と仮定
   		StringBuilder str = new StringBuilder();
   		for(int i = 0 ; i < 1 ; i++){
   			str.append("あ");
   		}
   		
   		//フォームに入力される文字列が３０文字と仮定
   		StringBuilder place = new StringBuilder();
   		for(int i = 0 ; i < 30 ; i++){
   			place.append("あ");
   		}
   		
   		//オブジェクトのパラメータに文字列をセット
   		RegInBeans regben = new RegInBeans();
   		String msg = new String(str);
   		String placeNum = new String(place);
   		regben.setLastname(msg);
   		regben.setFirstname(msg);
   		regben.setLsubname(msg);
   		regben.setFsubname(msg);
   		regben.setPlace(placeNum);
   		regben.setHobby(msg);
   		regben.setWord(msg);
   		
   		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
   		ArrayList<String> list = regben.checkStrLength();
   		
   		//エラーメッセージの数が正しいかをチェック
   		int expected = 0;
   		int actual = list.size();
   		assertThat(actual, is(expected));
   	}
    
    @Test
   	public void hobbyの文字数が３０文字他は１文字＿返るエラーなし() {
       	//フォームに入力される文字列が１文字と仮定
   		StringBuilder str = new StringBuilder();
   		for(int i = 0 ; i < 1 ; i++){
   			str.append("あ");
   		}
   		
   		//フォームに入力される文字列が３０文字と仮定
   		StringBuilder hobby = new StringBuilder();
   		for(int i = 0 ; i < 30 ; i++){
   			hobby.append("あ");
   		}
   		
   		//オブジェクトのパラメータに文字列をセット
   		RegInBeans regben = new RegInBeans();
   		String msg = new String(str);
   		String hobbyNum = new String(hobby);
   		regben.setLastname(msg);
   		regben.setFirstname(msg);
   		regben.setLsubname(msg);
   		regben.setFsubname(msg);
   		regben.setPlace(msg);
   		regben.setHobby(hobbyNum);
   		regben.setWord(msg);
   		
   		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
   		ArrayList<String> list = regben.checkStrLength();
   		
   		//エラーメッセージの数が正しいかをチェック
   		int expected = 0;
   		int actual = list.size();
   		assertThat(actual, is(expected));
   	}
    
    @Test
   	public void wordの文字数が３０文字他は１文字＿返るエラーなし() {
       	//フォームに入力される文字列が１文字と仮定
   		StringBuilder str = new StringBuilder();
   		for(int i = 0 ; i < 1 ; i++){
   			str.append("あ");
   		}
   		
   		//フォームに入力される文字列が３０文字と仮定
   		StringBuilder word = new StringBuilder();
   		for(int i = 0 ; i < 30 ; i++){
   			word.append("あ");
   		}
   		
   		//オブジェクトのパラメータに文字列をセット
   		RegInBeans regben = new RegInBeans();
   		String msg = new String(str);
   		String wordNum = new String(word);
   		regben.setLastname(msg);
   		regben.setFirstname(msg);
   		regben.setLsubname(msg);
   		regben.setFsubname(msg);
   		regben.setPlace(msg);
   		regben.setHobby(msg);
   		regben.setWord(wordNum);
   		
   		//制限文字数を超えたパラメータの数に対応したエラーメッセージをlistに格納
   		ArrayList<String> list = regben.checkStrLength();
   		
   		//エラーメッセージの数が正しいかをチェック
   		int expected = 0;
   		int actual = list.size();
   		assertThat(actual, is(expected));
   	}


}
