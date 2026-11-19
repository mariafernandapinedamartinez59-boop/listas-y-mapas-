ORDEN NATURAL
public class Personaje
implements Comparable<Personaje> {     // ...
    @Override
public int compareTo(Personaje o) { return Integer.compare(nivel, o.nivel);
    }
}
Collections.sort(lista);
COMPARATOR
// Orden alterno sin tocar la clase
lista.sort(Comparator
    .comparing(Personaje::getNombre));
// Por nivel descendente, luego nombre
lista.sort(Comparator
    .comparingInt(Personaje::getNivel)
    .reversed()
    .thenComparing(Personaje::getNombre)
    