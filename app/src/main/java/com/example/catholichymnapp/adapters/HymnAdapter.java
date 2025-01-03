package com.example.catholichymnapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.catholichymnapp.R;
import com.example.catholichymnapp.models.Hymn;

import java.util.List;

public class HymnAdapter extends RecyclerView.Adapter<HymnAdapter.HymnViewHolder> {

    private List<Hymn> hymnList;

    public static class HymnViewHolder extends RecyclerView.ViewHolder {
        public TextView hymnTitle, hymnSubtitle;

        public HymnViewHolder(View view) {
            super(view);
            hymnTitle = view.findViewById(R.id.hymnTitle);
            hymnSubtitle = view.findViewById(R.id.hymnSubtitle);
        }
    }

    public HymnAdapter(List<Hymn> hymnList) {
        this.hymnList = hymnList;
    }

    @NonNull
    @Override
    public HymnViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hymn_card, parent, false);
        return new HymnViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HymnViewHolder holder, int position) {
        Hymn hymn = hymnList.get(position);
        holder.hymnTitle.setText(hymn.getTitle());
        holder.hymnSubtitle.setText(hymn.getSubtitle());
    }

    @Override
    public int getItemCount() {
        return hymnList.size();
    }
}

