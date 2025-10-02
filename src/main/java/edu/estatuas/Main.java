package edu.estatuas;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Capture {

    private Pokedex pokedex;

    public Capture(String archivoJson) {
        this.pokedex = new Pokedex();
        cargarPokemonDesdeJson(archivoJson);
    }

    private void cargarPokemonDesdeJson(String archivoJson) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(new File(archivoJson));
            JsonNode listaPokemon = root.path("pokedex").path("pokemon");

            for (JsonNode nodoPokemon : listaPokemon) {
                int id = Integer.parseInt(nodoPokemon.path("-id").asText());
                String name = nodoPokemon.path("name").asText();
                String ability = nodoPokemon.path("ability").asText();
                int exp = Integer.parseInt(nodoPokemon.path("exp").asText());

                // Tipos
                List<String> tipos = new ArrayList<>();
                for (JsonNode tipo : nodoPokemon.path("type")) {
                    tipos.add(tipo.asText());
                }

                // Stats
                JsonNode statsNode = nodoPokemon.path("stats");
                Stats stats = new Stats(
                        Integer.parseInt(statsNode.path("HP").asText()),
                        Integer.parseInt(statsNode.path("ATK").asText()),
                        Integer.parseInt(statsNode.path("DEF").asText()),
                        Integer.parseInt(statsNode.path("SPD").asText()),
                        Integer.parseInt(statsNode.path("SAT").asText()),
                        Integer.parseInt(statsNode.path("SDF").asText())
                );

                Pokemon pokemon = new Pokemon(id, name, tipos, ability, exp, stats);

                pokedex.agregarPokemon(pokemon);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Pokedex getPokedex() {
        return pokedex;
    }