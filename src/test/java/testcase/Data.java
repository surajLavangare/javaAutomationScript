package testcase;

import org.testng.annotations.DataProvider;

public class Data {

	
	@DataProvider (name="testdata") 
	public String[][] getData() {
		
		String[][] data = {{"standard_user","secret_sauce"},
		                    {"locked_out_user","secret_sauce"},
		                    {"problem_user","secret_sauce"},
		                    {"performance_glitch_user","secret_sauce"}
		                    };
		return data;	
	}
}
