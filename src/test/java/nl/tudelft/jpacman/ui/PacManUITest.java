package nl.tudelft.jpacman.ui;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import nl.tudelft.jpacman.game.Game;
import nl.tudelft.jpacman.ui.ScorePanel.ScoreFormatter;

import static org.mockito.Mockito.mock;

class PacManUITest{

    private PacManUI pacManUi;
    private Map<String, Action> buttons;
    private ScoreFormatter scoreFormatter = null;
    private Map<Integer, Action> keyMappings;

    @BeforeEach
    void setUp(){
        buttons = new LinkedHashMap<>();
        keyMappings = new HashMap<>();
    }

    @Test
    void testPacManUINULL(){
        //pacManUI = new PacManUI(mock(Game.class),  )
        try{
            pacManUi = new PacManUI(null, null, null, null);
        } catch (AssertionError e) {
            System.out.println("Exception, Null for at least one parameter");
        }
    }
}

