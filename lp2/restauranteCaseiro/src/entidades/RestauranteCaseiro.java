package entidades;

public class RestauranteCaseiro {
	private int mesa;
	private int cerveja;
	private int refrigerante;
	private int sobremesa;
	private float kg;
	private double total;
	private int qntPessoas;
	
	public static final float cerv = 12;
	public static final float refri = (float) 6.9;
	public static final float sobre = (float) 19.9;
	public static final float gramas = (float) 0.06;
	
	public RestauranteCaseiro() {}
	
	public RestauranteCaseiro(int mesa, int cerveja, int refrigerante, int sobremesa, float kg, double total, int qntPessoas) {
		this.setMesa(mesa);
		this.setCerveja(cerveja);
		this.setRefrigerante(refrigerante);
		this.setSobremesa(sobremesa);
		this.setKg(kg);
		this.setTotal(total);
		this.setQntPessoas(qntPessoas);
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	public int getCerveja() {
		return cerveja;
	}

	public void setCerveja(int cerveja) {
		this.cerveja = cerveja;
	}

	public int getRefrigerante() {
		return refrigerante;
	}

	public void setRefrigerante(int refrigerante) {
		this.refrigerante = refrigerante;
	}

	public int getSobremesa() {
		return sobremesa;
	}

	public void setSobremesa(int sobremesa) {
		this.sobremesa = sobremesa;
	}

	public float getKg() {
		return kg;
	}

	public void setKg(float kg) {
		this.kg = kg;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getQntPessoas() {
		return qntPessoas;
	}

	public void setQntPessoas(int qntPessoas) {
		this.qntPessoas = qntPessoas;
	}
	
	public void addCerveja(int cerveja) {
		this.cerveja += cerveja;
	}
	public void removeCerveja(int cerveja) {
		this.cerveja -= cerveja;
	}
	
	public void addRefrigerente(int refrigerante) {
		this.refrigerante += refrigerante;
	}
	public void removeRefrigerente(int refrigerante) {
		this.refrigerante -= refrigerante;
	}
	
	public void addSobremesa(int sobremesa) {
		this.sobremesa += sobremesa;
	}
	public void removeSobremesa(int sobremesa) {
		this.sobremesa -= sobremesa;
	}
	
	public void addKg(float kg) {
		this.kg += kg;
	}
	public void removeKg(float kg) {
		this.kg -= kg;
	}
	
	public void addPessoa(float pessoa) {
		this.qntPessoas += pessoa;
	}
	public void removePessoa(float pessoa) {
		this.qntPessoas -= pessoa;
	}
	
	public void calcTotal() {
		total = (getCerveja() * cerv) + (getRefrigerante() * refri) + (getSobremesa() * sobre) + (getKg() * gramas);
		setTotal(total);
	}
	
	public double totalPessoas() {
		System.out.println(getTotal());
		total = this.total / qntPessoas;
		return total;
		
	}
	
	
	
	
}
	

