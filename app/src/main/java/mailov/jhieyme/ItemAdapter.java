package mailov.jhieyme;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import mailov.jhieyme.databinding.ItemRecyclerBinding;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ShowViewHolder> {

    private List<Item> items;


    public ItemAdapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ItemAdapter.ShowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRecyclerBinding binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ItemAdapter.ShowViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ShowViewHolder holder, int position) {
        holder.bind(items.get(position));

        holder.itemView.setOnClickListener(v -> {
            Item itemSelected = items.get(position);
            Intent intent = new Intent(v.getContext(), Jhieyme.class);
            v.getContext().startActivity(intent);


        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ShowViewHolder extends RecyclerView.ViewHolder {
        private ItemRecyclerBinding binding;

        public ShowViewHolder(@NonNull ItemRecyclerBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Item item) {

            Glide.with(itemView.getContext()).load(item.getImage()).into(binding.image);


        }
    }
}