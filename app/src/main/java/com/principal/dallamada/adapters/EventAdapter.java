package com.principal.dallamada.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.principal.dallamada.R;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {

    private static final String TAG = "ChatAdapter";

    private List<String> messages;
    private List<String> titles;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView message;
        private final TextView title;




        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            message = view.findViewById(R.id.textDescriptionAdapterEvent);
            title = view.findViewById(R.id.textTituloAdapterEvent);

        }

        public TextView getTitle() {
            return title;
        }

        public TextView getMessage() {
            return message;
        }
    }

    public EventAdapter(List<String> text, List<String> title) {

        messages = text;
        titles = title;


    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_event, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        viewHolder.getMessage().setText(messages.get(position));
        viewHolder.getTitle().setText(titles.get(position));


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return messages.size();
    }
}