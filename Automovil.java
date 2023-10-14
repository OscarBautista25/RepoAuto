public class Automovil {
    String marca;
    int modelo;
    double motor;
    int numeroPuertas;
    int cantidadAsientos;
    double velocidadMaxima;
    double velocidadActual=0;
    enum tipoComb{
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }
    tipoComb tipoCombustible;

    enum tipoAuto{
        SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }
    tipoAuto tipoAutomovil;

    enum tipoColor{
        BLANCO, NEGRO, ROJO, AMARILLO, NARANJA, VERDE, AZUL, VIOLETA
    }
    tipoColor Color;
    public Automovil(String marca, int modelo, double motor, int numeroPuertas, int cantidadAsientos,
            double velocidadMaxima, Automovil.tipoComb tipoCombustible,
            Automovil.tipoAuto tipoAutomovil, Automovil.tipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        Color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public double getMotor() {
        return motor;
    }
    public void setMotor(double motor) {
        this.motor = motor;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    public int getCantidadAsientos() {
        return cantidadAsientos;
    }
    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public double getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    public tipoComb getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(tipoComb tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public tipoAuto getTipoAutomovil() {
        return tipoAutomovil;
    }
    public void setTipoAutomovil(tipoAuto tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    public tipoColor getColor() {
        return Color;
    }
    public void setColor(tipoColor color) {
        Color = color;
    }

    void acelerar(int incrementoVelocidad){
        if ((velocidadActual+incrementoVelocidad)<velocidadMaxima) {
            velocidadActual=velocidadActual+incrementoVelocidad;
        } else {
            System.out.println("No puede incrementar a una velocidad superior a la máxima");
        }

    }
    void desacelerar(int decrementoVelocidad){
        if ((velocidadActual-decrementoVelocidad)>0) {
            velocidadActual=velocidadActual-decrementoVelocidad;
        } else {
            System.out.println("No se puede desacelerar por debajo de 0");
        }
    }
    
    void frenar(){
        velocidadActual=0;
    }

    double calcularTiempoLlegada(int distancia){
        return distancia/velocidadActual;
    }

    void imprimir(){
        System.out.println("Marca = " +marca);
        System.out.println("Modelo = "+modelo);
        System.out.println("Motor = " +motor);
        System.out.println("Tipo de combustible = " +tipoCombustible);
        System.out.println("Tipo de automovil = " +tipoAutomovil);
        System.out.println("Número de puertas = " +numeroPuertas);
        System.out.println("Cantidad de asientos = " +cantidadAsientos);
        System.out.println("Velocidad Máxima = " +velocidadMaxima);
        System.out.println("Color = " +Color);

    }
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", 2014, 2, 5, 2, 250, tipoComb.GASOLINA, tipoAuto.SUV, tipoColor.NEGRO);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " +auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " +auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " +auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual = " +auto1.velocidadActual);
        auto1.desacelerar(10);
        System.out.println("Velocidad actual = " +auto1.velocidadActual);
    }
    

    
    
}