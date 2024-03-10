// First_fragment.java
package com.example.trpp_practice_2;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.example.trpp_practice_2.databinding.FirstFragmentBinding;

public class First_fragment extends Fragment {

    private FirstFragmentBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FirstFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.mainImage.setImageResource(R.drawable.page1_img1);

        binding.mainButton.setOnClickListener(view1 -> {
            // Получаем введенный текст из EditText
            String enteredText = binding.mainEditText.getText().toString();

            // Создаем новый экземпляр Second_fragment
            Second_fragment secondFragment = new Second_fragment();

            // Передаем введенный текст во второй фрагмент
            Bundle args = new Bundle();
            args.putString("data_key", enteredText);
            secondFragment.setArguments(args);

            // Заменяем текущий фрагмент на второй
            FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, secondFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });

        // Обработка жизненного цикла фрагмента
        Log.d("First_fragment", "onCreateView");
        Toast.makeText(requireContext(), "First_fragment: onCreateView", Toast.LENGTH_SHORT).show();

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("First_fragment", "onStart");
        Toast.makeText(requireContext(), "First_fragment: onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("First_fragment", "onResume");
        Toast.makeText(requireContext(), "First_fragment: onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("First_fragment", "onPause");
        Toast.makeText(requireContext(), "First_fragment: onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("First_fragment", "onStop");
        Toast.makeText(requireContext(), "First_fragment: onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("First_fragment", "onDestroyView");
        Toast.makeText(requireContext(), "First_fragment: onDestroyView", Toast.LENGTH_SHORT).show();
    }
}
