package com.example.flowers.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.flowers.R;
import com.example.flowers.databinding.FragmentNotificationsBinding;
public class Me_page extends Fragment {

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        return inflater.inflate(R.layout.me, container, false );


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
