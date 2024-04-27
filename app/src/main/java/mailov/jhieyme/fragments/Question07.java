package mailov.jhieyme.fragments;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

import mailov.jhieyme.R;
import mailov.jhieyme.databinding.FragmentQuestion07Binding;
import mailov.jhieyme.viewmodel.ScoreViewModel;


public class Question07 extends Fragment {

    private FragmentQuestion07Binding binding;
    private MaterialButton btnCorrect;
    private MaterialButton btnCorrectX1;
    private MaterialButton btnCorrectX2;
    private MaterialButton btnCorrectX3;


    private ScoreViewModel scoreViewModel;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuestion07Binding.inflate(inflater, container, false);
        scoreViewModel = new ViewModelProvider(requireActivity()).get(ScoreViewModel.class);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnCorrect = view.findViewById(R.id.btnQ1Correct);
        btnCorrectX1 = view.findViewById(R.id.btnQ1InCorrect1);
        btnCorrectX2 = view.findViewById(R.id.btnQ1InCorrect2);
        btnCorrectX3 = view.findViewById(R.id.btnQ1InCorrect3);


        btnCorrect.setOnClickListener(v -> {
            snackbarShowUp("Sumaste + 10 puntos :) !");
            scoreViewModel.ScoreUp();

        });

        btnCorrectX1.setOnClickListener(v -> {
            snackbarShowUp("Reduciste - 10 puntos :( !");
            scoreViewModel.ScoreDown();
        });

        btnCorrectX2.setOnClickListener(v -> {
            snackbarShowUp("Reduciste - 10 puntos :( !");
            scoreViewModel.ScoreDown();
        });
        btnCorrectX3.setOnClickListener(v -> {
            snackbarShowUp("Reduciste - 10 puntos :( !");
            scoreViewModel.ScoreDown();
        });


    }

    private void snackbarShowUp(String string) {

        Snackbar snackbar = Snackbar.make(getActivity().findViewById(R.id.constraint), "", Snackbar.LENGTH_LONG);
        View custom = getLayoutInflater().inflate(R.layout.snackbar_message_success, null);

        TextView txtTitle = custom.findViewById(R.id.txt_TitleMessage);
        txtTitle.setText(string);

        snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
        @SuppressLint("RestrictedApi") Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
        snackbarLayout.setPadding(0, 0, 0, 0);

        (custom.findViewById(R.id.btnImage)).setOnClickListener(v -> {
            snackbar.dismiss();
        });
        snackbarLayout.addView(custom, 0);
        snackbar.show();
    }
}