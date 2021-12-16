package com.doubl3.manageiocome.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.doubl3.manageiocome.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private Context mContext;
    private List<Item> mListItem;

    public ItemAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<Item> listItem){
        this.mListItem = listItem;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_page_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = mListItem.get(position);
        if(item == null)
            return;
        holder.mName.setText(item.getName());
    }


    @Override
    public int getItemCount() {
        if(this.mListItem != null)
            return mListItem.size();
        return 0;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{

        private TextView mName;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            mName = itemView.findViewById(R.id.item_name);
        }
    }
}
