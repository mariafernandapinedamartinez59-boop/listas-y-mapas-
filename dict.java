YTHON
puntos = {"Aria": 120, "Borin": 80}
puntos["Cael"] = 10                # agrega o reemplaza puntos["Aria"]                     # 120 (KeyError si no existe) puntos.get("Zed", 0)              # 0
"Borin" in puntos                 # True
puntos.setdefault("Zed", 0)
puntos.pop("Borin")
for nombre, pts in puntos.items():
print(nombre, pts)
# dict comprehension
doble = {k: v * 2 for k, v in puntos.items()}
# ordenar por valor
top = sorted(puntos.items(), key=lambda kv: kv[1], reverse=True)
