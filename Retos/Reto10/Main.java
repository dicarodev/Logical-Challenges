package com.dicarodev;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * Llamar a una API es una de las tareas más comunes en programación.
         *
         * Implementa una llamada HTTP a una API (la que tú quieras) y muestra su
         * resultado a través de la terminal. Por ejemplo: Pokémon, Marvel...
         *
         * Aquí tienes un listado de posibles APIs:
         * https://github.com/public-apis/public-apis
         */

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PokemonService pokemonService = retrofit.create(PokemonService.class);

        Call<Pokemon> pokemonCall = pokemonService.getPokemon("bulbasaur");

        pokemonCall.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                if (response.isSuccessful())
                    System.out.println(response.body());
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable throwable) {
                System.out.println("Error al resolver la petición");
            }
        });

    }
        public interface PokemonService {
            @GET("pokemon/{name}/")
            Call<Pokemon> getPokemon(@Path("name") String name);

        }
    }