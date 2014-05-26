package beans;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RegInBeansTest {

	@Test
	public void test() {
		StringBuffer str = new StringBuffer();
		for(int i = 0 ; i < 30 ; i++){
			str.append("あ");
		}
		RegInBeans regben = new RegInBeans();
		int expected = 3;
		ArrayList<String> list = RegInBeans.errorMessage(str.toString(),str.toString(),str.toString(),str.toString(),str.toString(),
				                                str.toString(),str.toString(),str.toString());
		int actual = list.size();
		assertThat(actual, is(expected));
	}

}
