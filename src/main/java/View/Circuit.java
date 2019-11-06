package View;

import java.util.List;
import java.util.Random;

public class Circuit {


    void star(int quatitatparticipants,String nom){
        String[][] participant = new String[quatitatparticipants][quatitatparticipants];
        for (int i = 0; i <participant.length ; i++) {
            for (int j = 0; j < i; j++) {
                participant[i][j]= participant[i][new Random().nextInt(10)+1];
            }
        }

    }

}
