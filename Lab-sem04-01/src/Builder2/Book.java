
package Builder2;

import java.io.*;
import java.util.Date;

public class Book {


	private String titulo;

	private String isbn;

	private String autor;
	
	private Date fechaPublicacion;

	private String inumeroPaginas ;
	

	
	public Book settitulo(String titulo) {		
		this.titulo = titulo	;
		return this;	
}
	

public Book setisbn(String isbn) {		
		this.isbn = isbn;
		return this;	
}	

public Book setautor(String autor) {		
	this.autor = autor;
	return this;
}
public Book setfechaPublicacion(Date fechaPublicacion) {		
	this.fechaPublicacion = fechaPublicacion;
	return this;
}
public Book setinumeroPaginas(String inumeroPaginas) {		
	this.inumeroPaginas = inumeroPaginas;
	return this;
}
	
}
