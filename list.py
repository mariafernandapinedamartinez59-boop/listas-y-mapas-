nombres = ["Aria", "Borin"]
nombres.append("Cael")        # al final
nombres.insert(0, "Zed")      # en posición 0
nombres[1]                    # "Aria"
nombres[-1]                   # último: "Cael"
nombres[1:3]                  # slicing
nombres.remove("Zed")         # por valor
nombres.pop()                 # quita y devuelve el último len(nombres)                  # cantidad
"Aria" in nombres            # pertenencia
cuadrados = [n**2 for n in range(5)]   # comprehension pares = [n for n in range(10) if n % 2 == 0
EQUIPO.PY
from dataclasses import dataclass
@dataclass
class Personaje:
    nombre: str
    nivel: int
class Equipo:
def __init__(self):
self._miembros: list[Personaje] = []
def agregar(self, p: Personaje):
self._miembros.append(p)
    @property
def miembros(self):
return tuple(self._miembros)  # solo lecturaUSO
eq = Equipo()
eq.agregar(Personaje("Aria", 12))
eq.agregar(Personaje("Borin", 4))
# filtrar
fuertes = [p.nombre for p in eq.miembros
if p.nivel >= 10]
# ordenar por criterio
orden = sorted(eq.miembros,
               key=lambda p: p.nivel,
               reverse=True)
# promedio
prom = sum(p.nivel for p in eq.miembros) / len(eq.miembros