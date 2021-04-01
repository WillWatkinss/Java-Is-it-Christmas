/* Course: CS 335
 * Author: William Watkins
 * Project: Exercise 3, Problem 2: Is it Christmas?
 * Date: 9/13/2020
 * Purpose: Implement a GUI button that tells user if it is Christmas
 **/

import java.awt.event.*;
import javax.swing.*;
import java.time.LocalDate;

public class Christmas {

    public static void main(String[] args){

        // initialize GUI elements
        JPanel p = new JPanel();
        JFrame f = new JFrame("Is it Christmas?");
        JLabel l = new JLabel("");
        JButton b = new JButton("Is it Christmas?");

        // add action listener to button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reference for date syntax and methods:
                // https://devqa.io/java-get-current-date-time/
                LocalDate today = LocalDate.now();
                String date = today.toString();

                // Reference for substring syntax:
                // https://beginnersbook.com/2013/12/java-string-substring-method-example/#:~:text=Method%20substring()%20returns%20a,two%20variants%20of%20this%20method.

                if (date.substring(5) == "12-25") {
                    // Merry Christmas!
                    l.setText("YES");

                }
                else {
                    // not Christmas
                    l.setText("no");
                }
            }
        });


        p.add(b); // add button to panel
        p.add(l); // add label to panel
        f.add(p); // add panel to frame

        // set size
        f.setSize(500, 300);
        // set to visible
        f.setVisible(true);
        // when closed, exit program
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}