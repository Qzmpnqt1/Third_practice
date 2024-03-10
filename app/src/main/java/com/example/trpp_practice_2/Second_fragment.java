// Second_fragment.java
package com.example.trpp_practice_2;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.example.trpp_practice_2.databinding.SecondFragmentBinding;

public class Second_fragment extends Fragment {

    private SecondFragmentBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = SecondFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        // Получаем переданный текст из аргументов
        String receivedText = getArguments().getString("data_key", "");

        // Устанавливаем текст в TextView
        binding.secondTextView.setText(receivedText);

        // Обработка жизненного цикла фрагмента
        Log.d("Second_fragment", "onCreateView");
        Toast.makeText(requireContext(), "Second_fragment: onCreateView", Toast.LENGTH_SHORT).show();

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Second_fragment", "onStart");
        Toast.makeText(requireContext(), "Second_fragment: onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Second_fragment", "onResume");
        Toast.makeText(requireContext(), "Second_fragment: onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Second_fragment", "onPause");
        Toast.makeText(requireContext(), "Second_fragment: onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Second_fragment", "onStop");
        Toast.makeText(requireContext(), "Second_fragment: onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Second_fragment", "onDestroyView");
        Toast.makeText(requireContext(), "Second_fragment: onDestroyView", Toast.LENGTH_SHORT).show();
    }
}
