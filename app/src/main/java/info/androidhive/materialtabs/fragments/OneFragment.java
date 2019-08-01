package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment{
    private EditText txtangka;
    private EditText txtangka2;
    private Button btntambah;
    private Button btnkurang;
    private Button btnkali;
    private Button btnbagi;
    private TextView txthasil;


    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_one, container, false);
        txtangka = view.findViewById(R.id.txtangka);
        txtangka2 = view.findViewById(R.id.txtangka2);
        btntambah = view.findViewById(R.id.tambah);
        btnkurang =view.findViewById(R.id.kurang);
        btnbagi = view.findViewById(R.id.bagi);
        btnkali = view.findViewById(R.id.kali);
        txthasil = view.findViewById(R.id.hasil);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = txtangka.getText().toString();
                String angka2 = txtangka2.getText().toString();

                if (angka.equalsIgnoreCase("") || angka.trim().isEmpty() || angka.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "gaada angka", Toast.LENGTH_LONG).show();
                }else{
                    double numb= Double.parseDouble(txtangka.getText().toString());
                    double numbu= Double.parseDouble(txtangka2.getText().toString());
                    double hasil = numb + numbu;
                    txthasil.setText("hasil dari" + numb + " + " + numbu + " = " + String.valueOf(hasil));
                }
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = txtangka.getText().toString();
                String angka2 = txtangka2.getText().toString();

                if (angka.equalsIgnoreCase("") || angka.trim().isEmpty() || angka.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "gaada angka", Toast.LENGTH_LONG).show();
                }else{
                    double numb= Double.parseDouble(txtangka.getText().toString());
                    double numbu= Double.parseDouble(txtangka2.getText().toString());
                    double hasil = numb * numbu;
                    txthasil.setText("hasil dari" + numb + " x " + numbu + " = " + String.valueOf(hasil));
                }
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = txtangka.getText().toString();
                String angka2 = txtangka2.getText().toString();

                if (angka.equalsIgnoreCase("") || angka.trim().isEmpty() || angka.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "gaada angka", Toast.LENGTH_LONG).show();
                }else{
                    double numb= Double.parseDouble(txtangka.getText().toString());
                    double numbu= Double.parseDouble(txtangka2.getText().toString());
                    double hasil = numb / numbu;
                    txthasil.setText("hasil dari" + numb + " / " + numbu + " = " + String.valueOf(hasil));
                }
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka = txtangka.getText().toString();
                String angka2 = txtangka2.getText().toString();

                if (angka.equalsIgnoreCase("") || angka.trim().isEmpty() || angka.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                    Toast.makeText(getContext(), "gaada angka", Toast.LENGTH_LONG).show();
                }else{
                    double numb= Double.parseDouble(txtangka.getText().toString());
                    double numbu= Double.parseDouble(txtangka2.getText().toString());
                    double hasil = numb - numbu;
                    txthasil.setText("hasil dari" + numb + " - " + numbu + " = " + String.valueOf(hasil));
                }
            }
        });
        return view;
    }

}
