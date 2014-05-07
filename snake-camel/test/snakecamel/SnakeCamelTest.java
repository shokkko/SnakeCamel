package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;


import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelcase�ŕ�������() {
		String st = "SnakeCase";
		String actual = SnakeCamelUtil.snakeToCamelcase("snake_case");
		assertThat(actual,is(st));
	}
	
	@Test
	public void camelToSnakecse�ő啶������������\��(){
		String st = "snake_camel";
		String actual = SnakeCamelUtil.camelToSnakecase("SnakeCamel");
		assertThat(actual,is(st));
		
	}

}
