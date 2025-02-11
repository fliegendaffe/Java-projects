import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //creation of GUI
        JFrame frame = new JFrame("Nom Nom Randomizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JLabel label = new JLabel("Click 'FEED ME' to decide your food consumption!");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JButton button = new JButton("FEED ME");
        JLabel result = new JLabel("");
        result.setHorizontalAlignment(SwingConstants.CENTER);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] options = {
                        //Add a list of normal food options. If it is home cooked food, add "at home" after the food type.
                        "Spaghetti at home",
                        "Tacos at home",
                        "Pizza at home",
                        "Grilled chicken at home",
                        "Hanabis",
                        "Burger King",
                        "Korean Chicken",
                        "Hunt’s Brothers Pizza",
                        "Arby’s",
                        "Breakfast Food",
                        "Lasagna at home"
                };
                Random random = new Random();
                int index = random.nextInt(options.length);
                result.setText("Go devour: " + options[index]);
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.NORTH);
        frame.add(button, BorderLayout.CENTER);
        frame.add(result, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}