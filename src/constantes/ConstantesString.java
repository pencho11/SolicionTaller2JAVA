package constantes ;

public enum ConstantesString
{
    MENU("Menu \n 0 salir \n 1 Peso corporal.\n  2 Signo Zodiacal. \n 3 Salario. \n 4 Vectores. "),
    DESPEDIDA("Gracias por usar el sistema. Buena suerte."),
    PEDIR_NOMBRE("ingrese su nombre: "),
    PESO_KG("ingrese peso en Kilogramos (Kg)"),
    ESTATURA_MTS("Ingrese su estatura en Metros (mts)"),
    BIENBENIDO("Bienvenido "),
    ESTADO_ACTUAL(".\n actualmente su estado es  "),
    PUNTO("."),
    DIA_NACIMIENTO("ingrese día de nacimiento"),
    MES_NACIMIENTO("ingrese mes de nacimiento"),
    ANIO_NACIMIENTO("ingrese año de nacimiento"),
    ESPACIO(" "),
    PEDIR_SALARIO("ingrese salario"),
    PREGUNTA_SALARIO("volver a ingresar salario ? \n presiona 0 de lo contrario 1 "),
    SALARIO("Salario "),
    SUMA("\nsuma: "),
    VECTOR("VECTOR"),
    ADVERTENCIA("Por favor ingrese el numero correspondiente."),
    CONTRO_DE_ERRORES("No Existe clasificacion"),
    ARIES("Aries\nAstro: Marte y Plutón | Elemento: Fuego"),
    TAURO("Tauro\nAstro: Venus y Tierra | Elemento: Tierra"),
    GEMENIS("Gémenis\nAstro: Mercurio | Elemento: Aire"),
    CANCER("Cáncer\nAstro: Luna | Elemento: Agua"),
    LEO("Leo\nAstro: Sol | Elemento: Fuego"),
    VIRGO("Virgo\nAstro: Mercurio | Elemento: Tierra"),
    LIBRA("Libra\nAstro: Venus | Elemento: Aire"),
    ESCORPIO("Escorpio\nAstro: Plutón y Marte | Elemento: Agua"),
    SAGITARIO("Sagitario\n Astro: Júpiter | Elemento: Fuego"),
    CAPRICORNIO("Capricornio\n Astro: Saturno | Elemento: Tierra"),
    ACUARIO("Acuario\n Astro: Urano y Saturno | Elemento: Aire"),
    PICIS("Piscis\n Astro: Neptuno y Júpiter | Elemento: Agua"),
    ERROR_DE_DATOS("¡ERROR!\nIngresar los datos correctamente."),
    TEXTO_PESO_UNO("Delgadez muy cevera"),
    TEXTO_PESO_DOS("Delgadez cevera"),
    TEXTO_PESO_TRES("Delgadez"),
    TEXTO_PESO_CUATRO("Peso saludable"),
    TEXTO_PESO_CINCO("Sobre peso"),
    TEXTO_PESO_SEIS("Obesidad moderada"),
    TEXTO_PESO_SIETE("Obesidad severa"),
    TEXTO_PESO_OCHO("Obesidad muy severa");

    private String mensaje ;

     ConstantesString(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }


}
