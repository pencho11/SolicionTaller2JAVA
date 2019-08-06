package acciones;

import static constantes.ConstantesString.*;
import static constantes.ConstantesDouble.*;
import static constantes.ConstantesEnteros.*;

public class EntornoLogico  extends VariablesTextuales
{
    public double calcularMasa()
    {
        return ( this.getPeso()/(this.getEstatura()*this.getEstatura()));
    }

    public String mostrarMasa()
    {
        if ( this.calcularMasa() <= QUINCE.getNum() ){
            this.setCadena(TEXTO_PESO_UNO.getMensaje())  ;
        }
        else if ( this.calcularMasa() ==  QUINCE.getNum() || this.calcularMasa() <= QUINCE_PUNTO_NUEVE.getDecimales())
        {
            this.setCadena(TEXTO_PESO_DOS.getMensaje())  ;
        }
        else if ( this.calcularMasa() ==  DIECISEIS.getNum() || this.calcularMasa() <= DIECIOCHO_PUNTO_CUATRO.getDecimales())
        {
            this.setCadena(TEXTO_PESO_TRES.getMensaje())  ;
        }
        else if ( this.calcularMasa() ==  DIECIOCHO_PUNTO_CINCO.getDecimales() || this.calcularMasa() <= VENTICUATRO_NUEVE.getDecimales())
        {
            this.setCadena(TEXTO_PESO_CUATRO.getMensaje())  ;
        }
        else if ( this.calcularMasa() ==  VENTICINCO.getNum() || this.calcularMasa() <= VENTINUEVE_PUNTO_NUEVE.getDecimales())
        {
            this.setCadena(TEXTO_PESO_CINCO.getMensaje())  ;
        }
        else if ( this.calcularMasa() == TREINTA.getNum() || this.calcularMasa() <= TREINTAICUATRO_NUEVE.getDecimales())
        {
            this.setCadena(TEXTO_PESO_SEIS.getMensaje())  ;
        }
        else if ( this.calcularMasa() == TREINTAICINCO.getNum() || this.calcularMasa() <= TREINTAINUEVE_NUEVE.getDecimales())
        {
            this.setCadena(TEXTO_PESO_SIETE.getMensaje())  ;
        }
        else if ( this.calcularMasa() <= CUARENTA.getNum())
        {
            this.setCadena(TEXTO_PESO_OCHO.getMensaje())  ;
        }
        else
        {
            this.setCadena(CONTRO_DE_ERRORES.getMensaje());
        }
        return this.getCadena();
    }

    public String mostrarSigno()
    {
        if ((this.getMes() == TRES.getNum() && this.getDia() >= VENTIUNO.getNum() ) ||
                (this.getMes() == CUATRO.getNum() && this.getDia()<= VENTE.getNum() ))
        {
            this.setCadena(ARIES.getMensaje());
        }
        else if ((this.getMes() == CUATRO.getNum() && this.getDia() >= VENTIUNO.getNum() ) ||
                (this.getMes() == CINCO.getNum() && this.getDia()<= VENTE.getNum() ))
        {
            this.setCadena(TAURO.getMensaje());
        }
        else if ((this.getMes() == CINCO.getNum() && this.getDia() >= VENTIUNO.getNum() ) ||
                (this.getMes() == SEIS.getNum() && this.getDia()<= VENTIUNO.getNum() ))
        {
            this.setCadena(GEMENIS.getMensaje());
        }
        else if ((this.getMes() == SEIS.getNum() && this.getDia() >= VENTIDOS.getNum() ) ||
                (this.getMes() == SIETE.getNum() && this.getDia()<= VENTIDOS.getNum() ))
        {
            this.setCadena(CANCER.getMensaje());
        }
        else if ((this.getMes() == SIETE.getNum() && this.getDia() >= VENTITRES.getNum() ) ||
                (this.getMes() == OCHO.getNum() && this.getDia()<= VENTITRES.getNum() ))
        {
            this.setCadena(LEO.getMensaje());
        }
        else if ((this.getMes() == OCHO.getNum() && this.getDia() >= VENTICUATRO.getNum() ) ||
                (this.getMes() == NUEVE.getNum() && this.getDia()<= VENTITRES.getNum() ))
        {
            this.setCadena(VIRGO.getMensaje());
        }
        else if ((this.getMes() == NUEVE.getNum() && this.getDia() >= VENTICUATRO.getNum() ) ||
                (this.getMes() == DIEZ.getNum() && this.getDia()<= VENTIDOS.getNum() ))
        {
            this.setCadena(LIBRA.getMensaje());
        }
        else if ((this.getMes() == DIEZ.getNum() && this.getDia() >= VENTITRES.getNum() ) ||
                (this.getMes() == ONCE.getNum() && this.getDia()<= VENTIDOS.getNum() ))
        {
            this.setCadena(ESCORPIO.getMensaje());
        }
        else if ((this.getMes() == ONCE.getNum() && this.getDia() >= VENTITRES.getNum() ) ||
                (this.getMes() == DOCE.getNum() && this.getDia()<= VENTIDOS.getNum() ))
        {
            this.setCadena(SAGITARIO.getMensaje());
        }
        else if ((this.getMes() == DOCE.getNum() && this.getDia() >= VENTIDOS.getNum() ) ||
                (this.getMes() == UNO.getNum() && this.getDia()<= DIECINUEVE.getNum() ))
        {
            this.setCadena(CAPRICORNIO.getMensaje());
        }
        else if ((this.getMes() == UNO.getNum() && this.getDia() >= VENTE.getNum() ) ||
                (this.getMes() == DOS.getNum() && this.getDia()<= DIECINUEVE.getNum() ))
        {
            this.setCadena(ACUARIO.getMensaje());
        }
        else if ((this.getMes() == DOS.getNum() && this.getDia() >= VENTE.getNum() ) ||
                (this.getMes() == TRES.getNum() && this.getDia()<= VENTE.getNum() ))
        {
            this.setCadena(PICIS.getMensaje());
        }
        else
        {
            this.setCadena(ERROR_DE_DATOS.getMensaje());
        }
        return this.getCadena();
    }

    public Double calcularSalario()
    {
        for (int i = CERO.getNum();  i < this.getN() ; i++ )
        {
            this.setSumatorio(this.getSumatorio() + this.getSalario());
        }
        return this.getSumatorio();
    }
}
