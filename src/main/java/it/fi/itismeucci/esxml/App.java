package it.fi.itismeucci.esxml;
import java.util.*;
import java.io.*;
import com.fasterxml.jackson.databind.json.*;
import com.fasterxml.jackson.dataformat.xml.*;

public class App
{
	public static void main(String[] args) throws Exception
	{
		XmlMapper xmlMapper = new XmlMapper();
		File fileXml = new File("output/aia5.xml");
		JsonMapper jsonMapper = new JsonMapper();
		File fileJson = new File("output/aia5.json");
		Classe aia5 = new Classe(5, "AIA", "04-TC");

		aia5.getAlunni().add(new Alunno(
			"Mario",
			"Rossi",
			new Date(2004, 5, 10)
		));

		aia5.getAlunni().add(new Alunno(
			"Fancesco",
			"Ferrari",
			new Date(2004, 8, 3)
		));

		aia5.getAlunni().add(new Alunno(
			"Marco",
			"Pellegrini",
			new Date(2004, 2, 25)
		));

		aia5.getAlunni().add(new Alunno(
			"Gianni",
			"Vanni",
			new Date(2004, 12, 18)
		));


		// Main1 [XML]

		xmlMapper.writeValue(fileXml, aia5);


		// Main2 [XML]

		Classe aia5Deserialized = xmlMapper.readValue(fileXml, Classe.class);
		System.out.println(xmlMapper.writeValueAsString(aia5Deserialized));


		// Main1 [JSON]

		jsonMapper.writeValue(fileJson, aia5);


		// Main2 [JSON]

		aia5Deserialized = jsonMapper.readValue(fileJson, Classe.class);
		System.out.println(jsonMapper.writeValueAsString(aia5Deserialized));
	}
}
