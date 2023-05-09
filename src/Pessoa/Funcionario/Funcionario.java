package Pessoa.Funcionario;

import Pessoa.Pessoa;

import java.util.Date;


public class Funcionario extends Pessoa {
    private Integer matricula;
    private Date dataAdmissao;


    private  double salario;



private double reajustarSalario() {
    this.salario += 10;
    return this.salario;
}

    public double getSalario() {
    reajustarSalario();
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
