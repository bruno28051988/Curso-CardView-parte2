package com.br.cursocardview_parte2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.br.cursocardview_parte2.R;
import com.br.cursocardview_parte2.model.Postagem;

import java.util.List;

public class PostagemAdater extends RecyclerView.Adapter<PostagemAdater.MyViewHolder> {

    private List<Postagem> postagens;

    public PostagemAdater(List<Postagem> listaPostagens) {
        this.postagens = listaPostagens;
    }

    @NonNull
    @Override
    //Cria a visualização
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_detalhe, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    //Exibe a visualização
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Postagem postagem = postagens.get(position);
        holder.textNome.setText(postagem.getNome());
        holder.textPostagem.setText(postagem.getPostagem());
        holder.imagePostagem.setImageResource(postagem.getImagem());
    }

    @Override
    //Faz a contagem de itens criados
    public int getItemCount() {
        return postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textNome;
        private TextView textPostagem;
        private ImageView imagePostagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.textPostagem);
            imagePostagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
}
