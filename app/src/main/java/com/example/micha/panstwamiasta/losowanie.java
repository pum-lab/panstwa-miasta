package com.example.micha.panstwamiasta;


<<<<<<< HEAD
import android.app.Activity;
=======
>>>>>>> origin/master
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

<<<<<<< HEAD
import java.io.IOException;

=======
>>>>>>> origin/master

public class losowanie extends Fragment {

    Button losuj;
    TextView litera;

<<<<<<< HEAD
=======

>>>>>>> origin/master
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_losowanie, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        losuj = (Button) view.findViewById(R.id.losowanko);
        litera = (TextView) view.findViewById(R.id.wylosowana);

        losuj.setOnClickListener(losujOnClickListener);

<<<<<<< HEAD
        losujlitere();
    }


    private void losujlitere() {

        String[] chars = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "W", "Z"};
        litera.setText(chars[(int) (Math.random() * 22)]);

        String wysylka = (chars[(int) (Math.random() * 22)]);


        /*Stąd trzeba wysłać zmienną "wysylka" do MainActivity2Activity
        *
        * mniej więcej tak jak to pod spodem ale to nie działa*/

         Intent i = new Intent(losowanie.this.getActivity(), MainActivity2Activity.class);
        i.putExtra("wysylka", wysylka);
        startActivity(i);
    }


=======
        String[] chars = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "W", "Z"};
        litera.setText(chars[(int) (Math.random() * 22)]);
    }

>>>>>>> origin/master
    public Button.OnClickListener losujOnClickListener = new Button.OnClickListener() {

        @Override
        public void onClick(View arg0) {
<<<<<<< HEAD
            losujlitere();
=======

            String[] chars = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "W", "Z"};
            litera.setText(chars[(int) (Math.random() * 22)]);
>>>>>>> origin/master
        }
    };

}
