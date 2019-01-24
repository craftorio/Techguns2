package techguns.gui.widgets;

import net.minecraft.item.ItemStack;
import techguns.api.tginventory.ITGSpecialSlot;
import techguns.api.tginventory.TGSlotType;
import techguns.tileentities.operation.ItemStackHandlerPlus;
import techguns.tileentities.operation.ReactionBeamFocus;

public class SlotDrill extends SlotMachineInput {

	public SlotDrill(ItemStackHandlerPlus itemHandler, int index, int xPosition, int yPosition) {
		super(itemHandler, index, xPosition, yPosition);
	}

	@Override
	public boolean isItemValid(ItemStack item) {
		if(!item.isEmpty() && item.getItem() instanceof ITGSpecialSlot) {
			ITGSpecialSlot itm = (ITGSpecialSlot) item.getItem();
			return itm.getSlot(item)==TGSlotType.DRILL_SMALL || itm.getSlot(item)==TGSlotType.DRILL_MEDIUM || itm.getSlot(item)==TGSlotType.DRILL_LARGE;
		}
		return false;
	}

	@Override
	public int getSlotStackLimit() {
		return 1;
	}	
	
}
