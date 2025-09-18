package com.toDoListExercice.toDoList.entity;


	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name = "tb_usuario")
	public class Usuario {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id; 
		
		@Column(name = "nome", length = 100)
		private String nome;
		
		@Column(name = "senha", length = 12)
		private int senha;
		
		@Column(name = "email")
		private String email;
		
		public Usuario() {}
		public Usuario(String nome, int senha, String email) {
			super();
			this.nome = nome;
			this.senha = senha;
			this.email = email;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getSenha() {
			return senha;
		}
		public void setSenha(int senha) {
			this.senha = senha;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
}
