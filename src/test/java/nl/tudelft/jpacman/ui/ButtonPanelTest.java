package nl.tudelft.jpacman.ui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class ButtonPanelTest{

    private Map<String, Action> buttons;
    @BeforeEach
    void setUp(){
        buttons = new LinkedHashMap<>();
    }

    @Test
    void testButtonPanelNotNull(){
        JPanel buttonPanel = new ButtonPanel(buttons, mock(PacManUI.class));
        assertThat(buttonPanel).isNotNull();

    }

    @Test
    void testButtonPanelBothNull(){
        try {
            JPanel buttonPanel = new ButtonPanel(null, null);
            //assertThat(buttonPanel).isNull();
        } catch (AssertionError e)
        {
            System.out.println("Exception, Null for at least one parameter");
        }

    }
}


