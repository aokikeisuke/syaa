package beans;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RegInBeansTest {

	@Test
	public void test() {
		StringBuilder str = new StringBuilder();
		for(int i = 0 ; i < 30 ; i++){
			str.append("あ");
		}
		
		RegInBeans regben = new RegInBeans();
		String msg = new String(str);
		regben.setLastname(msg);
		regben.setFirstname(msg);
		regben.setLsubname(msg);
		regben.setFsubname(msg);
		regben.setPlace(msg);
		regben.setHobby(msg);
		regben.setWord(msg);
		
		ArrayList<String> list = regben.checkStrLength();
		
		int expected = 0;
		int actual = list.size();
		assertThat(actual, is(expected));
	}

}
