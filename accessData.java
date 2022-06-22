
public class accessData {

	public static void main(String[] args) {
		Data aniversario = new Data();
		System.out.println(aniversario.retDia());
		System.out.println(aniversario.retMes());
		System.out.println(aniversario.retAno());
		System.out.println(aniversario.mostra1());
		Data morte = new Data(3, 5, 2007);
		System.out.println(morte.retDia());
		System.out.println(morte.retMes());
		System.out.println(morte.retAno());
		System.out.println(morte.mostra1());
		System.out.println(morte.mostra2());
		Data feriado = new Data(16, 6, 2016);
		System.out.println(feriado.bissexto());
		Data.apresentaDataAtual();
	}

}
