package Pessoa.Funcionario;

import Pessoa.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        f.setNome("João");
        f.setSalario(6530);

        System.out.println("Nome " + f.getNome() + "tem salário de : " + f.getSalario());
    }




}


