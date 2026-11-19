OORDENADA.JAVA
public class Coordenada {
private final int x, y; public Coordenada(int x, int y) {
this.x = x; this.y = y;
    }
    @Override
public boolean equals(Object o) {
if (!(o instanceof Coordenada c)) return false; return x == c.x && y == c.y;
    }
    @Override
public int hashCode() { return Objects.hash(x, y);
    } 
  Map<Coordenada, Personaje> mapa =
new HashMap<>();
mapa.put(new Coordenada(2, 3), aria);
// Sin equals/hashCode esto daría null
mapa.get(new Coordenada(2, 3)); // aria
// Agrupar objetos por categoría
Map<String, List<Personaje>> porClase =
new HashMap<>();
porClase
    .computeIfAbsent("Mago", k -> new ArrayList<>())
    .add(aria);
      