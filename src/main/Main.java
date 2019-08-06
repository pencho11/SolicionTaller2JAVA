package main;

import acciones.EntornoLogico;
import javax.swing.*;

import static constantes.ConstantesEnteros.CERO;
import static constantes.ConstantesString.*;

public class Main
{
    public static void main(String[] args)
    {
        EntornoLogico logico = new EntornoLogico();
        do
        {
            String opc = JOptionPane.showInputDialog(null, MENU.getMensaje() );
            logico.setOpcion(Integer.parseInt(opc)) ;

            switch ( logico.getOpcion())
            {
                case 0:
                    JOptionPane.showMessageDialog(null, DESPEDIDA.getMensaje());
                    break;

                case 1:
                    String nombre = JOptionPane.showInputDialog(null, PEDIR_NOMBRE.getMensaje());
                    logico.setNombre(nombre);

                    String peso = JOptionPane.showInputDialog(null, PESO_KG.getMensaje());
                    logico.setPeso(Double.parseDouble(peso)) ;

                    String estatura = JOptionPane.showInputDialog(null, ESTATURA_MTS.getMensaje());
                    logico.setEstatura(Double.parseDouble(estatura));

                    JOptionPane.showMessageDialog(null, BIENBENIDO.getMensaje() + logico.getNombre()
                            + ESTADO_ACTUAL.getMensaje() + logico.mostrarMasa() + PUNTO.getMensaje());
                    break;

                case 2:
                    String nom = JOptionPane.showInputDialog(null, PEDIR_NOMBRE.getMensaje());
                    logico.setNombre(nom);


                    String dia = JOptionPane.showInputDialog(null, DIA_NACIMIENTO.getMensaje());
                    logico.setDia(Byte.parseByte(dia));

                    String mes = JOptionPane.showInputDialog(null, MES_NACIMIENTO.getMensaje());
                    logico.setMes(Byte.parseByte(mes));

                    String anio = JOptionPane.showInputDialog(null, ANIO_NACIMIENTO.getMensaje());
                    logico.setAnio(Integer.parseInt(anio));

                    JOptionPane.showMessageDialog(null,BIENBENIDO.getMensaje() + logico.getNombre() +
                            ESPACIO.getMensaje()+logico.mostrarSigno());
                    break;

                case 3:
                    do
                    {
                        String salario = JOptionPane.showInputDialog(null, PEDIR_SALARIO.getMensaje());
                        logico.setSalario(Integer.parseInt(salario));

                        String pregunta = JOptionPane.showInputDialog(null, PREGUNTA_SALARIO);
                        logico.setN(Integer.parseInt(pregunta));
                    }
                    while (logico.getN() == CERO.getNum()) ;
                    JOptionPane.showMessageDialog(null,SALARIO.getMensaje()+ logico.getSumatorio() +SUMA.getMensaje()
                            + logico.calcularSalario() );
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, VECTOR.getMensaje());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, ADVERTENCIA.getMensaje());
                    break;
            }

        }
        while ( logico.getOpcion() != CERO.getNum() );
    }
}