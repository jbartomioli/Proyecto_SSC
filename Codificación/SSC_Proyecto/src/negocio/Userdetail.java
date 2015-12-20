package negocio;

public class Userdetail
{
	
	
	//***************************************************************
		//* ATRIBUTOS													*
		//***************************************************************
		private int id;
		private String name;
		private String username;
		private String password;
		private int idCliente;
		//---------------------------------------------------------------


		//***************************************************************
		//* CONSTRUCTOR													*
		//***************************************************************
		public Userdetail() 
		{
			this.id = 0;
			this.name = "";
			this.username = "";
			this.password = "";
		}
		//---------------------------------------------------------------


		//***************************************************************
		//* GETTES & SETTERS											*
		//***************************************************************
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}

		//---------------------------------------------------------------
		
		
		
		public int getIdCliente() {
			return idCliente;
		}


		public void setIdCliente(int idCliente) {
			this.idCliente = idCliente;
		}


		//***************************************************************
		//* METODOS 													*
		//***************************************************************
		public void obtenerUser(String user, String password) throws Exception
		{
			datos.Userdetail usuarioDatos = new datos.Userdetail();
			
			usuarioDatos.obtenerUser(user, password);
		
			setName(usuarioDatos.getName());
			setPassword(usuarioDatos.getPassword());
			setUsername(usuarioDatos.getUsername());
			setIdCliente(usuarioDatos.getIdCliente());

		}
		



}
