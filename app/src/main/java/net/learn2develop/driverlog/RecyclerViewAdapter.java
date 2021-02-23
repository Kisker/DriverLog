package net.learn2develop.driverlog;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import net.learn2develop.driverlog.databinding.DriverLogItemBinding;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Details> list;

    public RecyclerViewAdapter(List<Details> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        DriverLogItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.driver_log_item, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.text1Details1.setText(list.get(position).getDetails1());
        holder.binding.text2Details1.setText(list.get(position).getDetails2());
        holder.binding.text3Details1.setText(list.get(position).getDetails3());
        holder.binding.text4Details1.setText(list.get(position).getDetails4());
        holder.binding.text5Details1.setText(list.get(position).getDetails5());
        holder.binding.imageDetails1.setImageDrawable(list.get(position).getImage1());
        holder.binding.image2Details1.setImageDrawable(list.get(position).getImage2());
        holder.binding.image3Details1.setImageDrawable(list.get(position).getImage3());
        holder.binding.image4Details1.setImageDrawable(list.get(position).getImage4());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private DriverLogItemBinding binding;

        public ViewHolder(@NonNull DriverLogItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
