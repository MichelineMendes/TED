package Pessoa.Cliente;

import Pessoa.Pessoa;

public class TesteCliente {
    public static void main(String[] args) {
       Cliente c = new Cliente();

       c.setCodigo ("001");
       c.setNome ("Maria");


        System.out.println("A cliente "  + c.getNome() + " tem código : " + c.getCodigo());

    }
}
