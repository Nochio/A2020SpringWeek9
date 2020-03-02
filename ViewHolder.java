package com.example.mypersonalnotes.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mypersonalnotes.R;
import com.example.mypersonalnotes.storage.MemoryStorage;

public class ViewHolder extends RecyclerView.ViewHolder {

    int rowNumber = 0;
    TextView textView;

    public ViewHolder(@NonNull View itemView){
        super(itemView);
        textView = itemView.findViewById(R.id.textViewInList);
    }
    public void setPosition(int position) {
        rowNumber = position;
        textView.setText(MemoryStorage.notes.get(position).getHead());
    }
}
