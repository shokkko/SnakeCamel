package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;


import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelcaseで文字分割() {
		String st = "SnakeCase";
		String actual = SnakeCamelUtil.snakeToCamelcase("snake_case");
		assertThat(actual,is(st));
	}
	
	@Test
	public void camelToSnakecseで大文字か小文字を表示(){
		String st = "snake_camel";
		String actual = SnakeCamelUtil.camelToSnakecase("SnakeCamel");
		assertThat(actual,is(st));
		
	}

}
