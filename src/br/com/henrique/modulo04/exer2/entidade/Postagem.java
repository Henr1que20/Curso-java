package br.com.henrique.modulo04.exer2.entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String content;
	private Integer likes;
	
	private List<Comentario> comentarios = new ArrayList<>();

	public Postagem() { }
	
	public Postagem(Date momento, String titulo, String content, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.content = content;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getCometarios() {
		return comentarios;
	}

	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void removeComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(momento) + "\n");
		sb.append(content + "\n");
		sb.append("Comentario:\n");
		for (Comentario c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}	
		return sb.toString();
	}
	
	
	
	
	
	
	

}
