Lista dinámica respaldada por un arreglo redimensionable
Java
JAVA
List<String> nombres = new ArrayList<>();
nombres.add("Aria");          // agrega al final nombres.add(0, "Borin");      // inserta en posición 0 nombres.get(1);               // "Aria"
nombres.set(1, "Cael");       // reemplaza nombres.remove("Borin");      // por valor nombres.remove(0);            // por índice nombres.size();               // cantidad nombres.contains("Cael");     // true nombres.indexOf("Cael");      // posición o -1 nombres.isEmpty();            // false nombres.clear();        
PERSONAJE.JAVA
public class Personaje {
private final String nombre;
private int nivel;
public Personaje(String n, int lv) { this.nombre = n; this.nivel = lv;
    }
public String getNombre() {
return nombre;
    }
public int getNivel() { return nivel; EQUIPO.JAVA
public class Equipo {
private final List<Personaje> miembros         = new ArrayList<>();
public void agregar(Personaje p) {         miembros.add(p);
    }
public List<Personaje> getMiembros() { return List.copyOf(miembros);
    } 