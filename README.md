

<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="">
</head>
<body>
	<h1>Sort algorithm - Teste de eficiencia</h1>
	<p>
              Estrutura feita, para defesa do artigo, na disciplina de <strong>ESTRUTURA DE DADOS II.</strong>
       </p>
	<p>Com intuito de testar a eficiencia dos algoritmos de ornação</p>
	<p><i>Professor Ministrador: Altieres de Mattos</i></p>
	<h2>Algoritmos utilizados</h2>
	<ul>
	    <li><a href="http://www.ft.unicamp.br/liag/siteEd/definicao/bubble-sort.php">Bubble Sort</a></li>
	    <li><a href="http://www.ft.unicamp.br/liag/siteEd/definicao/selection-sort.php">Selection Sort</a></li>
	    <li><a href="http://www.ft.unicamp.br/liag/siteEd/definicao/insertion-sort.php">Insert Sort</a></li>
	    <li><a href="http://www.ft.unicamp.br/liag/siteEd/definicao/quick-sort.php">Quick Sort</a></li>
	</ul>
	<h2>Informações extras</h2>
	<p>Os Teste foram executados em um maquina com processador Core i3, com 4 gigas de memória.<br>
	 Todos os teste foram calculados em Mille segundo, o tempo pode sofrer alterações dependendo das configurações do computador, que está sendo utiliado.</p>
	 <p>Os Métodos de leitura de arquivo e gravação desconsiderados do calculo no tempo de execução</p>
	<h2>Resultados dos testes de desempenhos</h2>
	<table>
		<caption>Arquivos Ordenados</caption>
		<thead>
			<tr>
				<th></th>
				<th>10</th>
				<th>100</th>
				<th>1000</th>
				<th>10000</th>
				<th>100000</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Bubble Sort</td>
				<td>0</td>
				<td>0</td>
				<td>19</td>
				<td>47</td>
				<td>3745</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Select Sort</td>
				<td>0</td>
				<td>0</td>
				<td>7</td>
				<td>26</td>
				<td>2368</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Insert Sort</td>
				<td>0</td>
				<td>0</td>
				<td>0</td>
				<td>0</td>
				<td>7</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Quick Sort</td>
				<td>0</td>
				<td>0</td>
				<td>4</td>
				<td>78</td>
				<td>-</td>
				<td>Ms</td>
			</tr>
		</tbody>
	</table>
	<table>
		<caption>Arquivos Desordenados</caption>
		<thead>
			<tr>
				<th></th>
				<th>10</th>
				<th>100</th>
				<th>1000</th>
				<th>10000</th>
				<th>100000</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Bubble Sort</td>
				<td>0</td>
				<td>0</td>
				<td>9</td>
				<td>161</td>
				<td>23318</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Select Sort</td>
				<td>0</td>
				<td>0</td>
				<td>6</td>
				<td>63</td>
				<td>5267</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Insert Sort</td>
				<td>0</td>
				<td>0</td>
				<td>5</td>
				<td>84</td>
				<td>1218</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Quick Sort</td>
				<td>0</td>
				<td>0</td>
				<td>0</td>
				<td>3</td>
				<td>15</td>
				<td>Ms</td>
			</tr>
		</tbody>
	</table>
	<table>
		<caption>Arquivos Decrescente</caption>
		<thead>
			<tr>
				<th></th>
				<th>10</th>
				<th>100</th>
				<th>1000</th>
				<th>10000</th>
				<th>100000</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Bubble Sort</td>
				<td>0</td>
				<td>1</td>
				<td>12</td>
				<td>68</td>
				<td>10284</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Select Sort</td>
				<td>0</td>
				<td>1</td>
				<td>5</td>
				<td>93</td>
				<td>5524</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Insert Sort</td>
				<td>0</td>
				<td>1</td>
				<td>6</td>
				<td>109</td>
				<td>2704</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Quick Sort</td>
				<td>0</td>
				<td>0</td>
				<td>4</td>
				<td>99</td>
				<td>-</td>
				<td>Ms</td>
			</tr>
		</tbody>
	</table>
	<table>
		<caption>Arquivos Desordenados 10% a direita</caption>
		<thead>
			<tr>
				<th></th>
				<th>10</th>
				<th>100</th>
				<th>1000</th>
				<th>10000</th>
				<th>100000</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Bubble Sort</td>
				<td>0</td>
				<td>0</td>
				<td>10</td>
				<td>138</td>
				<td>4854</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Select Sort</td>
				<td>0</td>
				<td>0</td>
				<td>8</td>
				<td>71</td>
				<td>5290</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Insert Sort</td>
				<td>0</td>
				<td>0</td>
				<td>2</td>
				<td>24</td>
				<td>953</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Quick Sort</td>
				<td>0</td>
				<td>0</td>
				<td>1</td>
				<td>5</td>
				<td>21</td>
				<td>Ms</td>
			</tr>
		</tbody>
	</table>
	<table>
		<caption>Arquivos Desordenados 10% a esquerda</caption>
		<thead>
			<tr>
				<th></th>
				<th>10</th>
				<th>100</th>
				<th>1000</th>
				<th>10000</th>
				<th>100000</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Bubble Sort</td>
				<td>0</td>
				<td>0</td>
				<td>8</td>
				<td>43</td>
				<td>6927</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Select Sort</td>
				<td>0</td>
				<td>1</td>
				<td>8</td>
				<td>63</td>
				<td>5258</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Insert Sort</td>
				<td>0</td>
				<td>1</td>
				<td>2</td>
				<td>23</td>
				<td>971</td>
				<td>Ms</td>
			</tr>
			<tr>
				<td>Quick Sort</td>
				<td>0</td>
				<td>0</td>
				<td>2</td>
				<td>13</td>
				<td>47</td>
				<td>Ms</td>
			</tr>
		</tbody>
	</table>
	<p><i><strong>Observações:</strong>significado <strong>-</strong>: Estouro de memória do computador (não conseguiu calcular)</i></p>

</body>
</html>



