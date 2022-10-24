package it.fi.itismeucci.esxml;
import java.util.*;

public final class Alunno
{
	private String nome, cognome;
	private Date dataNascita;

	public Alunno() { }

	public Alunno(String nome, String cognome, Date dataNascita) throws IllegalArgumentException
	{
		setNome(nome);
		setCognome(cognome);
		setDataNascita(dataNascita);
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String value) throws IllegalArgumentException
	{
		if (value == null || value.isBlank())
			throw new IllegalArgumentException();

		nome = value;
	}

	public String getCognome()
	{
		return cognome;
	}

	public void setCognome(String value) throws IllegalArgumentException
	{
		if (value == null || value.isBlank())
			throw new IllegalArgumentException();

		cognome = value;
	}

	public Date getDataNascita()
	{
		return dataNascita;
	}

	public void setDataNascita(Date value) throws IllegalArgumentException
	{
		if (value == null)
			throw new IllegalArgumentException();

		dataNascita = value;
	}
}
