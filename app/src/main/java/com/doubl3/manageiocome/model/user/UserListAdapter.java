package com.doubl3.manageiocome.model.user;

import android.view.ViewGroup;

import com.doubl3.manageiocome.view.user.UserViewHolder;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

public class UserListAdapter extends ListAdapter<User, UserViewHolder> {

    public UserListAdapter(@NonNull DiffUtil.ItemCallback<User> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return UserViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User current = getItem(position);
        holder.bind(current.getFirstName());
    }
    public static class UserDiff extends DiffUtil.ItemCallback<User>{

        @Override
        public boolean areItemsTheSame(@NonNull User oldItem, @NonNull User newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull User oldItem, @NonNull User newItem) {
            return oldItem.getFirstName().equals(newItem.getFirstName());
        }
    }
}
