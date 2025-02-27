package STUDYJAVA.exercises.OopIntherence.objects;

// Classe que representa um ponto no plano cartesiano
public class Point {
    private int x; // Coordenada x do ponto
    private int y; // Coordenada y do ponto

    // Construtor padrão que inicializa o ponto na origem (0,0)
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Construtor com parâmetros que inicializa o ponto com as coordenadas passadas
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Método para obter o valor da coordenada x
    public int getX() {
        return x;
    }

    // Método para definir o valor da coordenada x
    public void setX(int x) {
        this.x = x;
    }

    // Método para obter o valor da coordenada y
    public int getY() {
        return y;
    }

    // Método para definir o valor da coordenada y
    public void setY(int y) {
        this.y = y;
    }

    // Método que calcula a distância do ponto até a origem (0,0) usando o teorema de Pitágoras
    public double distance(){
        return Math.sqrt((x*x) + (y * y));
    }

    // Método que calcula a distância entre o ponto atual e outro ponto, fornecido como argumento
    public double distance(Point other){
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
    }

    // Método que calcula a distância entre o ponto atual e um ponto especificado pelas coordenadas x e y fornecidas como argumentos
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y,2));
    }
}
