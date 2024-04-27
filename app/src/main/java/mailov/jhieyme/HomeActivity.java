package mailov.jhieyme;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import mailov.jhieyme.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {


    private ActivityHomeBinding binding;

    private RecyclerView rv;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.rv.findViewById(R.id.rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        binding.rv.setLayoutManager(layoutManager);

        List<Item> itemsToAdapter = loadItems();

        adapter = new ItemAdapter(itemsToAdapter);
        binding.rv.setAdapter(adapter);


    }


    private List<Item> loadItems() {


        List<Item> items = new ArrayList<Item>();

        Item i1 = new Item("1", "1", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCbj-a_o-OLFdy-lldLGwp1vXksJOZz0M60S6FERYTRHcBifG4eqMZk9KpyW9XH22uTkI&usqp=CAU");
        Item i2 = new Item("2", "2", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOErX-d1pG-Q-7DxF9Ep3_WCqbxmHX0XaWGLFXwOeRoBWLsJKpjJg82b2BIvW2Rn3RuUA&usqp=CAU");

        Item i3 = new Item("3", "3", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCbj-a_o-OLFdy-lldLGwp1vXksJOZz0M60S6FERYTRHcBifG4eqMZk9KpyW9XH22uTkI&usqp=CAU");
        Item i4 = new Item("4", "4", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOErX-d1pG-Q-7DxF9Ep3_WCqbxmHX0XaWGLFXwOeRoBWLsJKpjJg82b2BIvW2Rn3RuUA&usqp=CAU");

        Item i5 = new Item("5", "5", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCbj-a_o-OLFdy-lldLGwp1vXksJOZz0M60S6FERYTRHcBifG4eqMZk9KpyW9XH22uTkI&usqp=CAU");
        Item i6 = new Item("6", "6", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOErX-d1pG-Q-7DxF9Ep3_WCqbxmHX0XaWGLFXwOeRoBWLsJKpjJg82b2BIvW2Rn3RuUA&usqp=CAU");

        Item i7 = new Item("7", "7", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCbj-a_o-OLFdy-lldLGwp1vXksJOZz0M60S6FERYTRHcBifG4eqMZk9KpyW9XH22uTkI&usqp=CAU");
        Item i8 = new Item("8", "8", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOErX-d1pG-Q-7DxF9Ep3_WCqbxmHX0XaWGLFXwOeRoBWLsJKpjJg82b2BIvW2Rn3RuUA&usqp=CAU");

        Item i9 = new Item("9", "9", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCbj-a_o-OLFdy-lldLGwp1vXksJOZz0M60S6FERYTRHcBifG4eqMZk9KpyW9XH22uTkI&usqp=CAU");
        Item i10 = new Item("10", "10", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOErX-d1pG-Q-7DxF9Ep3_WCqbxmHX0XaWGLFXwOeRoBWLsJKpjJg82b2BIvW2Rn3RuUA&usqp=CAU");

        Item i11 = new Item("11", "11", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCbj-a_o-OLFdy-lldLGwp1vXksJOZz0M60S6FERYTRHcBifG4eqMZk9KpyW9XH22uTkI&usqp=CAU");
        Item i12 = new Item("12", "12", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOErX-d1pG-Q-7DxF9Ep3_WCqbxmHX0XaWGLFXwOeRoBWLsJKpjJg82b2BIvW2Rn3RuUA&usqp=CAU");


        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        items.add(i5);
        items.add(i6);
        items.add(i7);
        items.add(i8);
        items.add(i9);
        items.add(i10);
        items.add(i11);
        items.add(i12);

        return items;


    }


}