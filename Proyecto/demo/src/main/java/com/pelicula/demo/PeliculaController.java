package com.pelicula.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PeliculaController 
{
    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController()
    {
        peliculas.add(new Pelicula(1, "Kun Fu Panda 4", 2024, "Mike Mitchell", "Aventura", "Cuarta entrega de la franquicia Kung Fu Panda en la que Po, el panda experto en artes marciales, deberá proteger el Valle de la Paz de las garras de una malvada y poderosa hechicera, La Camaleona. En esta nueva aventura conocerá a Zhen, una astuta y rápida ladrona, cuyas habilidades resultarán de gran ayuda."));
        peliculas.add(new Pelicula(2, "Alicia en el Pais de las Maravillas", 2010, "Tim Burton", "Fantasia", "Alicia (Mia Wasikowska) tiene 19 años y está a punto de recibir una propuesta de matrimonio que no le hace demasiada ilusión, por no decir ninguna"));
        peliculas.add(new Pelicula(3, "Mi Villano Favorito", 2017, "Eric Guillon", "Animacion", "A Gru lo han despedido. Se ha quedado sin trabajo porque ha dejado escapar al supervillano Balthazar Bratt."));
        peliculas.add(new Pelicula(4, "Hotel Transilvania 2", 2015, "Genny Tartakovsky", "Animacion", "Las cosas han cambiado mucho en el Hotel Transilvania, parece que todo está patas arriba en la estancia de los monstruos, ya que la férrea política que llevaba a cabo Drácula de admitir en el hotel solamente a monstruos está cambiando."));
        peliculas.add(new Pelicula(5, "El Grinch", 2000, "Ron Howard", "infantil", "El Grinch es un espantajo de pelaje verde que luce una elástica sonrisa de oreja a oreja. Misántropo exiliado, lleva 53 años viviendo en una cueva en el Monte Crumpit con su perro Max"));
    }

    @GetMapping("/peliculas")
    public List<Pelicula>GetPelicula()
    {
        return peliculas;
    }


    @GetMapping("/peliculas/{id}")
    public Pelicula getPeliculaById(@PathVariable int id)
    {
        for (Pelicula pelicula : peliculas)
        {
            if (pelicula.getId() == id) 
            {
              return pelicula;    
            }
        }
        return null;
    }

}
