package com.objetos;

public class Director extends Empleado {
    public Director(){
        //DEBEMOS INDICAR EL SALARIO MINIMO A 200 MAS QUE EL EMPLEADO
        //NECESITAMOS EL SALARIO MINIMO DEL EMPLEADO (1200)
        int salMinimo = super.getSalarioMinimo();
        this.setSalarioMinimo(salMinimo + 200);
    }
}
