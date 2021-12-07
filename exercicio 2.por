//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

programa
{
	
	funcao inicio()
	{
		real idade, ano, dias, mes
		escreva ("Insira a sua idade em dias: ")
		leia (dias)
	
		ano = dias / 365
		escreva ("\nA sua idade em anos é: " + ano)
		mes = dias / 30
		escreva ("\nA sua idade em meses é: " + mes) 
		dias = mes * 30
		escreva ("\nA sua idade em dias é: " + dias)

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */