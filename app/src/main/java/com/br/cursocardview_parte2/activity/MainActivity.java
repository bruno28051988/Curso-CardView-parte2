package com.br.cursocardview_parte2.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.br.cursocardview_parte2.R;
import com.br.cursocardview_parte2.adapter.PostagemAdater;
import com.br.cursocardview_parte2.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        //testando a forma de apresentar
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Define adapter
        this.criarPostagens();
        PostagemAdater adater = new PostagemAdater(postagens);
        recyclerPostagem.setAdapter(adater);
    }

    public void criarPostagens(){

        Postagem postagem = new Postagem("Bruno Rodrigues Bordin", "#tbt Amo viajar S2", R.drawable.imagem1);
        this.postagens.add(postagem);

        postagem = new Postagem("Maria Garcia", "#Acima das nuvens", R.drawable.imagem2);
        this.postagens.add(postagem);

        postagem = new Postagem("Patricia Oliboni do Amaral", "#paris", R.drawable.imagem3);
        this.postagens.add(postagem);

        postagem = new Postagem("Betina Ratine", "Vivendo a vida", R.drawable.imagem4);
        this.postagens.add(postagem);






    }
}