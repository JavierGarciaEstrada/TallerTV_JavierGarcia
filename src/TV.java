public class TV {
    private String dueño;
    private String dañoOriginal;
    private String fechaIngreso;
    private String fechaSalida;
    private String recibe;
    private String DañoSolucionado;

    public TV(String dueño, String dañoOriginal, String fechaIngreso, String fechaSalida, String recibe, String dañoSolucionado) {
        this.dueño = dueño;
        this.dañoOriginal = dañoOriginal;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.recibe = recibe;
        DañoSolucionado = dañoSolucionado;
    }



    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getDañoOriginal() {
        return dañoOriginal;
    }

    public void setDañoOriginal(String dañoOriginal) {
        this.dañoOriginal = dañoOriginal;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getRecibe() {
        return recibe;
    }

    public void setRecibe(String recibe) {
        this.recibe = recibe;
    }

    public String getDañoSolucionado() {
        return DañoSolucionado;
    }

    public void setDañoSolucionado(String dañoSolucionado) {
        DañoSolucionado = dañoSolucionado;
    }

    public String RecibirTV(){
        System.out.println("El cliente: "+getDueño());
        System.out.println("Ingresa en la fecha: "+getFechaIngreso());
        System.out.println("Una tv con daño en: "+dañoOriginal);
        return "";
    }
    public String EntregarTV(){
        System.out.println("En la fecha: "+getFechaSalida());
        System.out.println("Se entrega la television de: " + getDueño());
        System.out.println("Teniendo daño original en: " + getDañoOriginal());
        System.out.println("Teniendo una reparacion en: " + getDañoSolucionado());
        System.out.println("Recibiendola: "+ getRecibe());
        return "";
    }

}

