package datos;
import java.util.Set;

public class Tarjeta {
	private long idTarjeta;
	private long nroTarjeta;
	private double saldo;
	private boolean tarifaSocial;
	private Usuario usuario;
	private int contadorViajesSubte;
	private int mesDescuentoViajesSubte;
	private boolean cobroOdevolucionTren;
	private Set<Movimiento> lstMovimientos;
	
	public Tarjeta() {}

	public Tarjeta(long nroTarjeta, double saldo, boolean tarifaSocial,Usuario usuario) {
		
		this.nroTarjeta = nroTarjeta;
		this.saldo = saldo;
		this.tarifaSocial = tarifaSocial;
		this.usuario=usuario;
		this.cobroOdevolucionTren=false;
		this.contadorViajesSubte=1;
	}

	public long getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(long idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public long getNroTarjeta() {
		return nroTarjeta;
	}

	public void setNroTarjeta(long nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isTarifaSocial() {
		return tarifaSocial;
	}

	public void setTarifaSocial(boolean tarifaSocial) {
		this.tarifaSocial = tarifaSocial;
	}
		
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getContadorViajesSubte() {
		return contadorViajesSubte;
	}

	public void setContadorViajesSubte(int contadorViajesSubte) {
		this.contadorViajesSubte = contadorViajesSubte;
	}

	public boolean isCobroOdevolucionTren() {
		return cobroOdevolucionTren;
	}

	public void setCobroOdevolucionTren(boolean cobroOdevolucionTren) {
		this.cobroOdevolucionTren = cobroOdevolucionTren;
	}
	
	public int getMesDescuentoViajesSubte() {
		return mesDescuentoViajesSubte;
	}

	public void setMesDescuentoViajesSubte(int mesDescuentoViajesSubte) {
		this.mesDescuentoViajesSubte = mesDescuentoViajesSubte;
	}

	public Set<Movimiento> getLstMovimientos() {
		return lstMovimientos;
	}

	public void setLstMovimientos(Set<Movimiento> lstMovimientos) {
		this.lstMovimientos = lstMovimientos;
	}
/*
	@Override
	public String toString() {
		return "Tarjeta [idTarjeta=" + idTarjeta + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", tarifaSocial="
				+ tarifaSocial + ", usuario=" + usuario + "]";
	}*/
	
	
	
}
