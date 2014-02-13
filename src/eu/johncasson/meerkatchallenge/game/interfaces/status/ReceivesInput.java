package eu.johncasson.meerkatchallenge.game.interfaces.status;

import android.view.MotionEvent;
import android.view.View;
/**
 * Implemented by classes that can receive updates about input
 * @author John Casson
 *
 */
public interface ReceivesInput {
	/**
	 * When an input event is received
	 * @param view The source of the input event
	 * @param ev The event
	 */
	public void onInput(View view, MotionEvent ev);
}
