package Builder2;

import java.util.Date;



public class BookBuilder {
	private String titulo;

	private String isbn;

	private String autor;
	
	private Date fechaPublicacion;

	private String inumeroPaginas ;
	
	

public BookBuilder settitulo(String titulo) {		
		this.titulo = titulo	;
		return this;	
}
	

public BookBuilder setisbn(String isbn) {		
		this.isbn = isbn;
		return this;	
}	

public BookBuilder setautor(String autor) {		
	this.autor = autor;
	return this;
}
public BookBuilder setfechaPublicacion(Date fechaPublicacion) {		
	this.fechaPublicacion = fechaPublicacion;
	return this;
}
public BookBuilder setinumeroPaginas(String inumeroPaginas) {		
	this.inumeroPaginas = inumeroPaginas;
	return this;
}
public Book build() {
	
	Book book = new Book();
	
 

	book.settitulo(this.titulo);
	book.setisbn(this.isbn);
	book.setinumeroPaginas(this.inumeroPaginas);
	
	return book;
}

}
