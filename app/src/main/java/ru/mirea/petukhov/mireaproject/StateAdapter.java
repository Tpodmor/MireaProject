package ru.mirea.petukhov.mireaproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<com.mirea.kuznetsova.mireaproject.History.Note> states;

    StateAdapter(Context context, List<com.mirea.kuznetsova.mireaproject.History.Note> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        com.mirea.kuznetsova.mireaproject.History.Note state = states.get(position);
        holder.nameView.setText(state.getName());
        holder.capitalView.setText(state.getText());
    }

    @Override
    public int getItemCount() {
        return states.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {

        final TextView nameView, capitalView;

        ViewHolder(View view){

            super(view);

            nameView = (TextView) view.findViewById(R.id.name);

            capitalView = (TextView) view.findViewById(R.id.text_history);

        }
    }
}
