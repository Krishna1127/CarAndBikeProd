package commonMethods;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;

import utility.utils;

public class DataprovideData extends utils {
	static String Path=System.getProperty("user.dir");
	
	@DataProvider(name = "excelData")
	public Iterator<String> gettestdata() throws Exception {

		ArrayList<String> testdata = utils.readExcel(Path+"\\urlprod.xls","Sheet3");
		return testdata.iterator();
	}
	@DataProvider(name = "AmpUrl")
	public Iterator<String> testdata() throws Exception {

		ArrayList<String> Amptestdata = utils.readExcel(Path+"\\urlprod.xls","Sheet4");
		return Amptestdata.iterator();
	}

}
