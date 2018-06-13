package test;
import datos.*;
import dao.*;
import negocio.EstacionTrenABM;
import negocio.LineaTrenABM;
import negocio.SeccionColectivoABM;
import negocio.SeccionSubteABM;
import negocio.SeccionTrenABM;
import negocio.TarifaColectivoABM;
import negocio.TarifaSubteABM;
import negocio.TarifaTrenABM;
import negocio.TrenABM;


public abstract class TestPruebaCargaDeDatos {

	public static void main(String[] args) {
		
		
		try {
			//--------------------------------AGREGAR SECCION COLECTIVO----------------------------------------------------
			
			SeccionColectivoABM seccionColectivoABM = new SeccionColectivoABM();
			
			String descripcion ="De 0 a 3 Kilometros";	   
			seccionColectivoABM.agregarSeccionColectivo(descripcion,10,4.5);
			
			String descripcion2 ="De 3 a 6 Kilometros";	   
			seccionColectivoABM.agregarSeccionColectivo(descripcion2,10.5,4.73);
			
			String descripcion3 ="De 6 a 12 Kilometros";
			seccionColectivoABM.agregarSeccionColectivo(descripcion3,10.75,4.84);
			
			String descripcion4 ="De 12 a 30 Kilometros";  
			seccionColectivoABM.agregarSeccionColectivo(descripcion4,11.25,5.07);
		    
			String descripcion5 ="Mas de 30 Kilometros";	   
			seccionColectivoABM.agregarSeccionColectivo(descripcion5,11.75,5.3);
			
		   //---------------------------------AGREGAR SECCION SUBTE-------------------------------------------------------
		   
			SeccionSubteABM seccionSubteABM = new SeccionSubteABM();	
			
			seccionSubteABM.agregarSeccionSubte(1,20,7.50,3.37);
			seccionSubteABM.agregarSeccionSubte(21,30,6,2.7);
			seccionSubteABM.agregarSeccionSubte(31,40,5.25,2.35);
			seccionSubteABM.agregarSeccionSubte(41,0,4.5,2.02);
			
			//-------------------------------------AGREGAR SECCION TREN-------------------------------------------------
			
			SeccionTrenABM seccionlineaTrenAbm = new SeccionTrenABM();
			
			seccionlineaTrenAbm.agregarSeccionTren(2.75,1.24);
			
			seccionlineaTrenAbm.agregarSeccionTren(4,1.8);
			
			seccionlineaTrenAbm.agregarSeccionTren(5.5,2.48);
			
			//-------------------------------------AGREGAR LINEA TREN--------------------------------------------
			
			LineaTrenABM lineaTrenAbm = new LineaTrenABM();
			TrenABM trenAbm = new TrenABM();
			lineaTrenAbm.agregarLineaTren("Linea Roca");
			trenAbm.agregarTren(1, "Tren", lineaTrenAbm.traerLineaTren(1));
			
			//------------------------------------ AGREGAR ESTACIONES DE TREN-----------------------------
			EstacionTrenABM estacionlineaTrenAbm= new EstacionTrenABM();
			
			estacionlineaTrenAbm.agregarEstacionTren("Plaza Constitucion",lineaTrenAbm.traerLineaTren(1));
			estacionlineaTrenAbm.agregarEstacionTren("Hipolito Yrigoyen",lineaTrenAbm.traerLineaTren(1));
			estacionlineaTrenAbm.agregarEstacionTren("Damian Santillan y Maximiliano Kosteki",lineaTrenAbm.traerLineaTren(1));
			estacionlineaTrenAbm.agregarEstacionTren("Gerli",lineaTrenAbm.traerLineaTren(1));
			estacionlineaTrenAbm.agregarEstacionTren("Lan�s",lineaTrenAbm.traerLineaTren(1));
			estacionlineaTrenAbm.agregarEstacionTren("Remedios de Escalada",lineaTrenAbm.traerLineaTren(1));
			estacionlineaTrenAbm.agregarEstacionTren("Banfield",lineaTrenAbm.traerLineaTren(1));
			estacionlineaTrenAbm.agregarEstacionTren("Lomas de Zamora",lineaTrenAbm.traerLineaTren(1));
			estacionlineaTrenAbm.agregarEstacionTren("Temperley",lineaTrenAbm.traerLineaTren(1));
			estacionlineaTrenAbm.agregarEstacionTren("Adrogue",lineaTrenAbm.traerLineaTren(1));
			estacionlineaTrenAbm.agregarEstacionTren("Burzaco",lineaTrenAbm.traerLineaTren(1));
			estacionlineaTrenAbm.agregarEstacionTren("Longchamps",lineaTrenAbm.traerLineaTren(1));
			estacionlineaTrenAbm.agregarEstacionTren("Glew",lineaTrenAbm.traerLineaTren(1));
			
			
		
			
			
			//------------------------------------ AGREGAR TARIFA TREN------------------------------------
			//------ DESDE CONSTITUCION HASTA GLEW
			TarifaTrenABM tarifaTrenABM= new TarifaTrenABM();
			
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(1),estacionlineaTrenAbm.traerEstacionTren(2),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(1),estacionlineaTrenAbm.traerEstacionTren(3),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(1),estacionlineaTrenAbm.traerEstacionTren(4),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(1),estacionlineaTrenAbm.traerEstacionTren(5),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(1),estacionlineaTrenAbm.traerEstacionTren(6),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(1),estacionlineaTrenAbm.traerEstacionTren(7),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(1),estacionlineaTrenAbm.traerEstacionTren(8),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(1),estacionlineaTrenAbm.traerEstacionTren(9),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(1),estacionlineaTrenAbm.traerEstacionTren(10),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(1),estacionlineaTrenAbm.traerEstacionTren(11),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(1),estacionlineaTrenAbm.traerEstacionTren(12),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(1),estacionlineaTrenAbm.traerEstacionTren(13),seccionlineaTrenAbm.traerSeccionTren(3));
			
			

			//---------DESDE YRIGOYEN HASTA GLEW
			
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(2),estacionlineaTrenAbm.traerEstacionTren(3),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(2),estacionlineaTrenAbm.traerEstacionTren(4),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(2),estacionlineaTrenAbm.traerEstacionTren(5),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(2),estacionlineaTrenAbm.traerEstacionTren(6),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(2),estacionlineaTrenAbm.traerEstacionTren(7),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(2),estacionlineaTrenAbm.traerEstacionTren(8),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(2),estacionlineaTrenAbm.traerEstacionTren(9),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(2),estacionlineaTrenAbm.traerEstacionTren(10),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(2),estacionlineaTrenAbm.traerEstacionTren(11),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(2),estacionlineaTrenAbm.traerEstacionTren(12),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(2),estacionlineaTrenAbm.traerEstacionTren(13),seccionlineaTrenAbm.traerSeccionTren(2));
			
			//-------- DESDE AVELLANEDA HASTA GLEW
			
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(3),estacionlineaTrenAbm.traerEstacionTren(4),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(3),estacionlineaTrenAbm.traerEstacionTren(5),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(3),estacionlineaTrenAbm.traerEstacionTren(6),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(3),estacionlineaTrenAbm.traerEstacionTren(7),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(3),estacionlineaTrenAbm.traerEstacionTren(8),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(3),estacionlineaTrenAbm.traerEstacionTren(9),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(3),estacionlineaTrenAbm.traerEstacionTren(10),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(3),estacionlineaTrenAbm.traerEstacionTren(11),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(3),estacionlineaTrenAbm.traerEstacionTren(12),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(3),estacionlineaTrenAbm.traerEstacionTren(13),seccionlineaTrenAbm.traerSeccionTren(2));
			
			
			//--------DESDE GERLI HASTA GLEW
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(4),estacionlineaTrenAbm.traerEstacionTren(5),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(4),estacionlineaTrenAbm.traerEstacionTren(6),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(4),estacionlineaTrenAbm.traerEstacionTren(7),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(4),estacionlineaTrenAbm.traerEstacionTren(8),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(4),estacionlineaTrenAbm.traerEstacionTren(9),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(4),estacionlineaTrenAbm.traerEstacionTren(10),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(4),estacionlineaTrenAbm.traerEstacionTren(11),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(4),estacionlineaTrenAbm.traerEstacionTren(12),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(4),estacionlineaTrenAbm.traerEstacionTren(13),seccionlineaTrenAbm.traerSeccionTren(2));
			
			
			//-----DESDE LANUS HASTA GLEW
			
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(5),estacionlineaTrenAbm.traerEstacionTren(6),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(5),estacionlineaTrenAbm.traerEstacionTren(7),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(5),estacionlineaTrenAbm.traerEstacionTren(8),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(5),estacionlineaTrenAbm.traerEstacionTren(9),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(5),estacionlineaTrenAbm.traerEstacionTren(10),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(5),estacionlineaTrenAbm.traerEstacionTren(11),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(5),estacionlineaTrenAbm.traerEstacionTren(12),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(5),estacionlineaTrenAbm.traerEstacionTren(13),seccionlineaTrenAbm.traerSeccionTren(2));
		
			
		
			
			//------DESDE ESCALADA HASTA GLEW
			
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(6),estacionlineaTrenAbm.traerEstacionTren(7),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(6),estacionlineaTrenAbm.traerEstacionTren(8),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(6),estacionlineaTrenAbm.traerEstacionTren(9),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(6),estacionlineaTrenAbm.traerEstacionTren(10),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(6),estacionlineaTrenAbm.traerEstacionTren(11),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(6),estacionlineaTrenAbm.traerEstacionTren(12),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(6),estacionlineaTrenAbm.traerEstacionTren(13),seccionlineaTrenAbm.traerSeccionTren(2));
			
			

			//-----DESDE BANFIELD HASTA GLEW
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(7),estacionlineaTrenAbm.traerEstacionTren(8),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(7),estacionlineaTrenAbm.traerEstacionTren(9),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(7),estacionlineaTrenAbm.traerEstacionTren(10),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(7),estacionlineaTrenAbm.traerEstacionTren(11),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(7),estacionlineaTrenAbm.traerEstacionTren(12),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(7),estacionlineaTrenAbm.traerEstacionTren(13),seccionlineaTrenAbm.traerSeccionTren(2));
			
			
			
			//----DESDE LOMAS HASTA GLEW
			
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(8),estacionlineaTrenAbm.traerEstacionTren(9),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(8),estacionlineaTrenAbm.traerEstacionTren(10),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(8),estacionlineaTrenAbm.traerEstacionTren(11),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(8),estacionlineaTrenAbm.traerEstacionTren(12),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(8),estacionlineaTrenAbm.traerEstacionTren(13),seccionlineaTrenAbm.traerSeccionTren(2));
			
			
			//-----DESDE TEMPERLEY HASTA GLEW
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(9),estacionlineaTrenAbm.traerEstacionTren(10),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(9),estacionlineaTrenAbm.traerEstacionTren(11),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(9),estacionlineaTrenAbm.traerEstacionTren(12),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(9),estacionlineaTrenAbm.traerEstacionTren(13),seccionlineaTrenAbm.traerSeccionTren(1));
			
			
			// ------ DESDE ADROGUE HASTA GLEW
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(10),estacionlineaTrenAbm.traerEstacionTren(11),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(10),estacionlineaTrenAbm.traerEstacionTren(12),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(10),estacionlineaTrenAbm.traerEstacionTren(13),seccionlineaTrenAbm.traerSeccionTren(1));
			
			
			//---- DESDE BURZACO HASTA GLEW
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(11),estacionlineaTrenAbm.traerEstacionTren(12),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(11),estacionlineaTrenAbm.traerEstacionTren(13),seccionlineaTrenAbm.traerSeccionTren(1));
			
			
			
			//--- DESDE LONGCHAMPS A GLEW
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(12),estacionlineaTrenAbm.traerEstacionTren(13),seccionlineaTrenAbm.traerSeccionTren(1));
			
			
		
			
			//---------------------------------------------------------------------------
			//---------------------------------------------------------------------------
			
			//----DESDE GLEW A CONSTITUCION
			
			
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(13),estacionlineaTrenAbm.traerEstacionTren(1),seccionlineaTrenAbm.traerSeccionTren(3));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(13),estacionlineaTrenAbm.traerEstacionTren(2),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(13),estacionlineaTrenAbm.traerEstacionTren(3),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(13),estacionlineaTrenAbm.traerEstacionTren(4),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(13),estacionlineaTrenAbm.traerEstacionTren(5),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(13),estacionlineaTrenAbm.traerEstacionTren(6),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(13),estacionlineaTrenAbm.traerEstacionTren(7),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(13),estacionlineaTrenAbm.traerEstacionTren(8),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(13),estacionlineaTrenAbm.traerEstacionTren(9),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(13),estacionlineaTrenAbm.traerEstacionTren(10),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(13),estacionlineaTrenAbm.traerEstacionTren(11),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(13),estacionlineaTrenAbm.traerEstacionTren(12),seccionlineaTrenAbm.traerSeccionTren(1));
			
			

		
			
			//----DESDE LONGCHAMPS A CONSTITUCION
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(12),estacionlineaTrenAbm.traerEstacionTren(1),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(12),estacionlineaTrenAbm.traerEstacionTren(2),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(12),estacionlineaTrenAbm.traerEstacionTren(3),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(12),estacionlineaTrenAbm.traerEstacionTren(4),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(12),estacionlineaTrenAbm.traerEstacionTren(5),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(12),estacionlineaTrenAbm.traerEstacionTren(6),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(12),estacionlineaTrenAbm.traerEstacionTren(7),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(12),estacionlineaTrenAbm.traerEstacionTren(8),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(12),estacionlineaTrenAbm.traerEstacionTren(9),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(12),estacionlineaTrenAbm.traerEstacionTren(10),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(12),estacionlineaTrenAbm.traerEstacionTren(11),seccionlineaTrenAbm.traerSeccionTren(1));
			
			
			
			
			//---DESDE BURZACO A CONSTITUCION
			
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(11),estacionlineaTrenAbm.traerEstacionTren(1),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(11),estacionlineaTrenAbm.traerEstacionTren(2),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(11),estacionlineaTrenAbm.traerEstacionTren(3),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(11),estacionlineaTrenAbm.traerEstacionTren(4),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(11),estacionlineaTrenAbm.traerEstacionTren(5),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(11),estacionlineaTrenAbm.traerEstacionTren(6),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(11),estacionlineaTrenAbm.traerEstacionTren(7),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(11),estacionlineaTrenAbm.traerEstacionTren(8),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(11),estacionlineaTrenAbm.traerEstacionTren(9),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(11),estacionlineaTrenAbm.traerEstacionTren(10),seccionlineaTrenAbm.traerSeccionTren(1));
			
			
			
			//---DESDE ADROGUE A CONSTITUCION
			
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(10),estacionlineaTrenAbm.traerEstacionTren(1),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(10),estacionlineaTrenAbm.traerEstacionTren(2),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(10),estacionlineaTrenAbm.traerEstacionTren(3),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(10),estacionlineaTrenAbm.traerEstacionTren(4),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(10),estacionlineaTrenAbm.traerEstacionTren(5),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(10),estacionlineaTrenAbm.traerEstacionTren(6),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(10),estacionlineaTrenAbm.traerEstacionTren(7),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(10),estacionlineaTrenAbm.traerEstacionTren(8),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(10),estacionlineaTrenAbm.traerEstacionTren(9),seccionlineaTrenAbm.traerSeccionTren(1));
			
			
			
			//---DESDE TEMPERLEY A CONSTITUCION
			
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(9),estacionlineaTrenAbm.traerEstacionTren(1),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(9),estacionlineaTrenAbm.traerEstacionTren(2),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(9),estacionlineaTrenAbm.traerEstacionTren(3),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(9),estacionlineaTrenAbm.traerEstacionTren(4),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(9),estacionlineaTrenAbm.traerEstacionTren(5),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(9),estacionlineaTrenAbm.traerEstacionTren(6),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(9),estacionlineaTrenAbm.traerEstacionTren(7),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(9),estacionlineaTrenAbm.traerEstacionTren(8),seccionlineaTrenAbm.traerSeccionTren(1));
			
			
			//---DESDE LOMAS A CONSTITUCION
			
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(8),estacionlineaTrenAbm.traerEstacionTren(1),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(8),estacionlineaTrenAbm.traerEstacionTren(2),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(8),estacionlineaTrenAbm.traerEstacionTren(3),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(8),estacionlineaTrenAbm.traerEstacionTren(4),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(8),estacionlineaTrenAbm.traerEstacionTren(5),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(8),estacionlineaTrenAbm.traerEstacionTren(6),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(8),estacionlineaTrenAbm.traerEstacionTren(7),seccionlineaTrenAbm.traerSeccionTren(1));
			
			
			
			
			//---DESDE BANFIELD A CONSTITUCION
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(7),estacionlineaTrenAbm.traerEstacionTren(1),seccionlineaTrenAbm.traerSeccionTren(2));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(7),estacionlineaTrenAbm.traerEstacionTren(2),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(7),estacionlineaTrenAbm.traerEstacionTren(3),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(7),estacionlineaTrenAbm.traerEstacionTren(4),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(7),estacionlineaTrenAbm.traerEstacionTren(5),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(7),estacionlineaTrenAbm.traerEstacionTren(6),seccionlineaTrenAbm.traerSeccionTren(1));
			
			//---DESDE ESCALADA A CONSTITUCION
			
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(6),estacionlineaTrenAbm.traerEstacionTren(1),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(6),estacionlineaTrenAbm.traerEstacionTren(2),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(6),estacionlineaTrenAbm.traerEstacionTren(3),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(6),estacionlineaTrenAbm.traerEstacionTren(4),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(6),estacionlineaTrenAbm.traerEstacionTren(5),seccionlineaTrenAbm.traerSeccionTren(1));
			
					
			//---DESDE LANUS A CONSTITUCION
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(5),estacionlineaTrenAbm.traerEstacionTren(1),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(5),estacionlineaTrenAbm.traerEstacionTren(2),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(5),estacionlineaTrenAbm.traerEstacionTren(3),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(5),estacionlineaTrenAbm.traerEstacionTren(4),seccionlineaTrenAbm.traerSeccionTren(1));
			
			
			
			//---DESDE GERLI A CONSTITUCION
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(4),estacionlineaTrenAbm.traerEstacionTren(1),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(4),estacionlineaTrenAbm.traerEstacionTren(2),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(4),estacionlineaTrenAbm.traerEstacionTren(3),seccionlineaTrenAbm.traerSeccionTren(1));
		
			
			//---DESDE AVELLANEDA A CONSTITUCION
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(3),estacionlineaTrenAbm.traerEstacionTren(1),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(3),estacionlineaTrenAbm.traerEstacionTren(2),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(3),estacionlineaTrenAbm.traerEstacionTren(3),seccionlineaTrenAbm.traerSeccionTren(1));
			

			
			//---DESDE YRIGOYEN A CONSTITUCION
			
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(2),estacionlineaTrenAbm.traerEstacionTren(1),seccionlineaTrenAbm.traerSeccionTren(1));
			tarifaTrenABM.agregarTarifaTren(0,estacionlineaTrenAbm.traerEstacionTren(2),estacionlineaTrenAbm.traerEstacionTren(2),seccionlineaTrenAbm.traerSeccionTren(1));
		}
		catch(Exception e) {
			System.out.println("Error"+ e.getMessage());
		}
		}
		
}
