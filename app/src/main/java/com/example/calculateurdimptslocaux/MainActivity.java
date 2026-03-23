package com.example.calculateurdimptslocaux;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Déclaration des éléments de l'interface
    private EditText nomInput, adresseInput, surfaceInput, piecesInput;
    private CheckBox piscineCheckbox;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison XML <-> Java
        nomInput = findViewById(R.id.input_nom);
        adresseInput = findViewById(R.id.input_adresse);
        surfaceInput = findViewById(R.id.input_surface);
        piecesInput = findViewById(R.id.input_pieces);
        piscineCheckbox = findViewById(R.id.checkbox_piscine);
        resultView = findViewById(R.id.result);

        // Écouteur du bouton "Calcul"
        findViewById(R.id.button_calcul).setOnClickListener(v -> calculer());
    }

    private void calculer() {
        // Lecture des valeurs saisies
        String nom = nomInput.getText().toString();
        String adresse = adresseInput.getText().toString();
        double surface = Double.parseDouble(surfaceInput.getText().toString());
        int pieces = Integer.parseInt(piecesInput.getText().toString());
        boolean piscine = piscineCheckbox.isChecked();

        // Calcul des impôts
        double impotBase = surface * 2;
        double supplement = pieces * 50 + (piscine ? 100 : 0);
        double total = impotBase + supplement;

        // Affichage détaillé du résultat comme sur l'image
        resultView.setText(
                "Impôt de base : " + impotBase + "\n" +
                        "Impôt supplémentaire : " + supplement + "\n" +
                        "Impôt Total : " + total
        );
    }
}

