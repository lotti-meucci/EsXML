package it.fi.itismeucci.esxml;
import java.util.*;
import com.fasterxml.jackson.dataformat.xml.annotation.*;

public final class Classe
{
	private int numero = 1;
	private String sezione, aula;

  @JacksonXmlElementWrapper(localName = "alunni")
	@JacksonXmlProperty(localName = "alunno")
	private ArrayList<Alunno> alunni;

	public Classe() throws IllegalArgumentException
	{
		setAlunni(new ArrayList<>());
	}

	public Classe(int numero, String sezione, String aula) throws IllegalArgumentException
	{
		setNumero(numero);
		setSezione(sezione);
		setAula(aula);
		setAlunni(new ArrayList<>());
	}

	public int getNumero()
	{
		return numero;
	}

	public void setNumero(int value) throws IllegalArgumentException
	{
		if (value < 1)
			throw new IllegalArgumentException();

		numero = value;
	}

	public String getSezione()
	{
		return sezione;
	}

	public void setSezione(String value) throws IllegalArgumentException
	{
		if (value == null || value.isBlank())
			throw new IllegalArgumentException();

		sezione = value;
	}

	public String getAula()
	{
		return aula;
	}

	public void setAula(String value) throws IllegalArgumentException
	{
		if (value == null || value.isBlank())
			throw new IllegalArgumentException();

		aula = value;
	}

	public ArrayList<Alunno> getAlunni()
	{
		return alunni;
	}

	private void setAlunni(ArrayList<Alunno> value) throws IllegalArgumentException
	{
		if (value == null)
			throw new IllegalArgumentException();

		alunni = value;
	}
}
