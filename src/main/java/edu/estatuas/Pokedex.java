package edu.estatuas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pokedex {

    private List<Pokemon> pokemons;

    public Pokedex(List<Pokemon> pokemons) {
        this.pokemons = new ArrayList<>(pokemons);
    }

    public List<Pokemon> getPokemons() {
        return new ArrayList<>(pokemons);
    }

    public Pokemon buscarPorId(int id) {
        for (Pokemon p : pokemons) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Pokemon> buscarPorNombre(String nombre) {
        return pokemons.stream()
                .filter(p -> p.getName().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }

    public List<Pokemon> buscarPorTipo(String tipo) {
        return pokemons.stream()
                .filter(p -> p.getTypes().contains(tipo))
                .collect(Collectors.toList());
    }

    public List<Pokemon> buscarPorHabilidad(String habilidad) {
        return pokemons.stream()
                .filter(p -> p.getAbility().equalsIgnoreCase(habilidad))
                .collect(Collectors.toList());
    }
}