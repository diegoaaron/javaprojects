package com.prueba.trivia;

public class ChatGptClient {

    public String enviarPregunta(String pregunta) {

        return "{\n" +
                "\"category\": \"Cultura\",\n" +
                "\"question\": \"¿Quién es el autor de la pintura 'La noche estrellada'?\",\n" +
                "\"options\": [\n" +
                "\"Vincent van Gogh\",\n" +
                "\"Pablo Picasso\",\n" +
                "\"Leonardo da Vinci\"\n" +
                "],\n" +
                "\"answer\": \"1\",\n" +
                "\"explanation\": \"La respuesta correcta es Vincent van Gogh. 'La noche estrellada' es una famosa pintura postimpresionista creada por van Gogh en 1889. Esta obra maestra representa un paisaje nocturno estilizado con un cielo lleno de estrellas. Van Gogh es conocido por su estilo único y expresivo en sus obras.\"\n" +
                "}";
    }
}

/*
* Estoy armando una trivia, necesito que me des una pregunta de la categoria Cultura, con la siguiente estructura de JSON (es sumamente importante que tu respuesta solo tenga codigo json, sin ninguna otra aclaración). La respuesta de la pregunta no siempre tiene que ser la primera, tiene que variar:
{
  "category": "aca va el nombre de la categoria",
  "question": "aca va la pregunta",
  "option": [
    "aca va la opción 1",
    "aca va la opción 2",
    "aca va la opción 3"
  ],
  "answer": "aqui va la respuesta correcta en caso de ser la primera es el número 0, en caso de la segunda es el 1 y el tercero es el 2",
  "explanation": "aca tienes que poner una explicación diciendo porque es la respuesta correcta"
}
* */