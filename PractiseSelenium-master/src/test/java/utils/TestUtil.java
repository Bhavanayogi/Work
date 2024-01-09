package utils;

import java.util.ArrayList;

public class TestUtil {

	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel()

	{

		ArrayList<Object[]> myData = new ArrayList<Object[]>();

		try {

			reader = new Xls_Reader(
					"C:\\Users\\pratanlal\\Eclipse2020\\Maven_Projects\\PW_Marketing\\src\\main\\java\\testData\\AutomationTestData.xlsx");

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int rowNum = 2; rowNum <= reader.getRowCount("contacts"); rowNum++) {
			String applicantType = reader.getCellData("contacts", "applicanttype", rowNum);
			String birthDate = reader.getCellData("contacts", "birthdate", rowNum);
			String firstName = reader.getCellData("contacts", "firstname", rowNum);
			String middleName = reader.getCellData("contacts", "middlename", rowNum);
			String lastName = reader.getCellData("contacts", "lastname", rowNum);
			String homePhone = reader.getCellData("contacts", "homephone", rowNum);

			Object ob[] = { applicantType, birthDate, firstName, middleName, lastName, homePhone };
			myData.add(ob);

		}

		return myData;

	}

}
