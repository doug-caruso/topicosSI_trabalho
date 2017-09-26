package br.edu.univas.si8.ta.ex;

public class CalculadoraServiceImpl implements CalculadoraService{


	@Override
	public Result somar(int first, int second) {
		int result = first + second;
		return new Result().withFirst(first).withSecond(second).withResult(result);
	}

	@Override
	public Result subtrair(int first, int second) {
		int result = first - second;
		return new Result().withFirst(first).withSecond(second).withResult(result);
	}

}
