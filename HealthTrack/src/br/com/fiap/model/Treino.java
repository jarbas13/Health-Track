package br.com.fiap.model;

import java.util.List;

public class Treino {

    private int id;
    List<Aparelho> exerciciosList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Aparelho> getExerciciosList() {
        return exerciciosList;
    }

    public void setExerciciosList(List<Aparelho> exerciciosList) {
        this.exerciciosList = exerciciosList;
    }
}
