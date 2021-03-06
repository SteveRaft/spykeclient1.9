package spyke.gui;

import org.darkstorm.minecraft.gui.component.Frame;
import org.darkstorm.minecraft.gui.util.GuiManagerDisplayScreen;

import net.minecraft.client.Minecraft;
import spyke.main.Spyke;

public class UIRenderer {
	
	public static void renderAndUpdateFrames(){
		for(Frame f: Spyke.guiManager.getFrames()){
			f.update();
		}
		for(Frame f: Spyke.guiManager.getFrames()){
			if(f.isPinned() || Minecraft.getMinecraft().currentScreen instanceof GuiManagerDisplayScreen){
				f.render();
			}
		}
	}

}
