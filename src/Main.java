import java.awt.Color;

public class Main {
    public static void main(String[] args) throws Exception {
        NFrame frame = new NFrame(750,900);
        
        //StyleKits
        StyleKit defaultButton = new StyleKit(Color.WHITE, Color.RED, 10);
        
        //Buttons
        frame.createButton("Add Pokemon", 10,10,140,50, defaultButton);
        

        //Set Action
        frame.setScopedButton(frame.getButtons().get(0));
        MButton addPokemon = frame.getScopedButton();
        addPokemon.setActionCode("ADD_POKEMON");
        addPokemon.setText("Add Pokémon");

        //NFrame Mods
        frame.setBackground(Color.BLACK);
        frame.setTitle("PokéSync");

        

    }
}
