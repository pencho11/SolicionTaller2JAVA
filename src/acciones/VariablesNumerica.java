package acciones ;

import static constantes.ConstantesEnteros.CERO;
import static constantes.ConstantesEnteros.CUARENTA;

public class VariablesNumerica
{
    private int opcion;

    private double estatura;

    private double peso;

    private byte dia;

    private byte mes;

    private int anio;

    private int n;

    private double salario;

    private double sumatorio;

    public VariablesNumerica() {
        this.n = CERO.getNum();
        this.opcion = CERO.getNum();
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }


    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSumatorio() {
        return sumatorio;
    }

    public void setSumatorio(double sumatorio) {
        this.sumatorio = sumatorio;
    }
}
