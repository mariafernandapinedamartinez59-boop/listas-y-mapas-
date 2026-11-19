Map<String, Integer> puntos = new HashMap<>();
puntos.put("Aria", 120);
puntos.put("Borin", 80);
puntos.put("Aria", 150);            // reemplaza el valor puntos.get("Aria");                 // 150
puntos.getOrDefault("Zed", 0);      // 0
puntos.containsKey("Borin");        // true
puntos.putIfAbsent("Cael", 10);
puntos.merge("Cael", 5, Integer::sum); // 15
puntos.remove("Borin");
for (Map.Entry<String,Integer> e : puntos.entrySet()) {     System.out.println(e.getKey() + " = " + e.getValue()); }
