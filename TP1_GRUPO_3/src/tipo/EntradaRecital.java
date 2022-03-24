package tipo;

public enum EntradaRecital {
	VIP(1500.00), GENERAL(800);
	
	private double precio;
  
    public double getPrecio()
    {
        return this.precio;
    }
  
    private EntradaRecital(double precio)
    {
        this.precio = precio;
    }
}
