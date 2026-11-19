// 1) for-each (lo más común)
for (Personaje p : equipo.getMiembros()) {     System.out.println(p.getNombre());
}
// 2) Iterator: permite borrar al recorrer
Iterator<Personaje> it = lista.iterator(); while (it.hasNext()) {
if (it.next().getNivel() < 5) it.remove(); 
ESTILO FUNCIONAL
// 3) removeIf (más simple)
lista.removeIf(p -> p.getNivel() < 5);
// 4) Streams: filtrar, transformar, agrupar List<String> fuertes = lista.stream()
    .filter(p -> p.getNivel() >= 10)
    .map(Personaje::getNombre)
    .toList();
double prom = lista.stream()
    .mapToInt(Personaje::getNivel)
    .average().orElse(0)
    