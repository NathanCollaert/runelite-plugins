package eu.jodelahithit;

import net.runelite.client.config.*;

import java.awt.*;
import java.awt.event.KeyEvent;

@ConfigGroup("Skilling Notifications")
public interface SkillingNotificationsConfig extends Config {
    @ConfigItem(
            hidden = true,
            keyName = "enabled",
            name = "Enabled",
            description = "Toggles the overlay and plugin functionality",
            position = 0
    )
    default boolean enabled() {
        return true;
    }

    @ConfigItem(
            keyName = "toggle",
            name = "Toggle keybind",
            description = "The key which will toggle the overlay and plugin functionality",
            position = 1

    )
    default ModifierlessKeybind toggle()
    {
        return new ModifierlessKeybind(KeyEvent.VK_F5, 0);
    }

    @ConfigItem(
            keyName = "toggleFlash",
            name = "Toggle flash keybind",
            description = "The key which will toggle the notifcation flash",
            position = 2

    )
    default ModifierlessKeybind toggleFlash()
    {
        return new ModifierlessKeybind(KeyEvent.VK_F6, 0);
    }


    @Alpha
    @ConfigItem(
            keyName = "overlayColor",
            name = "Notification color",
            description = "Set the notification overlay color",
            position = 3
    )
    default Color overlayColor() {
        return new Color(1.0f, 0.0f, 0.0f, 0.5f);
    }

    @ConfigItem(
            keyName = "notificationFlash",
            name = "Notification flash",
            description = "Flash the idle overlay",
            position = 4
    )
    default boolean flash() {
        return false;
    }

    @ConfigItem(
            keyName = "notificationFade",
            name = "Notification fade duration",
            description = "Duration of the idle overlay fade",
            position = 5
    )
    default int notificationFade() {
        return 0;
    }

    @ConfigItem(
            keyName = "disableOverlayText",
            name = "Disable overlay text",
            description = "Disable the \"Skill Notification\" text on the overlay",
            position = 6
    )
    default boolean disableOverlayText() {
        return false;
    }

    @ConfigItem(
            keyName = "disableWhenWalking",
            name = "Disable overlay while walking",
            description = "Disable the idle overlay when the player is walking or running",
            position = 7
    )
    default boolean disableWhenWalking() {
        return true;
    }

    @ConfigSection(
            name = "Selected skills",
            description = "Set the selected skills that will cause a notification when idling",
            position = 20
    )
    String selectedSkills = "Selected skills";

    @ConfigItem(
            keyName = "COOKING",
            name = "Cooking",
            description = "Causes notifications when the player is not actively cooking",
            position = 21,
            section = selectedSkills
    )
    default boolean cooking() {
        return false;
    }


    @ConfigItem(
            keyName = "CRAFTING",
            name = "Crafting",
            description = "Displays notifications when the player is not actively crafting",
            position = 22,
            section = selectedSkills
    )
    default boolean crafting() {
        return false;
    }

    @ConfigItem(
            keyName = "FISHING",
            name = "Fishing",
            description = "Displays notifications when the player is not actively fishing",
            position = 23,
            section = selectedSkills
    )
    default boolean fishing() {
        return false;
    }

    @ConfigItem(
            keyName = "FIREMAKING",
            name = "Firemaking",
            description = "Displays notifications when the player is not actively firemaking",
            position = 24,
            section = selectedSkills
    )
    default boolean firemaking() {
        return false;
    }

    @ConfigItem(
            keyName = "FLETCHING",
            name = "Fletching ",
            description = "Displays notifications when the player is not actively fletching",
            position = 25,
            section = selectedSkills
    )
    default boolean fletching() {
        return false;
    }

    @ConfigItem(
            keyName = "HERBLORE",
            name = "Herblore",
            description = "Displays notifications when the player is not actively doing herblore",
            position = 26,
            section = selectedSkills
    )
    default boolean herblore() {
        return false;
    }

    @ConfigItem(
            keyName = "MINING",
            name = "Mining",
            description = "Displays notifications when the player is not actively mining",
            position = 27,
            section = selectedSkills
    )
    default boolean mining() {
        return false;
    }

    @ConfigItem(
            keyName = "WOODCUTTING",
            name = "Woodcutting",
            description = "Displays notifications when the player is not actively woodcutting",
            position = 28,
            section = selectedSkills
    )
    default boolean woodcutting() {
        return false;
    }

    @ConfigItem(
            keyName = "SMITHING",
            name = "Smithing",
            description = "Displays notifications when the player is not actively smithing",
            position = 29,
            section = selectedSkills
    )
    default boolean smithing() {
        return false;
    }

    @ConfigItem(
            keyName = "COMBAT",
            name = "Combat",
            description = "Displays notifications when the player is not in combat",
            position = 30,
            section = selectedSkills
    )
    default boolean combat() {
        return false;
    }

    @ConfigItem(
            keyName = "MANIACALMONKEYS",
            name = "Maniacal monkeys",
            description = "Displays notifications when the player is not catching maniacal monkeys",
            position = 31,
            section = selectedSkills
    )
    default boolean maniacalMonkeys() {
        return false;
    }

    @ConfigItem(
            keyName = "LUNAR",
            name = "Lunar",
            description = "Displays notifications when the player is not casting Lunar crafting spells",
            position = 32,
            section = selectedSkills
    )
    default boolean lunar() {
        return false;
    }

    @ConfigItem(
            keyName = "CUSTOMXP",
            name = "Custom XP",
            description = "Displays notifications when the player is not receiving xp drops of the configured threshold",
            position = 47,
            section = selectedSkills
    )
    default boolean customXP() {
        return false;
    }

    @ConfigItem(
            keyName = "customXPValue",
            name = "Custom XP Amount",
            description = "The amount of XP that needs to be received in order to disable the custom xp notification",
            position = 48,
            section = selectedSkills
    )
    default int customXPValue() {
        return 20;
    }

    @ConfigSection(
            name = "Extra Delays",
            description = "Set notification delays in milliseconds for individual skills. This means that it'll take longer for the notification to appear after the player started idling",
            position = 49
    )
    String delays = "Extra Delays";

    @ConfigItem(
            keyName = "WALKINGDELAYV2",
            name = "Walking delay",
            description = "Add an extra delay to notifications after walking when 'disable overlay while walking' is enabled",
            position = 50,
            section = delays
    )
    default int walkDelay() {
        return 2000;
    }

    @ConfigItem(
            keyName = "COOKINGDELAYV2",
            name = "Cooking delay",
            description = "Add an extra delay before the cooking notification",
            position = 51,
            section = delays
    )
    default int cookingDelay() {
        return 0;
    }

    @ConfigItem(
            keyName = "CRAFTINGDELAYV2",
            name = "Crafting delay",
            description = "Add an extra delay before the crafting notification",
            position = 52,
            section = delays
    )
    default int craftingDelay() {
        return 0;
    }

    @ConfigItem(
            keyName = "FISHINGDELAYV2",
            name = "Fishing delay",
            description = "Add an extra delay before the fishing notification",
            position = 53,
            section = delays
    )
    default int fishingDelay() {
        return 0;
    }

    @ConfigItem(
            keyName = "FIREMAKINGDELAYV2",
            name = "Firemaking delay",
            description = "Add an extra delay before the firemaking notification",
            position = 54,
            section = delays
    )
    default int firemakingDelay() {
        return 0;
    }

    @ConfigItem(
            keyName = "FLETCHINGDELAYV2",
            name = "Fletching delay",
            description = "Add an extra delay before the fletching notification",
            position = 55,
            section = delays
    )
    default int fletchingDelay() {
        return 0;
    }

    @ConfigItem(
            keyName = "HERBLOREDELAYV2",
            name = "Herblore delay",
            description = "Add an extra delay before the herblore notification",
            position = 56,
            section = delays
    )
    default int herbloreDelay() {
        return 0;
    }

    @ConfigItem(
            keyName = "MININGDELAYV2",
            name = "Mining delay",
            description = "Add an extra delay before the mining notification",
            position = 57,
            section = delays
    )
    default int miningDelay() {
        return 0;
    }

    @ConfigItem(
            keyName = "WOODCUTTINGDELAYV2",
            name = "Woodcutting delay",
            description = "Add an extra delay before the woodcutting notification",
            position = 58,
            section = delays
    )
    default int woodcuttingDelay() {
        return 0;
    }

    @ConfigItem(
            keyName = "SMITHINGDELAYV2",
            name = "Smithing delay",
            description = "Add an extra delay before the smithing notification",
            position = 59,
            section = delays
    )
    default int smithingDelay() {
        return 0;
    }

    @ConfigItem(
            keyName = "MANIACALMONKEYSDELAYV2",
            name = "Maniacal monkeys delay",
            description = "Add an extra delay before the maniacal monkey notification",
            position = 60,
            section = delays
    )
    default int maniacalMonkeysDelay() {
        return 0;
    }
    @ConfigItem(
            keyName = "LUNARDELAYV2",
            name = "Lunar delay",
            description = "Add an extra delay before the Lunar spell notification",
            position = 61,
            section = delays
    )
    default int lunarDelay() {
        return 0;
    }

    @ConfigItem(
            keyName = "COMBATDELAYV2",
            name = "Combat delay",
            description = "Add an extra delay before the combat notification",
            position = 62,
            section = delays
    )
    default int combatDelay() {
        return 0;
    }

    @ConfigItem(
            keyName = "CUSTOMXPDELAYV2",
            name = "Custom XP delay",
            description = "Add an extra delay before the custom XP notification",
            position = 63,
            section = delays
    )
    default int customXPDelay() {
        return 1000;
    }
}
