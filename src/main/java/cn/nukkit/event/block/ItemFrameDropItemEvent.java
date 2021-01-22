package cn.nukkit.event.block;

import cn.nukkit.Player;
import cn.nukkit.block.Block;
import cn.nukkit.blockentity.BlockEntityItemFrame;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;
import cn.nukkit.item.Item;

/**
 * Event for Item Frame Drops.
 * @author Pub4Game on 03.07.2016.
 */
public class ItemFrameDropItemEvent extends BlockEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final Item item;
    private final BlockEntityItemFrame itemFrame;

    /**
     * Event for when an item frame drops an item that it is containing.
     * @param player Player related to the event. Contains player data.
     * @param block Block (Item frame) affected by change. Contains block data
     * @param itemFrame ItemFrame that has been affected.
     * @param item Item that is dropped/contained in the item
     */
    public ItemFrameDropItemEvent(Player player, Block block, BlockEntityItemFrame itemFrame, Item item) {
        super(block);
        this.player = player;
        this.itemFrame = itemFrame;
        this.item = item;
    }

    public static HandlerList getHandlers() {
        return handlers;
    }

    public Player getPlayer() {
        return player;
    }

    public BlockEntityItemFrame getItemFrame() {
        return itemFrame;
    }

    public Item getItem() {
        return item;
    }
}