package com.objetos;

public class Director extends Empleado {
    @Override
    public int getDiasVacaciones(){
        return 30;
    }

    public Director(){
        //DEBEMOS INDICAR EL SALARIO MINIMO A 200 MAS QUE EL EMPLEADO
        //NECESITAMOS EL SALARIO MINIMO DEL EMPLEADO (1200)
        int salMinimo = super.getSalarioMinimo();
        this.setSalarioMinimo(salMinimo + 200);
    }
}
