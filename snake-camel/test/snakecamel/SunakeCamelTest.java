package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SunakeCamelTest {
/*
	@Test
	public void test() {
		fail("‚Ü‚¾ŽÀ‘•‚³‚ê‚Ä‚¢‚Ü‚¹‚ñ");
	}*/
	
	@Test
	public void snakeToCamel‚Å•¶Žš—ñ•ÏŠ·(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s1=scu.snakeToCamelcase("abc_def");
		String s2=scu.snakeToCamelcase("abc_def_ghi");
		String s3=scu.snakeToCamelcase("abc_def_ghi_jkl");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	
	
	@Test
	public void camelToSanake‚Å•¶Žš—ñ•ÏŠ·(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String c1=scu.camelToSnakecase("AbcDef");
		String c2=scu.camelToSnakecase("AbcDefGhi");
		String c3=scu.camelToSnakecase("AbcDefGhiJkl");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
