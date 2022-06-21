import java.util.Scanner;
import java.util.Date;  
import java.text.DateFormat;
import java.time.LocalDate;

public class Data {
	Scanner read = new Scanner(System.in);
	private int dia;
	private int mes;
	private int ano;
	
		public Data() {
			entraDia();
			entraMes();
			entraAno();
		}
		
		Data(int d, int m, int a){
			this.dia = d;
			this.mes = m;
			this.ano = a;
		}
		
		public void entraDia(int d) {
			this.dia = d;
		}
		
		public void entraMes(int m) {
			this.mes = m;
		}
		
		public void entraAno(int a) {
			this.ano = a;
		}
		
		public void entraDia() {
			int d = read.nextInt();
			while(d>31 || d<0) {
				System.out.println("Entrada inválida. Refaça o processo:");
				d = read.nextInt();
			}
			entraDia(d);
		}
		
		public void entraMes() {
			int m = read.nextInt();
			while(m>12 || m<0) {
				System.out.println("Entrada inválida. Refaça o processo:");
				m = read.nextInt();
			}
			entraMes(m);
		}
		
		public void entraAno() {
			int a = read.nextInt();
			while(a>9999 || a<0) {
				System.out.println("Entrada inválida. Refaça o processo:");
				a = read.nextInt();
			}
			entraAno(a);
		}
		
		public int retDia(){
			return dia;
		}
		
		public int retMes() {
			return mes;
		}
		
		public int retAno() {
			return ano;
		}
		
		public String mostra1() {
			String d = String.valueOf(dia);
			String m = String.valueOf(mes);
			String a = String.valueOf(ano);
			
			String dtf = d + "/" + m + "/" + a;
			
			return dtf;
		}
		
		public String mostra2() {
			String d = String.valueOf(dia);
			String m = "indefinido";
			String a = String.valueOf(ano);
			
			switch(mes) {
			case 1:
				m = "Janeiro";
			break;
			case 2:
				m = "Fevereiro";
			break;
			case 3:
				m = "Março";
			break;
			case 4:
				m = "Abril";
			break;
			case 5:
				m = "Maio";
			break;
			case 6:
				m = "Junho";
			break;
			case 7:
				m = "Julho";
			break;
			case 8:
				m = "Agosto";
			break;
			case 9:
				m = "Setembro";
			break;
			case 10:
				m = "Outubro";
			break;
			case 11:
				m = "Novembro";
			break;
			case 12:
				m = "Dezembro";
			break;
			}
			String dtf = d + "/" + m + "/" + a;
			return dtf;
			}
		
			public boolean bissexto() {
				boolean bisxt;
				if(ano % 4 != 0) {
					bisxt = false;
				}
				else {
					bisxt = true;
				}
				
				return bisxt;
			}
			
			public int diasTranscorridos() {
				int dt = dia;
				dt += 30 * mes;
				
				return dt;
			}
				
			public LocalDate apresentaDataAtual() {
				LocalDate datual = LocalDate.now();
				return datual;
			}
			
			
		}

